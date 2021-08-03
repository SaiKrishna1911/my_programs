interface Printable
{
void print();
}
interface Showable
{
void print();
}

class mulint implements Printable,Showable
{
public void print()
{
System.out.println("Hello Kumar Sangakkara");
}
public static void main(String[] args)
{
mulint obj = new mulint();
obj.print();
}
}
