package Dharmendra;

public class class3 extends class1{

    class3(int id, int age, String name, String caste) {
        super(id, age, name, caste);
    }

    public static void main(String[] args) {
        class3 obj= new class3(2,22,"Prakash","safi");
        System.out.println(obj.name);
        System.out.println(obj.age);
        System.out.println(obj.getId());


    }
}
