package Latihan1;

public class SLLMain {
    public static void main(String[] args) {
        SingleLinkedList singLL = new SingleLinkedList();
        singLL.cetak();
        singLL.addFirst(890);
        singLL.cetak();
        singLL.addLast(760);
        singLL.cetak();
        singLL.addFirst(700);
        singLL.cetak();
        singLL.insertAfter(700, 999);
        singLL.cetak();
        singLL.insertAt(3, 833);
        singLL.cetak();

        System.out.println("Data pada indeks ke-1 = " + singLL.getData(1));
        System.out.println("Data 3 berada pada indeks ke-" + singLL.indeksOf(760));

        singLL.remove(999);
        singLL.cetak();
        singLL.removeAt(0);
        singLL.cetak();
        singLL.removeFirst();
        singLL.cetak();
        singLL.removeLast();
        singLL.cetak();
    }
}
