interface A
{
    int no = 11;                    //ambiguous
    void fun();
}
interface B
{
    int no = 21;                    //ambiguous
    void fun();
}
class Demo implements A,B           //Multiple Inheritance
{
    public void fun()
    {
        System.err.println("Inside Fun"+no);            //no generates error
    }
}
class InterfaceDemo6
{
    public static void main(String A[])
    {
        Demo dobj = new Demo();

        dobj.fun();
    }
}
