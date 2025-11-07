import java.util.Scanner;

class Selection_Demo2 {

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iStd=0;

        System.out.println("Enter your Standerd:");
        iStd =sobj.nextInt();

        if (iStd == 1) 
        {
            System.out.println("Exam at 9 AM");
        }
        else if (iStd == 2)
        {
            System.out.println("Your exam at 10 AM");
        }
        else if (iStd == 3)
        {
            System.out.println("Your exam at 11 AM");
        }
        else if (iStd == 4)
        {
            System.out.println("Your exam at 12 AM");
        }
        else
        {
            System.out.println("Invalid Satndred");
        }
    
    }
    
    }