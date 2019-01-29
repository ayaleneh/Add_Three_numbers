import java.util.Scanner;

public class Add_Three_number {
    public static void main(String[] args) {
        int number1,number2,number3;
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter the first number");
        number1=scanner.nextInt();
        System.out.println("please enter the second number");
        number2=scanner.nextInt();
        System.out.println("please enter the third number");
        number3=scanner.nextInt();
        int total=number1+number2+number3;
        System.out.println("the sum of "+number1+" "+number2+" "+number3+" "+"is "+total);
    }
}
