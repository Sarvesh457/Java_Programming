interface A
{
    void fun();
}
interface B
{
    void fun();
}
class Demo implements A,B           //Multiple Inheritance
{
    public void fun()
    {
        System.err.println("Inside Fun");
    }
}
class InterfaceDemo5
{
    public static void main(String A[])
    {
        Demo dobj = new Demo();

        dobj.fun();
    }
}
