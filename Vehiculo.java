import java.util.ArrayList;
public class Vehiculo{

    public static ArrayList <Vehiculo> vehiculos = new ArrayList<Vehiculo>();
    public static int idActual = 1;
    private int id;
    private int modelo;
    private String marca;
    private double valorComercial;
    private String color;
    private ArrayList <Sensor> sensores = new ArrayList<Sensor>();
   
    public Vehiculo(){
        this.id = Vehiculo.idActual-1;
        Vehiculo.vehiculos.add(this);
        Vehiculo.idActual++;
    }

    public Vehiculo(int mo, String ma, double va){
        this(mo, ma, va, "verde");
    }

    public Vehiculo(int mo, String ma, double va, String co){
        this.modelo = mo;
        this.marca = ma;
        this.valorComercial = va;
        this.color = co;
        this.id = Vehiculo.idActual-1;
        Vehiculo.vehiculos.add(this);
        Vehiculo.idActual++;
    }

    public void setModelo(int mo){
        this.modelo = mo;
    }

    public void setMarca(String ma){
        this.marca = ma;
    }

    public void setValorComercial(double va){
        this.valorComercial = va;
    }

    public void setColor(String co){
        this.color = co;
    }
    
    public void setId(int i){
        this.id = i;
    }
    
    public void setSensores(ArrayList<Sensor> s){
        this.sensores = s;
    }

    public int getModelo(){
        return this.modelo;
    }

    public String getMarca(){
        return this.marca;
    }

    public double getValorComercial(){
        return this.valorComercial;
    }

    public String getColor(){
        return this.color;
    }
    
    public int getId(){
        return this.id;
    }
    
    public ArrayList<Sensor> getSensores(){
        return this.sensores;
    }

    public String toString(){
        String datos = "/" + this.id + ", " + this.modelo + ", " + this.marca + ", " 
        + this.valorComercial + ", " + this.color;
        
        for(int i=0; i<this.sensores.size(); i++){
            datos = datos + this.sensores.get(i).toString();
        }
        
        datos = datos + "/";
        return datos;
    }

    public static String toStringVehiculos(){
        String datosTotales = "";
        for(int i=0; i<Vehiculo.vehiculos.size(); i++){
            datosTotales = datosTotales + Vehiculo.vehiculos.get(i).toString();
        }
        if (datosTotales.equals("")){
            datosTotales = "no hay vehiculos";
        }
        return datosTotales;
    }

    public static int cantidadVehiculos(){
        return Vehiculo.vehiculos.size();
    }
    
    public int cantidadSensores(){
        return this.sensores.size();
    }
    
    public void anadirSensor(Sensor s){
        this.sensores.add(s);
    }

    public static String vehiculosVerdes(){
        String verdes = "";
        if(Vehiculo.vehiculos.size()!=0){
            for (int i=0; i<Vehiculo.vehiculos.size(); i++){
                if((Vehiculo.vehiculos.get(i).getColor()).equals("verde")){
                    verdes = verdes + Vehiculo.vehiculos.get(i).toString();
                }
            }
        } 
        if(verdes.equals("")){
            verdes = "no hay vehiculos verdes";
        }
        return verdes;
    }
    
    public static Vehiculo obtenerVehiculoPorId(int id){
        Vehiculo v = new Vehiculo();
        for(int i=0; i<Vehiculo.vehiculos.size(); i++){
            if(id == Vehiculo.vehiculos.get(i).getId()){
                return Vehiculo.vehiculos.get(i);
            }
        }
        return v;
    }
    
    public static String vehiculoMasSensores(){
        int posicion = 0;
        for(int i=1; i<Vehiculo.vehiculos.size(); i++){
            if ((Vehiculo.vehiculos.get(posicion).sensores.size())<(Vehiculo.vehiculos.get(i).sensores.size())){
                posicion = i;
            }
        }
        return Vehiculo.vehiculos.get(posicion).toString();
    }
    
}

