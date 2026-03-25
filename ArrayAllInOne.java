public class ArrayAllInOne {

    public static void main(String[] args) {

        // ----------- 1. Validate Input using System.err and exit() -----------
        if (args.length == 0) {
            System.err.println("Error: No command-line arguments provided!");
            System.exit(1);
        }

        // ----------- 2. Create 1D Array (from command-line input) -----------
        int size = args.length;
        int[] numbers = new int[size];

        // Convert input strings to integers
        for (int i = 0; i < size; i++) {
            numbers[i] = Integer.parseInt(args[i]);
        }

        // ----------- 3. Access Array Elements -----------
        System.out.println("Accessing Elements:");
        System.out.println("First element: " + numbers[0]);

        // ----------- 4. Using for loop with length -----------
        System.out.println("\nUsing for loop:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index " + i + " -> " + numbers[i]);
        }

        // ----------- 5. Modify Array -----------
        if (numbers.length > 2) {
            numbers[2] = 999;
            System.out.println("\nAfter Modification (index 2 changed to 999):");
            for (int i = 0; i < numbers.length; i++) {
                System.out.println(numbers[i]);
            }
        }

        // ----------- 6. Multi-Dimensional Array (2D Matrix) -----------
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // ----------- 7. Access 2D Array -----------
        System.out.println("\n2D Array (Matrix):");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // ----------- 8. Size of Multi-Dimensional Array -----------
        System.out.println("\nMatrix Rows: " + matrix.length);
        System.out.println("Matrix Columns (first row): " + matrix[0].length);

        // ----------- 9. Final Output -----------
        System.out.println("\nProgram executed successfully!");
    }
}