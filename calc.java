import java.util.*;
public class HelloWorld{

     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int no1=sc.nextInt();
        int no2=sc.nextInt();
        int ans=0;
        System.out.println("Enter operator");
        char ch=sc.next().charAt(0);
        switch(ch){
            case '+': ans=addition(no1,no2);
                        break;
            case '-': ans=substraction(no1,no2);
                        break;
            case '*': ans=multiply(no1,no2);
                        break;
            case '/': ans=divide(no1,no2);
                        break;
            default: System.out.println("Enter valid sign");
                        break;
     }
     System.out.println(ans);
    }
    public static int addition(int no1,int no2)
    {
        return no1+no2;
    }
    public static int substraction(int no1,int no2)
    {
        return no1-no2;
    }
    public static int divide(int no1,int no2)
    {
        return no1/no2;
    }
    public static int multiply(int no1,int no2)
    {
        return no1*no2;
    }
}