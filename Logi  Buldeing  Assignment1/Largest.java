 class Largest {

    public static void main(String[] args) {

       int a = 5, b = 3, c = 2;

        if(a>= b && a>= c)
            System.out.println(a + " is the largest number.");

        else if (b>= a && b >= c)
            System.out.println(b + " is the largest number.");

        else
            System.out.println(c + " is the largest number.");
    }
}