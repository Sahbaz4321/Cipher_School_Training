package Access1;

public class MultiDimensionalArray {

    public static void main(String[] args) {
        int rows = 3;
        int cols = 2;
        int a[][] = new int[rows][cols];
        System.out.println("2D Array :");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        int b[][] = {{1, 2, 3}, {4, 5, 7}, {7, 8, 9}};
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
        int c[][]=new int[3][];
        c[0]=new int[]{1,2,3};
        c[1]=new int[]{4,6};
        c[2]=new int[]{1};
        System.out.println("Jagged Array :");
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }

}
