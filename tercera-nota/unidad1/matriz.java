public class matriz {
    public static void main(String[] args) {

    int matriz[][] = {
        {10, 20, 30},
        {40, 50 ,60},
        {70, 80, 90}
    };

    int longitudArreglo = matriz.length;
    for (int i=0 ; i < longitudArreglo; i++) {
        for (int j=0 ; j <longitudArreglo; j++) {
            System.out.print(matriz [i][j] + " ");
        }
    System.out.println();

    }
}
}
