public class arreglos {
    public static void main(String[] args)  {
    int [][] matriz = {
        {30, 20, 40},
        {21, 35, 45},
        {33, 55, 67}
        };
        //matriz [0] = {30, 20, 40};
        //matriz [1] = {30, 20, 40};
        //matriz [2] = {30, 20, 40};
        
        int longitudArreglo = matriz.length;
        for (int i = 0; i < longitudArreglo; i++){
            for (int j = 0; j < longitudArreglo; j++) {
                System.out.println(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}

        //int[][] matriz = new int [3][3];
        //matriz [0][0]=10;
        //matriz [0][1]=20;
        //matriz [0][2]=30;
        //matriz [0][3]=40;
        //matriz [1][0]=50;
        //matriz [1][1]=60;
        //matriz [1][2]=70;
        //matriz [2][0]=80;
        //matriz [2][1]=90;
        //for (int[] filas : matriz) {
            //for (int numeros : filas) {
                //System.out.println(numeros + " ");
            //}
            //System.out.println();
        //}
