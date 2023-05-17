public class DoubleLinkedListsMain {
    public static void main(String[] args) throws Exception {
        DoubleLinkedList dll = new DoubleLinkedList();
        dll.cetak();
        System.out.println("Ukuran: " + dll.ukuran());
        System.out.println("================================");
        dll.addFirst(3);
        dll.addLast(4);
        dll.addFirst(7);
        dll.cetak();
        System.out.println("Ukuran: " + dll.ukuran());
        System.out.println("==================================");
        dll.add(40, 1);
        dll.cetak();
        System.out.println("Ukuran: " + dll.ukuran());
        System.out.println("==================================");
        dll.clear();
        dll.cetak();
        System.out.println("Ukuran: " + dll.ukuran());

        dll.addLast(50);
        dll.addLast(40);
        dll.addLast(10);
        dll.addLast(20);
        dll.cetak();
        System.out.println("Ukuran: " + dll.ukuran());
        System.out.println("==================================");
        dll.removeFirst();
        dll.cetak();
        System.out.println("Ukuran: " + dll.ukuran());
        System.out.println("==================================");
        dll.removeLast();
        dll.cetak();
        System.out.println("Ukuran: " + dll.ukuran());
        System.out.println("==================================");
        dll.remove(1);
        dll.cetak();
        System.out.println("Ukuran: " + dll.ukuran());

        dll.cetak();
        System.out.println("Ukuran: " + dll.ukuran());
        System.out.println("==================================");
        dll.addFirst(3);
        dll.addLast(4);
        dll.addFirst(7);
        dll.cetak();
        System.out.println("Ukuran: " + dll.ukuran());
        System.out.println("==================================");
        dll.add(40, 1);
        dll.cetak();
        System.out.println("Ukuran: " + dll.ukuran());
        System.out.println("==================================");
        System.out.println("Data awal pada Linked Lists: " + dll.getFirst());
        System.out.println("Data akhir pada Linked Lists: " + dll.getLast());
        System.out.println("Data indeks pertama pada Linked List: " + dll.get(1));
    }
}
