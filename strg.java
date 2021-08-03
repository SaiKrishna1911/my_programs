
public class strg
{
    public static void main(String[] args)
    {
        String s = "Hello Kumar Sangakkara";
        System.out.println(s.charAt(3));
        System.out.println("-------------------------------------");
        //-------------------------------------//
        char[] dst = new char[10];
        s.getChars(2, 7, dst, 4);
        for (char c : dst)
            {
                System.out.print(c);
            }
        System.out.println();
        String kp = String.valueOf(dst);
        System.out.println("Index of first 'l' is "+ kp.indexOf('l'));
        System.out.println("-------------------------------------");
        //-------------------------------------//
        String st1="ABCDEFG";
        byte[] b=st1.getBytes();
        System.out.println("String : "+st1);
        for(int i=0;i<b.length;i++)
        {
        System.out.print(b[i]+" ");
        }
        System.out.println();
        System.out.println("-------------------------------------");
        //-------------------------------------//
        char[] tsd = s.toCharArray(); //Makes array of charecters
        for (char f : tsd)
            {
                System.out.print(f);
            }
        System.out.println();
        System.out.println("-------------------------------------");
        //-------------------------------------//
        String subs1 = s.substring(12);//from 11 everything
        System.out.println(subs1);;
        String subs2 = s.substring(6,15); //5-start,15-end
        System.out.println(subs2);
        System.out.println("-------------------------------------");
        //-------------------------------------//
        System.out.println(s.startsWith(" K"));
        System.out.println(s.endsWith("ra"));
        System.out.println("-------------------------------------");
        //-------------------------------------//
        boolean b1 = true;
        byte b2 = 11;
        short sh = 11;
        int i = 13;
        long l = 142835324;
        char[] chr = {'h','i','k','u','m','a','r'};
        strg obj = new strg();
        String s1 = String.valueOf(b1);//changes everything to string
        String s2 = String.valueOf(b2);
        String s3 = String.valueOf(sh);
        String s4 = String.valueOf(i);
        String s5 = String.valueOf(l);
        String s6 = String.valueOf(chr);
        String s7 = String.valueOf(obj);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s6);
        System.out.println(s7);
        System.out.println("-------------------------------------");
        //-------------------------------------//
        String a1 = s.toUpperCase();
        String a2 = s.toLowerCase();
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(s.length());
        System.out.println(s2.isEmpty());
        System.out.println("-------------------------------------");
        //-------------------------------------//
        String dop = s.replace('l','#');
        System.out.println(dop);
        System.out.println("-------------------------------------");
        //-------------------------------------//
        String pos = "         Hii Kumar Sangakkara      ";
        System.out.println(pos.trim());
        System.out.println("-------------------------------------");
        //-------------------------------------//
        String r1 = "Hii";
        String r2 = "Hii";
        String r3 = "Kumar Sangakkara";
        System.out.println(r2.concat(r3));
        System.out.println("-------------------------------------");
        //-------------------------------------//
        System.out.println(r3.indexOf("Kumar"));
        System.out.println("-------------------------------------");
        //-------------------------------------//
        System.out.println(r1.equals(r2));
        System.out.println("-------------------------------------");
    }
}
