import java.util.Scanner;

public class homework1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        System.out.printf("현재까지 입력된 숫자의 합은 %d 입니다 \n",a);
        int b=sc.nextInt();
        System.out.printf("현재까지 입력된 숫자의 합은 %d 입니다 \n",a+b);
        int c=sc.nextInt();
        System.out.printf("현재까지 입력된 숫자의 합은 %d 입니다\n",a+b+c);
        int d=sc.nextInt();
        System.out.printf("현재까지 입력된 숫자의 합은 %d 입니다\n",a+b+c+d);
        int e=sc.nextInt();
        System.out.printf("현재까지 입력된 숫자의 합은 %d 입니다\n",a+b+c+d+e);

    }
}
