/**
 * Triangle array code
 * This code presents the use to multidimensional array.
 * Along with its creation
 * 
 * @author Shivang Dholaria
 */
public class TriangleArray1 {
    public static void main(String[] args) {
        int[][] tri = new int[5][];
        
        for (int i = 0; i < tri.length; i++) {
            tri[i] = new int[i+1];
            for (int j = 0; j < tri[i].length; j++) {
                tri[i][j] = i + j + 1;
            }
        }

        for (int i = 0; i < tri.length; i++) {
            for (int j = 0; j < tri[i].length; j++) {
                System.out.print(tri[i][j]);
            }
            System.out.println();
        }
    }
}