public class SpiralMatrix {

    public static void spiralMatrixPrint(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;

        // Defining the boundaries of the matrix.
        int top = 0, bottom = rows - 1, left = 0, right = cols - 1;

        // Initialize the direction.
        int dir = 0;

        int[] result = new int[rows * cols];
        int idx = 0;

        while (top <= bottom && left <= right) {
            // Traverse the current boundary in the specified direction.
            if (dir == 0) {
                for (int i = left; i <= right; i++) {
                    result[idx++] = arr[top][i];
                }
                top++;
            } else if (dir == 1) {
                for (int i = top; i <= bottom; i++) {
                    result[idx++] = arr[i][right];
                }
                right--;
            } else if (dir == 2) {
                for (int i = right; i >= left; i--) {
                    result[idx++] = arr[bottom][i];
                }
                bottom--;
            } else {
                for (int i = bottom; i >= top; i--) {
                    result[idx++] = arr[i][left];
                }
                left++;
            }

            // Increment the direction.
            dir = (dir + 1) % 4;
        }

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        spiralMatrixPrint(arr);
    }
}

