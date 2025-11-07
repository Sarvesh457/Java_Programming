import java.util.Scanner;
class Input_Output {
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int No1 = 0;
        int No2 = 0;
        int Ans = 0;

        System.out.println("Enter the first number:");
        No1 = sobj.nextInt();

        System.out.println("Enter the second number:");
        No2 = sobj.nextInt();  
        
        Ans = No1+No2;

        System.out.println("Addition is:"+Ans);

    }
    
}
