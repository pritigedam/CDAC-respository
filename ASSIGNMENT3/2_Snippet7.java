class NestedIncrement {
public static void main(String[] args) {
	int a = 10;
	int b = 5;
	int result = ++a * b-- - --a + b++;
System.out.println(result);
}
}
/* 11*5-10+4
    55-10+4
    45+4
     49