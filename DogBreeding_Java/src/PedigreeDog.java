/**
 *
 * @author : Toton Liantoro
 * @Version :  9 November 2021
 *
 * * pedigreeDogs is a subclass of Dogs that defines pedigree dog with their breed record.
 */

public class PedigreeDog extends Dog {
    private String breedRecord; //@param breedRecord is breed record for pedigree dogs

    public PedigreeDog(String inName, int inAge, String inGender, double inPrice, String inBreedRecord){
        super(inName, inAge, inGender, inPrice);
        breedRecord = inBreedRecord;
    }

   public String toString (){
        return "*** The following dog is pedigree dog, breeder: " + breedRecord + " *** \n" + super.toString();
    }

    public String getBreedRecord(){
        return breedRecord;
    }


}
