package dinosaur.dinosaurList;

import dinosaur.iDinosaur;

public class Triceratops implements iDinosaur {
    private String dinosaurType = "triceratops";

    public String getDinosaurType() {
        return dinosaurType;
    }

    public String eat(){
        return String.format("O %s se alimentava principalmente de plantas e vegetação rasteira", this.getDinosaurType());
    }
    public String reproduce(){
        return String.format("Os %s viviam em bandos, e os machos disputavam entre si pelas fêmeas", this.getDinosaurType());
    }
}
