import java.util.*;

class ManishPetStore{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        PetStore petstore = new PetStore();
        Animal animal;
        while(true){
            System.out.println("Please select either of the options to continue.\n 1. Enter '1' to add a Dog. \n 2. Enter '2' to add a Cat. \n 3. Enter '3' to get a dog or cat.");
            int i = scan.nextInt();
            if(i == 1){
                animal = new Dog();
                petstore.add(animal);
            }else if(i==2){
                animal = new Cat();
                petstore.add(animal);
            }else{
                System.out.println(petstore.getAny().getId());
            }
        }
    }
}