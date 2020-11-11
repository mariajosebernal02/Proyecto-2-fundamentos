public class BichoAlien extends Bicho{
    public BichoAlien(){
        super(20);
    }
    
    @Override
    public String toString(){
        return "BA-" + super.getSalud();
    }
}
