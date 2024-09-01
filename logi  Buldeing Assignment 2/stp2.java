 class IncorrectWhileCondition {
public static void main(String[] args) {
int count = 0;
while (count < 5) {
System.out.println(count);
count++;
}
}
}
/* Error to investigate: Why does the loop not execute as expected? What is the issue with the condition in the
`while` loop?
*/