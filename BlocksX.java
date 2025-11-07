class Demo
{
    public int i;                           //instancte variable
    static public int j=21;                 //class variable
    
    static
    {
        System.out.println("Inside Static Block");
        j=21;
    }
    {
        System.out.println();
    }

    public Demo()
    {
        System.out.println("Inside Constructor");
        this.i=11;   
    }

}
class Blocks
{
    public static void main(String A[])
    {
        System.out.println("Inside Main");
        Demo dobj1 = new Demo();
        Demo dobj2 = new Demo();
        Demo dobj3 = new Demo();

    }
}
