class 3Q.1{
    public static void main(String[] args) {
        int sum = 0;

        // Loop to calculate the sum of the first 50 natural numbers
        for (int i = 1; i <= 50; i++) {
            sum = sum+ i;  // Add each number to the sum
        }

        // Print the result
        System.out.println("The sum of the first 50 natural numbers is: " + sum);
    }
}