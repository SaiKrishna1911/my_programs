
class printable
{
    void print();
}
interface showable
{
    void print();
}

class intface1 extends printable implements showable
{
    public void print()
    {
        System.out.println("Holaaa Amigoo");
    }
    public static void main(String[] args)
    {
        intface obj = new intface();
        obj.print();
    }
}

