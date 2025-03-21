package array;

public class One_d {
	Scanner scanner = new Scanner(System.in);

    // Input for 1D array
    System.out.print("Enter the size of the 1D array: ");
    int size1D = scanner.nextInt();
    int[] array1D = new int[size1D];

    System.out.println("Enter the elements of the 1D array:");
    for (int i = 0; i < size1D; i++) {
        array1D[i] = scanner.nextInt();
    }

}

public class ArrayInputDisplay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for 1D array
        System.out.print("Enter the size of the 1D array: ");
        int size1D = scanner.nextInt();
        int[] array1D = new int[size1D];

        System.out.println("Enter the elements of the 1D array:");
        for (int i = 0; i < size1D; i++) {
            array1D[i] = scanner.nextInt();
        }

        // Input for 2D array
        System.out.print("Enter the number of rows in the 2D array: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns in the 2D array: ");
        int columns = scanner.nextInt();
        int[][] array2D = new int[rows][columns];

        System.out.println("Enter the elements of the 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array2D[i][j] = scanner.nextInt();
            }
        }

        // Display 1D array
        System.out.println("\nThe 1D array is:");
        for (int num : array1D) {
            System.out.print(num + " ");
        }

        // Display 2D array
        System.out.println("\n\nThe 2D array is:");
        for