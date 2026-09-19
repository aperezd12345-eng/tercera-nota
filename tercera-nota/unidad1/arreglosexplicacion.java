public class arreglosexplicacion {
 public static void main(String[] args) {
        float notaestudiante2= 3.5f;
        float notaestudiante3 = 2.9f;
        float notaestudiante4 = 3.7f;
        float notaestudiante5 = 3.0f;
        
        float[] notas = new float[5];
        notas[0]= 4.2f;
        notas[1]= 3.5f;
        notas[2]= 2.9f;
        notas[3]= 3.7f;
        notas[4]= 3.0f;
        for (float nota : notas){
            System.out.println(nota);
        }
        //System.out.println(notas[3]);


        int[] numeros = {18, 33, 34, 4, 6};
        System.out.println(numeros[4]);


    }
    
}
