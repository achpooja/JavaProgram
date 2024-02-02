class ExceptionCus extends Exception
{
    public ExceptionCus(String msg)
    {
        super(msg);
    }
}

class CustomExc 
{
    int sem;
 public CustomExc(int sem) throws ExceptionCus
 {
    if(sem<1||sem>8)
    {
        throw new ExceptionCus("Invalid");
    }
    else
    {
        System.out.println("Valid");
    }

 }

 public static void main(String[] args) 
 {
    try
    {
        new CustomExc(9);
    }
    catch(ExceptionCus e)
    {
        System.out.println(e.getMessage());
    }
 }
}