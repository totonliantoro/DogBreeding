/**
 * @author : Toton Liantoro
 * @Version :  9 November 2021
 *
 * TotonTest class is main class that can use to run and test the constructors and methods from other classes
 * (Dog, PedigreeDog and Breeder)
 *
 *
 */
public class TotonTest {

    public static void main(String[] args) {
        //Create new arraylist call the company breeder: totonBreeder
        Breeder totonBreeder = new Breeder();

        //Create dogs
        Dog d1 = new Dog("Anna", 4, "F", 111.11);
        Dog d2 = new Dog("Darryl", 5, "M", 44);

        //Create pedigree dogs
        PedigreeDog pd1 = new PedigreeDog("Barry", 36, "M", 22.22, "beagle");
        PedigreeDog pd2 = new PedigreeDog("Cindy", 2, "F", 333, "beagle");
        PedigreeDog pd3 = new PedigreeDog("Elsie", 10, "F", 555, "poodle");

        //Add all the dogs in the breeder
        totonBreeder.addDog(d1);
        totonBreeder.addDog(d2);
        totonBreeder.addDog(pd1);
        totonBreeder.addDog(pd2);
        totonBreeder.addDog(pd3);

        /**To test the methods, use or call following methods by erasing symbol "//" front of the methods */

        //Display the list Dogs which sale by Toton's Dog Breeder
        //totonBreeder.listDog();

        //Display the total price dogs in the Toton's Dog Breeder --> Total price $1065.33
        //totonBreeder.calTotalPrice();

        //Display dog which has price cheaper than $50
        //totonBreeder.printCheaperThan(50.0);

        //Display dog which has price cheaper than $30
        //totonBreeder.printCheaperThan(30.0);

        //Display pedigree dogs with a breed beagle
        //totonBreeder.listPedigreeDog("beagle");

        //Display pedigree dogs with a breed poodle
        //totonBreeder.listPedigreeDog("poodle");

        //Call methode to sell Cindy --> use method deleteDog
        //totonBreeder.deleteDog (pd2);
        //totonBreeder.listDog(); //Display the list Dogs after Cindy is sold
        //totonBreeder.calTotalPrice(); //Call Total Price in the breeder after sell Cindy -- the result $732.33

        //Try to add dog name Elsie, it must be error because Elsie is already in the breeder
        //Dog d3 = new Dog("Elsie", 5, "M", 44);
        //totonBreeder.addDog(d3);

    }
}
