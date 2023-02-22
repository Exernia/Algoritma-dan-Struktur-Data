public class Tugas2 {
    int x19D, y19D, width19D, height19D;

    Tugas2(int x19D, int y19D, int width19D, int height19D) {
        this.x19D = x19D;
        this.y19D = y19D;
        this.width19D = width19D;
        this.height19D = height19D;
    }

    void moveLeft19D() {
        x19D -= 1;
        if ((x19D > -1 && x19D < width19D) && (y19D > -1 && y19D < height19D)) {
            System.out.println("Jalan ke kiri satu langkah");
            printPosition19D();
        } else {
            detectCollision19D(x19D, y19D);
        }
    }

    void moveRight19D() {
        x19D += 1;
        if ((x19D > -1 && x19D < width19D) && (y19D > -1 && y19D < height19D)) {
            System.out.println("Jalan ke kanan satu langkah");
            printPosition19D();
        } else {
            detectCollision19D(x19D, y19D);
        }
    }

    void moveUp19D() {
        y19D += 1;
        if ((x19D > -1 && x19D < width19D) && (y19D > -1 && y19D < height19D)) {
            System.out.println("Jalan ke atas satu langkah");
            printPosition19D();
        } else {
            detectCollision19D(x19D, y19D);
        }
    }

    void moveDown19D() {
        y19D -= 1;
        if ((x19D > -1 && x19D < width19D) && (y19D > -1 && y19D < height19D)) {
            System.out.println("Jalan ke bawah satu langkah");
            printPosition19D();
        } else {
            detectCollision19D(x19D, y19D);
        }
    }

    void printPosition19D() {
        System.out.printf("Posisi Anda sekarang berada di X: %d Y: %d\n", x19D, y19D);
    }

    void detectCollision19D(int x19D, int y19D) {
        System.out.println("Game Over!!!");
    }

    public static void main(String[] args) {
        System.out.println("\n===================== Ular 1 =====================\n");
        Tugas2 ular1 = new Tugas2(0, 0, 100, 100);
        ular1.moveUp19D();
        ular1.moveUp19D();
        ular1.moveRight19D();
        ular1.moveUp19D();
        ular1.moveLeft19D();
        ular1.moveDown19D();
        ular1.moveLeft19D();

        System.out.println("\n===================== Ular 2 =====================\n");
        Tugas2 ular2 = new Tugas2(99, 99, 100, 100);
        ular2.moveDown19D();
        ular2.moveLeft19D();
        ular2.moveDown19D();
        ular2.moveRight19D();
        ular2.moveRight19D();
    }
}
