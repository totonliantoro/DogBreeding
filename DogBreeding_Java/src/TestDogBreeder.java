/**
 * @author : Toton Liantoro
 * @version : 9 November 2021
 * This class is JUnit Test to test the constructor and methods in the application
 */

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestDogBreeder {

    @Test
    //Test method addDog()
    public void test1(){
        Breeder br1 = new Breeder();
        Dog d1 = new Dog("Albert", 25, "M", 320.5);
        br1.addDog(d1);
        assertEquals(true, br1.addDog(d1) ); //Test result is failed --> error message display the dog is already in breeder
    }


    @Test
    //Test method findDog()
    public void test2(){
        Breeder br1 = new Breeder();
        PedigreeDog pd1 = new PedigreeDog("Floren", 15, "F",205, "beagle");
        br1.addDog(pd1);
        assertEquals(true, br1.findDog("Floren") ); //Test Result is passed, expect and actual is same true

    }


    @Test
    //Test method deleteDog()
    public void test3(){
        Breeder br1 = new Breeder();
        Dog pd1 = new Dog("Meow", 15, "F",105);
        //br1.addDog(pd1);
        assertEquals(false, br1.deleteDog(pd1)); //Test Result is passed, expect and actual is same false
    }


}
