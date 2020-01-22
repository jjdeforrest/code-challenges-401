package utilities;

public class AnimalShelter {

    String dog;
    String cat;
    int amount;
    int counter = 0;

    public AnimalShelter(String dog, String cat, int amount){
        this.dog = dog;
        this.cat = cat;
        this.amount = amount;
    }

    public int enqueue(String animal) {
        String d = dog;
        String c = cat;
        String no = "hell no";
        String cute = "so cute";
        if (animal == d || animal == c) {
            counter++;
            this.amount = counter;
        }
    }

    public String dequeue(String animal){
        String d = dog;
        String c = cat;
        String no = "hell no";
        String cute = "so cute";
        if(animal != d || animal != d){
            return no;
        } else {
           return cute;
        }
    }
}
