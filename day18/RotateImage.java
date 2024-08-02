public class RotateImage {
    class Solution {
        public void rotate(int[][] matrix) {
            // int n = matrix.length;
            
            for(int i =0; i<matrix.length;i++){
                for(int j =i;j<matrix.length;j++){
                    int t = matrix[i][j];
                    matrix[i][j]= matrix[j][i];
                    matrix[j][i]=t;
                }
            }
            for(int i =0; i<matrix.length;i++){
                int st=0, en =matrix.length-1;
                while(st<en ){
                    int t = matrix[i][st];
                    matrix[i][st++]=matrix[i][en];
                    matrix[i][en--]=t;
                }
            }
        }
    }
}
