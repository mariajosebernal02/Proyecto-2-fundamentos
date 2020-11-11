public class BichoNormal extends Bicho{
    public BichoNormal(){
        super(10);
    }
    
    @Override
    public String toString(){
        return "BN-" + super.getSalud();
    }
}
