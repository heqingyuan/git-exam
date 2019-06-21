package test03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo01 {
    public static void main(String[] args) throws ParseException {
        demo();
        demo1();
        demo2();

    }

    private static void demo1() throws ParseException {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd号 HH:mm:ss");
        Date p = sdf.parse("2019年03月23号 15:15:27");
        System.out.println(p);
    }

    private static void demo() {
        Date d=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd号 HH:mm:ss");
        String format = sdf.format(d);
        System.out.println(format);
    }
    public static void demo2(){
        System.out.println("java hello");
    }

}
