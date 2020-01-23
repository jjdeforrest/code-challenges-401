package utilities;

public class AnimalShelter {


    Animal back;

    public void enqueue(String name){
        Animal creature = new Animal(name);
        if(back == null){
            back = creature;
        } else {
            creature.next = back;
            back = creature;
        }
    }

    public String dequeue(){
        String position;
        Animal current = back;
        if(back == null){
            return null;
        } else{
            while(current.next.next != null){
                current = current.next;
            }
            position = current.next.name;
            current.next = null;
        }
        return position;
    }

    public String prefCheckDogorCat(String animal){
        String dog = "dog";
        String cat = "cat";
        String accepted = "accepted";
        String no = "hell no";
        if(animal == "dog" || animal == "cat"){
            return accepted;
        } else {
            return no;
        }

    }

    public String toString(){
        Animal current = back;
        String str = "";
        while(current.next != null){
            current = current.next;
        }
        return str;
    }
}
