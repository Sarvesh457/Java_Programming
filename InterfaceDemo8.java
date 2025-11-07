interface A
{
    int no = 11;                    
    void fun();
    default void gun()          //imp
    {
        System.err.println("Inside Gun");
    }
}
class Demo implements A 
{
    public void fun()
    {
        System.err.println("Inside Fun");            
    }
}
class InterfaceDemo8
{
    public static void main(String A[])
    {
        Demo dobj = new Demo();

        dobj.fun();
        dobj.gun();
    }
}
