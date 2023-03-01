public class ContohArrayOfObject2D {
    public static void main(String[] args) {
        PersegiPanjang19D[][] ArrayOfObject2D = new PersegiPanjang19D[2][2];
        for (int i = 0; i < ArrayOfObject2D.length; i++) {
            for (int j = 0; j < ArrayOfObject2D[i].length; j++) {
                ArrayOfObject2D[i][j] = new PersegiPanjang19D();
                ArrayOfObject2D[i][j].panjang = i + 1;
                ArrayOfObject2D[i][j].lebar = j + 1;
            }
        }

        for (int i = 0; i < ArrayOfObject2D.length; i++) {
            for (int j = 0; j < ArrayOfObject2D[i].length; j++) {
                System.out.printf("Persegi panjang kolom %d baris %d, Panjang: %d, Lebar: %d\n", (i + 1), (j + 1),
                        ArrayOfObject2D[i][j].panjang,
                        ArrayOfObject2D[i][j].lebar);
            }
        }
    }
}
