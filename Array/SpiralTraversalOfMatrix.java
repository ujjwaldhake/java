public class SpiralTraversalOfMatrix {

    public static void main(String[] args) {

        int[][] arr = {
                { 10, 20, 30 },
                { 40, 50, 60 },
                { 70, 80, 90 }
        };

        int top = 0;
        int bottom = arr.length - 1;

        int left = 0;
        int right = arr[0].length - 1;

        while (top <= bottom && left <= right) {

            // Left to Right
            for (int i = left; i <= right; i++) {
                System.out.print(arr[top][i] + " ");
            }
            top++;

            // Top to Bottom
            for (int i = top; i <= bottom; i++) {
                System.out.print(arr[i][right] + " ");
            }
            right--;

            // Right to Left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(arr[bottom][i] + " ");
                }
                bottom--;
            }

            // Bottom to Top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(arr[i][left] + " ");
                }
                left++;
            }
        }
    }
}
