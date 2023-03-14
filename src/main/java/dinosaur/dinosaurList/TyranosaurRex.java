package dinosaur.dinosaurList;

import dinosaur.iDinosaur;

public class TyranosaurRex implements iDinosaur {
    private String dinosaurType = "tyranosaur";

    public String getDinosaurType() {
        return dinosaurType;
    }

    public String eat(){
        return String.format("O %s come apenas carne, ou seja, era carnívoro", this.getDinosaurType());
    }
    public String reproduce(){
        return String.format("Os %s, assim como as aves, se utilizavam de atrações vocais e visuais para atrair um parceiro.", this.getDinosaurType());
    }

}
