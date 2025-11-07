class Demo
{
    public int iNo1;
    public int iNo2;

    public Demo()
    {
        System.out.println("Inside Default Constructor");
    }
    public Demo(int i,int j)
    {
        System.out.println("Inside parametrized Constructor");
    }
    protected void finalize()  //~Demo c++
    {
        System.out.println("Inside Finalize");
    }
}

class ConstructorDestructor
{
    public static void main(String Arr[])
    {
        Demo dobj1 = new Demo();                    //Demo dboj1(); c++

        Demo dobj2 = new Demo(11,21);

        dobj1 = null;

        dobj2 = null;


        System.gc();

        System.out.println("End of main");
    }
    
}
