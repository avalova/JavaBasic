public class Multideminsional_Array {
    public static void main(String[] args){
        int[] number = {1,2,3,4,5};
        int[][] matrix = {{1,1,1,1},
                          {5,1,4,1},
                          {5,6,2}};

        for (int i=0; i<matrix.length; i++){
            for (int j=0; j< matrix[i].length; j++){
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
        }

    }
}
