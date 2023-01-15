package Dharmendra;

public class class1 {
    private int id;
    protected int age;
    String name;

    public String caste;

     protected class1(int id, int age, String name, String caste){
        this.id=id;
        this.age=age;
        this.name=name;
        this.caste=caste;
    }

    public int getId(){
        return id;
    }
    public int getAge(){
        return age;
    }

}
