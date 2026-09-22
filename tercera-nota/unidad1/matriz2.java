public class matriz2 {
    public static void main(String[] args) {

    int[][] matriz = new int [3][3];
        matriz [0][0]=10;
        matriz [0][1]=20;
        matriz [0][2]=30;
        matriz [0][3]=40;
        matriz [1][0]=50;
        matriz [1][1]=60;
        matriz [1][2]=70;
        matriz [2][0]=80;
        matriz [2][1]=90;
    for (int filas : matriz) {
        for (int numeros : filas) {
            System.out.print(numeros + " ");
       
        }
    System.out.println();
    }
    }
}
