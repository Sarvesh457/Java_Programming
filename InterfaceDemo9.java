interface A
{
    int no = 11;                    
    void fun(); 
        private void Display()
    {
        System.out.println("Inside Private Display");
    
    }
    default void gun()          //imp
    {
        System.err.println("Inside Gun");
        Display();
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
        //dobj.Dispaly();
    }
}
