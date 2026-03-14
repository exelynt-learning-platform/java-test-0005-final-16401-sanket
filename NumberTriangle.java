
public class NumberTriangle {
    public static void main(String[] args) {
        
        int n = 5;

        int num = 1; 

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(num);
                if (col < row) System.out.print(" "); 
                num++;
            }
            System.out.println();
        }
    }
}