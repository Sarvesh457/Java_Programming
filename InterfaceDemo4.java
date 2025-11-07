interface A
{
    void fun();
}
interface B
{
    void gun();
}
class Demo implements A,B           //Multiple Inheritance
{
    public void fun()
    {
        System.err.println("Inside Fun");
    }
    public void gun()
    {
        System.err.println("Inside Gun");
    }
}
class InterfaceDemo4
{
    public static void main(String A[])
    {
        Demo dobj = new Demo();

        dobj.fun();
        dobj.gun();
    }
}
