package dinosaur.dinosaurList;

public class Pterosaur {

    private String dinosaurType = "pterosaur";

    public String getDinosaurType() {
        return dinosaurType;
    }

    public String eat(){
        return String.format("O %s se era onívoro, ou seja, comia de tudo", this.getDinosaurType());
    }
    public String reproduce(){
        return String.format("Os %s faziam ninhos para criar seus filhotes", this.getDinosaurType());
    }

}