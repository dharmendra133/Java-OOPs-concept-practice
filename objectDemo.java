package Sah;
import java.util.*;
public class objectDemo {
    int num;
    float gpa;
    public objectDemo(int num,float gpa){
        this.num=num;
        this.gpa=gpa;

    }
   /* @Override
    public int hashCode(){
        return super.hashCode();
    }*/

    @Override
    public boolean equals(Object obj){
//        return super.equals(obj);
          return this.num==((objectDemo)obj).num;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public static void main(String[] args) {
        objectDemo obj1=new objectDemo(23,7.5f);
//        objectDemo obj2=obj1;
        objectDemo obj2=new objectDemo(23,7.5f);
        System.out.println(obj1==obj2);
        System.out.println(obj1.equals(obj2));
        System.out.println(obj2 instanceof objectDemo);

        System.out.println(obj1.getClass().getName());
        System.out.println(obj2.getClass());
    }

}
