package HashTable;

public class HashTable {

    String[][] arr;

    public HashTable(){
        this.arr = new String[3496][11];
    }

    private int hash(String key){
        int hashValue = 0;
        for(int i = 0; i < key.length(); i++){
            hashValue += (int) key.charAt(i);
        }
        return (hashValue * 4367) % this.arr.length;
    }

    public void add(String key, String value){
        int hashValue = hash(key);
        for(int i = 0; i < 10; i += 2){
            if(this.arr[hashValue][i] == null){
                this.arr[hashValue][i] = key;
                this.arr[hashValue][i + 1] = value;
                break;
            }
        }
    }

    public String get(String key){
        int hashValue = hash(key);
        for(int i = 0; i < 10; i += 2){
            if(this.arr[hashValue][i] == key){
                return this.arr[hashValue][i + 1];
            }
        }
        return null;
    }

    public boolean contains(String key){
        int hashValue = hash(key);
        for(int i = 0; i < 10; i += 2){
            if(this.arr[hashValue][i] == key){
                return true;
            }
        }
        return false;
    }
}