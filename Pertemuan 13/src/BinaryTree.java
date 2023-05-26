public class BinaryTree {
    Node root;
    int jmlLeaf = 0;

    public BinaryTree() {
        root = null;
    }

    boolean isEmpty() {
        return root == null;
    }

    void add(int data) {
        if (isEmpty()) {
            root = new Node(data);
        } else {
            Node current = root;
            while (true) {
                if (data < current.data) {
                    if (current.kiri != null) {
                        current = current.kiri;
                    } else {
                        current.kiri = new Node(data);
                        break;
                    }
                } else if (data < current.data) {
                    if (current.kanan != null) {
                        current = current.kanan;
                    } else {
                        current.kanan = new Node(data);
                        break;
                    }
                } else {
                    break;
                }
            }
        }
    }

    boolean find(int data) {
        boolean hasil = false;
        Node current = root;
        while (current != null) {
            if (current.data == data) {
                hasil = true;
                break;
            } else if (data < current.data) {
                current = current.kiri;
            } else {
                current = current.kanan;
            }
        }
        return hasil;
    }

    void traversePreOrder(Node node) {
        if (node != null) {
            System.out.println(" " + node.data);
            traversePreOrder(node.kiri);
            traversePreOrder(node.kanan);
        }
    }

    void traversePostOrder(Node node) {
        if (node != null) {
            traversePostOrder(node.kiri);
            traversePostOrder(node.kanan);
            System.out.println(" " + node.data);
        }
    }

    void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.kiri);
            System.out.println(" " + node.data);
            traverseInOrder(node.kanan);
        }
    }

    Node getSuccessor(Node del) {
        Node successor = del.kanan;
        Node successorParent = del;
        while (successor.kiri != null) {
            successorParent = successor;
            successor = successor.kiri;
        }

        if (successor != del.kanan) {
            successorParent.kiri = successor.kanan;
            successor.kanan = del.kanan;
        }

        return successor;
    }

    void delete(int data) {
        if (isEmpty()) {
            System.out.println("Tree kosong!");
            return;
        }

        Node parent = root;
        Node current = root;

        boolean isLeftChild = false;

        while (current != null) {
            if (current.data == data) {
                break;
            } else if (data < current.data) {
                parent = current;
                current = current.kiri;
            } else if (data > current.data) {
                parent = current;
                current = current.kanan;
                isLeftChild = false;
            }
        }

        if (current == null) {
            System.out.println("Tak dapat menemukan data!");
            return;
        } else {
            if (current.kiri == null && current.kanan == null) {
                if (current == root) {
                    root = null;
                } else {
                    if (isLeftChild) {
                        parent.kiri = null;
                    } else {
                        parent.kanan = null;
                    }
                }
            } else if (current.kiri == null) {
                if (current == root) {
                    root = current.kanan;
                } else {
                    if (isLeftChild) {
                        parent.kiri = current.kanan;
                    } else {
                        parent.kanan = current.kanan;
                    }
                }
            } else if (current.kanan == null) {
                if (current == root) {
                    root = current.kiri;
                } else {
                    if (isLeftChild) {
                        parent.kiri = current.kiri;
                    } else {
                        parent.kanan = current.kanan;
                    }
                }
            } else {
                Node successor = getSuccessor(current);
                if (current == root) {
                    root = successor;
                } else {
                    if (isLeftChild) {
                        parent.kiri = successor;
                    } else {
                        parent.kanan = successor;
                    }
                    successor.kiri = current.kiri;
                }
            }
        }
    }

    void tambahDataRekursi(int data) {
        root = jalankanRekursi(root, data);
    }

    Node jalankanRekursi(Node current, int data) {
        if (current == null) {
            current = new Node(data);
            return current;
        }
        if (data < current.data) {
            current.kiri = jalankanRekursi(current.kiri, data);
        } else if (data > current.data) {
            current.kanan = jalankanRekursi(current.kanan, data);
        }
        return current;
    }

    void nilaiTerbesar() {
        if (isEmpty()) {
            System.out.println("Data kosong");

        } else {
            Node current = root;
            do {
                current = current.kanan;
            } while (current.kanan != null);
            System.out.println("Nilai terbesar adalah " + current.data);
        }
    }

    void nilaiTerkecil() {
        if (isEmpty()) {
            System.out.println("Data kosong");
        } else {
            Node current = root;
            do {
                current = current.kiri;
            } while (current.kiri != null);
            System.out.println("Nilai terkecil adalah " + current.data);
        }
    }

    void dataLeaf(Node node) {
        if (node != null) {
            if (node.kiri == null && node.kanan == null) {
                System.out.print(node.data + " ");
                ++jmlLeaf;
            }
            dataLeaf(node.kiri);
            dataLeaf(node.kanan);
        }
    }
}
