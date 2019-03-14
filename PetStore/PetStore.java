import java.util.*;

class PetStore{
    private Queue<Dog> dogs;
    private Queue<Cat> cats;
    PetStore(){
        dogs = new LinkedList();
        cats = new LinkedList();
    }
    public void add(Animal animal){
        if(animal instanceof Dog){
            dogs.add((Dog)animal);
        }else if(animal instanceof Cat){
            cats.add((Cat)animal);
        }
    }
    public Animal getAny(){
        if(dogs.size()==0 && cats.size()==0){
            return null;
        }
        if(dogs.size()==0){
            return cats.remove();
        }
        if(cats.size()==0){
            return dogs.remove();
        }
        if(dogs.peek().getId() < cats.peek().getId()){
            return dogs.remove();
        }else{
            return cats.remove();
        }
    }
}