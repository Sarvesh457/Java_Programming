import java.util.Scanner;

class Switch_Demo 
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iStd=0;

        System.out.println("Enter your Standerd:");
        iStd =sobj.nextInt();

        switch (iStd) {
            case 1:
                System.out.println("Exm at 9 AM");
                break;

            case 2:
                System.out.println("Exm at 10 AM");
                break;

            case 3:
                System.out.println("Exm at 11 AM");
                break;

            case 4:
                System.out.println("Exm at 12 AM");
                break;

            default:
                System.out.println("Ivnalid Standard");
                break;
        }

    }
}