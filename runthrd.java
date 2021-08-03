

class runthrd implements Runnable
{
public void run()
{
    System.out.println("-------Inside run-------");
    
}
public static void main (String args[])
{
System.out.println("------Main Start-------");
runthrd obj = new runthrd();
Thread t1 = new Thread(obj);
Thread t2 = new Thread(obj);
    System.out.println("Name of thread 1 "+t1.getName());
    System.out.println("Name of thread 2 "+t2.getName());
    t1.setName("T1 thread");
    t2.setName("T2 thread");
    t1.start();
    t2.start();
    System.out.println("Name of thread 1 "+t1.getName());
    System.out.println("Name of thread 2 "+t2.getName());
    
System.out.println("------Main End-------");
}
}
