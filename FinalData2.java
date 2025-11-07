class Demo
{
    public int i=21;
    final public int j=11;
}

class FinalData2 
{
    public static void main(String A[])
    {
        Demo dobj = new Demo();
        System.out.println(dobj.i);
        System.out.println(dobj.j);

        dobj.i++;
        //dobj.j++;       //error
    }  
}
