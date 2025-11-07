class Hello
{
    public int i;
    
    public Hello(int no)
    {
        System.out.println("Inside Hello Constructor");
        this.i = no+1;                                       
    }
    public void Display()
    {
        System.out.println("inside Hello Display");
    }

}
class Demo extends Hello
{
    public int i ;
    
    public Demo(int a)
    {
        super(a);                                           //first use
        System.out.println("Inside Demo Constructor");     
        this.i = a;                                     
    }
    
    public void Display()
    {
        int i = 0;

        System.out.println("Inside Display" +i);     
        System.out.println("Inside Display" +this.i); 
        System.out.println("Inside Display" +super.i);          //second use
        super.Display();                                        //3 use
    }

}
class SuperDemo
{
    public static void main(String A[])
    {
        Demo dobj = new Demo(51);
        dobj.Display();
    
    }
}
