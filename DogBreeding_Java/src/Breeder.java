/**
 * @author : Toton Liantoro
 * @Version :  9 November 2021
 *
 * Breeder class is control class for Dog and PedigreeDog class
 */

import java.util.ArrayList;

public class Breeder {
    ArrayList <Dog> dogs = new ArrayList<Dog>();


    //Function addDog is used to add a dog in the breeder class
    public boolean addDog (Dog inDog) {
        if (!findDog (inDog.getName())){
            dogs.add(inDog);
            return true;
        }
        else {
            System.out.println("Error - The dog with name " +  inDog.getName() +  " can not be added in breeder, it is already in the breeder");
            return false;
        }
    }


    //Function findDog is used to find dog in the breeder.
    public boolean findDog (String inName){
        for (Dog nextDog : dogs){
            if (inName.equals(nextDog.getName())){
                System.out.println("Found the following dog in the breeder \n" + nextDog);
                return true;
            }

        }
        return false;
    }

    //Function deleteDog is used to delete a sold dog from the breeder
    public boolean deleteDog(Dog soldDog) {
        return dogs.remove (soldDog);
    }


    //Function listDog is used to show all dogs in the breeder
    public void listDog (){
        System.out.println("The following dogs are for sale by Toton's Dog Breeder: ");
        for (Dog nextDog : dogs) {
            System.out.println(nextDog);
        }
    }


    //Function calTotalPrice is used to calculate the total price all dogs in the breeder
    public void calTotalPrice (){
        double totalPrice = 0;
        for (Dog nextDog : dogs){
            totalPrice += nextDog.getPrice();
        }
        System.out.println("The total price dogs in the Toton's Dog Breeder is $" + totalPrice);
    }


    //Function printCheaperThan is used to know the dogs in the breeder that has price less than provided threshold price
    public void printCheaperThan (double threshold) {
        System.out.println("Toton's dog breeder list which the dogs price less than $" + threshold + ":" );
        if (dogs.size() ==0){
            System.out.println("There is no dog in the breeder");
        }
        for (Dog nextDog : dogs)
            if (nextDog.getPrice() < threshold) {
                System.out.println(nextDog);
            }
    }


    // method listPedigreeDog is function to display pedigree dog within specific breed (breedRecord)
    public void listPedigreeDog (String breedRecord) {
        System.out.println("The pedigree dogs with breed record " + breedRecord );
        for (Dog nextDog : dogs) {
            //need to check whether the dog is a pedigree dog before calling getBreedRecord()
            if (nextDog instanceof PedigreeDog)
                if (((PedigreeDog) nextDog).getBreedRecord() == breedRecord)
                    System.out.println(nextDog);
        }

    }

}
