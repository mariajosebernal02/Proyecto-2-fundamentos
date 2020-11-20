 import java.util.Scanner;
import java.io.File; 
public class Principal{
    public static void main (String [] args){
        System.out.println("Menu:");
        System.out.println("0. Detener programa");
        System.out.println("1. Crear un vehiculo");
        System.out.println("2. Mostrar info de vehiculos");
        System.out.println("3. Mostrar cantidad de vehiculos");
        System.out.println("4. Mostrar info de vehiculos verdes");
        System.out.println("5. Info de vehiculo por ID");
        System.out.println("6. Agregar sensor a vehiculo por ID");
        System.out.println("7. Mostrar sensores de vehiculo por ID");
        System.out.println("8. Mostrar info sensores tipo temperatura");
        System.out.println("9. Mostrar info vehiculo con mas sensores");
        System.out.println("10. Crear vehiculos con txt");
        System.out.println("666. Mostrar sensores temperatura ordenados por valor");
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
                System.out.println("Datos Vehiculos /ID, modelo, marca, valor comercial, color (Sensor: tipo, valor)/: ");
                System.out.println(Vehiculo.toStringVehiculos());
            } else if (num==3){
                System.out.println("Cantidad de vehículos: ");
                System.out.println(Vehiculo.cantidadVehiculos());
            } else if (num==4){
                System.out.println("Vehiculos color verde /ID, modelo, marca, valor comercial, color (Sensor: tipo, valor)/: ");
                System.out.println(Vehiculo.vehiculosVerdes());
            } else if (num==5){
                System.out.println("Ingrese ID de vehiculo: ");
                int id = scan.nextInt();
                boolean v = false;
                for(int i=0; i<Vehiculo.vehiculos.size(); i++){
                    if(id == Vehiculo.vehiculos.get(i).getId()){
                        System.out.println(Vehiculo.vehiculos.get(i).toString());
                        v = true;
                    }
                }
                if(v==false){
                    System.out.println("No existe un vehiculo con ID " + id);
                }
            } else if (num==6){
                System.out.println("Ingrese ID de vehiculo existente: ");
                int id = scan.nextInt();
                Vehiculo v1 = Vehiculo.obtenerVehiculoPorId(id);
                Vehiculo.vehiculos.remove(Vehiculo.vehiculos.size()-1);
                Vehiculo.idActual--;
                if(v1.getColor()==null){
                    System.out.println("Error: No existe un vehiculo con ID " + id);
                } else{
                    System.out.println("Ingrese tipo: ");
                    String ti = scan.next();
                    System.out.println("Ingrese valor: ");
                    double va = scan.nextDouble();
                    Sensor s = new Sensor(ti, va);
                    Vehiculo.vehiculos.get(id).anadirSensor(s);
                }
            } else if (num==7){
                System.out.println("Ingrese ID de vehiculo existente: ");
                int id = scan.nextInt();
                Vehiculo v1 = Vehiculo.obtenerVehiculoPorId(id);
                Vehiculo.vehiculos.remove(Vehiculo.vehiculos.size()-1);
                Vehiculo.idActual--;
                if(v1.getColor()==null){
                    System.out.println("Error: No existe un vehiculo con ID " + id);
                } else{
                    System.out.println("Sensores del vehiculo con ID " + id + " (tipo, valor):");
                    System.out.println(Sensor.toStringSensores(v1));
                }
            } else if (num==8){
                System.out.println("Sensores de tipo temperatura (tipo, valor): ");
                System.out.println(Sensor.sensoresTemperatura());
            } else if (num==9){
                System.out.println("Vehiculo con mayor cantidad de sensores /ID, modelo, marca, valor comercial, color (Sensor: tipo, valor)/: ");
                System.out.println(Vehiculo.vehiculoMasSensores());
            } else if (num==10){
                File file = new File("vehiculos.txt");
                try{
                    Scanner input = new Scanner(file);
                    String line;
                    while(input.hasNextLine()){
                        line = input.nextLine();
                        String[] parts = line.split(",");
                        Vehiculo v1 = new Vehiculo(Integer.parseInt(parts[0]), parts[1], Double.parseDouble(parts[2]), parts[3]);
                    }
                }catch(Exception e){
                    System.out.println(e.getMessage());
                }

            } else if (num==666){
                System.out.println("Sensores de tipo temperatura ordenados por valor (tipo, valor): ");
                System.out.println(Sensor.toStringTemperaturasOrdenados(Sensor.SensoresTemperaturasOrdenados()));
            }

        }
    }
}