import java.util.*;

class ExceptionDemo6
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        
        int iNo1 = 0 , iNo2 = 0, iAns = 0;

        System.out.println("First Number");
        iNo1 = sobj.nextInt();

        System.out.println("Second Number");
        iNo2 = sobj.nextInt();
        
        try
        {
            System.out.println("Inside Try Block");
            iAns = iNo1/iNo2;
        }
        //error due to catch sequence
        catch(Exception eobj)                       //Generic catch
        {
            System.out.println("Inside Generic catch");
        }
        catch(ArithmeticException aobj)             //Specific catch     
        {
            System.out.println("Inside Catch Block");
            System.out.println(aobj);
        }
        
        System.out.println("Division is :"+iAns);
    }
    
}
