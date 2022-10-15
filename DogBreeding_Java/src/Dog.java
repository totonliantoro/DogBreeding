/**
 * @author : Toton Liantoro
 * @version  : 9 November 2021
 *
 * This class is a parent class to define dogs in the breeder
 */

public class Dog {
    private String name;
    private int age;
    private String gender;
    private double price;

    /**
    * @parameter name      the name of the dog, that is unique value
    * @parameter age       the age of the dog, age is based on whole number months
    * @parameter gender    two type gender M and F
    * @parameter price     The price is in dollars and cents
    */


    public Dog(String inName, int inAge, String inGender, double inPrice){
        name = inName;
        age = inAge;
        gender = inGender;
        price = inPrice;
    }


    public String toString () {
        return "Name: " + name + ", age: " + age + " months, gender: " + gender + ", price: $" + price;
    }


    public void setPrice (double newPrice) {
        price = newPrice;
    }

    public void setAge (int newAge) {
        age = newAge;
    }

    public double getPrice (){
        return price;
    }

    public int getAge () {
        return age;
    }

    public String getName (){
        return name;
    }

}
