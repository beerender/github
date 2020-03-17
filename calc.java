import java.util.*;
public class HelloWorld{

     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        char ch1;
        
        do{              //2. add do-while loop
        int no1=sc.nextInt();
        int no2=sc.nextInt();
        long ans=0; //2.int to long
        System.out.println("Enter operator");
        char ch=sc.next().charAt(0);
        switch(ch){
            case '+': ans=addition(no1,no2);
                         System.out.println(ans);
                        break;
            case '-': ans=substraction(no1,no2);
                         System.out.println(ans);
                        break;
            case '*': ans=multiply(no1,no2);
                         System.out.println(ans);
                        break;
            case '/': ans=divide(no1,no2);
                         if(ans!=0){     //2. conditon for ans
                         System.out.println(ans);}
                        break;
            default: System.out.println("Enter valid sign");
                        break;
     }
     System.out.println("Enter more? ");
     ch1=sc.next().charAt(0);
     
     }while(ch1=='y');
     
    }
    public static long addition(int no1,int no2) //2. changed to long return type
    {
        return no1+no2;
    }
    public static long substraction(int no1,int no2)
    {
        return no1-no2;
    }
    public static long divide(int no1,int no2)
    {
        try{        //exception handling
        int ans=no1/no2;
        return ans;
        }
         catch(Exception e){
         System.out.println(e);
         }
         return 0;
      }
    public static long multiply(int no1,int no2)
    {
        return no1*no2;
    }
}
