public abstract class Bicho{
    public static Bicho [][] bichos = new Bicho[2][2];
    private int salud;
    
    protected Bicho(){
    }
    
    protected Bicho(int s){
        this.salud = s;
    }
    
    public void setSalud(int s){
        this.salud = s;
    }
    
    public int getSalud(){
        return this.salud;
    }

    public abstract String toString();
    
    public static void atacar(Bicho b1){
        if(b1!=null){
            if(b1.getSalud()>0){
                b1.setSalud(b1.getSalud()-5);
            } else{
                System.out.println("Bicho muerto");
            }
        } else{
            System.out.println("Bicho no existe");
        }
    }
}
