import java.util.Scanner;
public class Principal{
    public static void main (String [] args){
        System.out.println("Menu");
        Principal.mostrarMenu();
    }

    public static void mostrarMenu(){
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("Ingrese un número:");
            int num = scan.nextInt();

            if (num==0){
                break;
            } else if(num==1){
                System.out.println("Ingrese modelo: ");
                int mo = scan.nextInt();
                System.out.println("Ingrese marca: ");
                String ma = scan.next();
                System.out.println("Ingrese valor comercial: ");
                double va = scan.nextDouble();
                System.out.println("Ingrese color: ");
                String co = scan.next();
                Vehiculo v = new Vehiculo(mo, ma, va, co);
            } else if (num==2){
                System.out.println("Datos Vehiculos /modelo, marca, valor comercial, color(Sensor: tipo, valor)/: ");
                System.out.println(Vehiculo.toStringVehiculos());
            } else if (num==3){
                System.out.println("Cantidad de vehículos: ");
                System.out.println(Vehiculo.cantidadVehiculos());
            } else if (num==4){
                System.out.println("Vehiculos color verde /modelo, marca, valor comercial, color(Sensor: tipo, valor)/: ");
                System.out.println(Vehiculo.vehiculosVerdes());
            } else if (num==5){
                System.out.println("Ingrese Id de vehiculo: ");
                int id = scan.nextInt();
                boolean v = false;
                for(int i=0; i<Vehiculo.vehiculos.size(); i++){
                    if(id == Vehiculo.vehiculos.get(i).getId()){
                        System.out.println(Vehiculo.vehiculos.get(i).toString());
                        v = true;
                    }
                }
                if(v==false){
                    System.out.println("No existe un vehiculo con Id " + id);
                }
            } else if (num==6){
                System.out.println("Ingrese Id de vehiculo existente: ");
                int id = scan.nextInt();
                Vehiculo v1 = Vehiculo.obtenerVehiculoPorId(id);
                Vehiculo.vehiculos.remove(Vehiculo.vehiculos.size()-1);
                Vehiculo.idActual--;
                if(v1.getColor()==null){
                    System.out.println("Error: No existe un vehiculo con Id " + id);
                } else{
                    System.out.println("Ingrese tipo: ");
                    String ti = scan.next();
                    System.out.println("Ingrese valor: ");
                    double va = scan.nextDouble();
                    Sensor s = new Sensor(ti, va);
                    Vehiculo.vehiculos.get(id).anadirSensor(s);
                }
            } else if (num==7){
                System.out.println("Ingrese Id de vehiculo existente: ");
                int id = scan.nextInt();
                Vehiculo v1 = Vehiculo.obtenerVehiculoPorId(id);
                Vehiculo.vehiculos.remove(Vehiculo.vehiculos.size()-1);
                Vehiculo.idActual--;
                if(v1.getColor()==null){
                    System.out.println("Error: No existe un vehiculo con Id " + id);
                } else{
                    System.out.println("Sensores del vehiculo con Id " + id);
                    System.out.println(Sensor.toStringSensores(v1));
                }
            } else if (num==8){
                System.out.println("Sensores de tipo temperatura (tipo, valor): ");
                System.out.println(Sensor.sensoresTemperatura());
            } else if (num==9){
                System.out.println("Vehiculo con mayor cantidad de sensores /modelo, marca, valor comercial, color(Sensor: tipo, valor)/: ");
                System.out.println(Vehiculo.vehiculoMasSensores());
            } else if (num==10){
                
            } else if (num==666){
                System.out.println("Sensores de tipo temperatura ordenados por valor (tipo, valor): ");
            }

        }
    }
}

