package utilities;

public class Animal {
    String name;
    String age;
    Animal next;
    String Name;
    public Animal(String name){
        this.name = name;
    }

    public void display(){
        System.out.println("name " + name);
    }
}
