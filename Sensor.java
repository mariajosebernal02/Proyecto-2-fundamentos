import java.util.ArrayList;
public class Sensor{

    private String tipo;
    private double valor;

    public Sensor(){
    }

    public Sensor(String t, double v){
        this.tipo =t;
        this.valor = v;
    }

    public void setTipo(String t){
        this.tipo = t;
    }

    public void setValor(double v){
        this.valor = v;
    }

    public String getTipo(){
        return this.tipo;
    }

    public double getValor(){
        return this.valor;
    }

    public String toString(){
        String datos = "(" + this.tipo + ", " + this.valor + ")";
        return datos;
    }

    public static String toStringSensores(Vehiculo v){
        String datosTotales = "";
        for(int i=0; i<v.cantidadSensores(); i++){
            datosTotales = datosTotales + v.getSensores().get(i).toString();
        }
        if (datosTotales.equals("")){
            datosTotales = "Este vehiculo no tiene sensores";
        }
        return datosTotales;
    }

    public static String sensoresTemperatura(){
        String temperaturas = "";
        for(int j=0; j<Vehiculo.vehiculos.size(); j++){
            if(Vehiculo.vehiculos.get(j).cantidadSensores()!=0){
                for (int i=0; i<Vehiculo.vehiculos.get(j).cantidadSensores(); i++){
                    if((Vehiculo.vehiculos.get(j).getSensores().get(i).getTipo()).equals("temperatura")){
                        temperaturas = temperaturas + Vehiculo.vehiculos.get(j).getSensores().get(i).toString();
                    }
                }
            } 
        }
        if(temperaturas.equals("")){
            temperaturas = "no hay sensores de tipo temperatura";
        }

        return temperaturas;
    }

    public static ArrayList<Sensor> SensoresTemperaturasOrdenados(){
        ArrayList<Sensor>temperaturas = new ArrayList();
        for(int j=0; j<Vehiculo.vehiculos.size(); j++){
            if(Vehiculo.vehiculos.get(j).cantidadSensores()!=0){
                for (int i=0; i<Vehiculo.vehiculos.get(j).cantidadSensores(); i++){
                    if((Vehiculo.vehiculos.get(j).getSensores().get(i).getTipo()).equals("temperatura")){
                        temperaturas.add(Vehiculo.vehiculos.get(j).getSensores().get(i));
                    }
                }
            } 
        }

        Sensor temp;
        
        for (int j=1; j<temperaturas.size(); j++){
            for (int k=0; k<temperaturas.size()-j; k++){
                if (temperaturas.get(k).getValor()>temperaturas.get(k+1).getValor()){
                    temp = temperaturas.get(k);
                    temperaturas.set(k, temperaturas.get(k+1));
                    temperaturas.set(k+1, temp);
                }
            }
        }

        return temperaturas;
    }

    public static String toStringTemperaturasOrdenados(ArrayList <Sensor> temperaturas){
        String datosOrdenados= "";
        for(int i=0; i<temperaturas.size(); i++){
            datosOrdenados = datosOrdenados + (temperaturas.get(i).toString());
        }
        if(datosOrdenados.equals("")){
            datosOrdenados = "no hay sensores de tipo temperatura";
        }
        return datosOrdenados;
    }

}
