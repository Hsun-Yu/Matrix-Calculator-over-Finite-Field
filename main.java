

public class main {
    public static void main(String args[]) {
        System.out.println(GF256.add(85, 95));
        System.out.println(GF256.sub(85, 95));
        System.out.println(GF256.mult(85, 95));
        System.out.println(GF256.div(85, 95));
        
        GF256Matrix matrix1 = new GF256Matrix(new int[][]{
            {2, 5, 9},
            {5, 7, 6},
            {4, 8, 1}
        }); 

        GF256Matrix matrix2 = matrix1.inverse();
        System.out.println("");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(matrix2.getElement(i, j) + " ");
            }
            System.out.println("");
        }
        GF256Matrix matrix3 = GF256Matrix.matrixMultiply(matrix1, matrix2);
        System.out.println("");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(matrix3.getElement(i, j) + " ");
            }
            System.out.println("");
        }

        System.out.println();
        int[] vector = new int[]{
            1, 2, 3
        };
        int[] packet = matrix1.rightMultiply(vector);
        for(int i = 0; i < packet.length; i++) {
            System.out.print(packet[i] + " ");
        }
        System.out.println();

        System.out.println();
        int[] ans = matrix2.rightMultiply(packet);
        for(int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println();
    } 
}