import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ContohList {

    static void pembatas() {
        System.out.println("=================================================");
    }

    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        pembatas();
        System.out.printf("Elemen 0: %s\nTotal elemen: %d\nElemen terakhir: %s\n", l.get(0), l.size(),
                l.get(l.size() - 1));
        l.remove(0);
        pembatas();
        System.out.printf("Elemen 0: %s\nTotal elemen: %d\nElemen terakhir: %s\n", l.get(0), l.size(),
                l.get(l.size() - 1));
        pembatas();

        LinkedList<String> names = new LinkedList<>();
        names.add("Noureen");
        names.add("Akhleema");
        names.add("Shannum");
        names.add("Uwais");
        names.add("Al-Qarni");

        System.out.printf("Elemen 0: %s\nTotal elemen: %s\nElemen terakhir: %s\n", names.get(0), names.size(),
                names.get(names.size() - 1));
        names.set(0, "My Kid");
        pembatas();
        System.out.printf("Elemen 0: %s\nTotal elemen: %s\nElemen terakhir: %s\n", names.get(0), names.size(),
                names.get(names.size() - 1));
        pembatas();
        System.out.println("Nama: " + names.toString());
        
        names.push("Mei-Mei");
        System.out.printf("Elemen 0: %s\nTotal elemen: %s\nElemen terakhir: %s\n", names.get(0), names.size(),
                names.get(names.size() - 1));
        pembatas();
        System.out.println("Nama: " + names.toString());

    }
}
