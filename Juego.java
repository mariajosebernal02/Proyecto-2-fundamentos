import java.util.Scanner;
public class Juego{
            
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int numero = (int)(Math.random()*4+1);         
        
        if(numero==1){
           int tipo = (int)(Math.random()*2+1); 
           if(tipo==1){
               Bicho b1 = new BichoNormal();
               Bicho.bichos[0][0] = b1;
           } else {
               Bicho b1 = new BichoAlien();
               Bicho.bichos[0][0] = b1;
           }
        } else if(numero==2){
            for(int i=0; i<2; i++){
               int tipo = (int)(Math.random()*2+1); 
               if(tipo==1){
                   Bicho b1 = new BichoNormal();
                   Bicho.bichos[0][i] = b1;
               } else {
                   Bicho b1 = new BichoAlien();
                   Bicho.bichos[0][i] = b1;
               }
            }
        } else if(numero==3){
           for(int i=0; i<2; i++){
               int tipo = (int)(Math.random()*2+1); 
               if(tipo==1){
                   Bicho b1 = new BichoNormal();
                   Bicho.bichos[0][i] = b1;
               } else {
                   Bicho b1 = new BichoAlien();
                   Bicho.bichos[0][i] = b1;
               }
           }
           int tipo = (int)(Math.random()*2+1); 
           if(tipo==1){
               Bicho b1 = new BichoNormal();
               Bicho.bichos[1][0] = b1;
           } else {
               Bicho b1 = new BichoAlien();
               Bicho.bichos[1][0] = b1;
           }
        } else if(numero==4){
            for(int j=0; j<2; j++){
                for(int k=0; k<2;k++){
                    int tipo = (int)(Math.random()*2+1); 
                    if(tipo==1){
                        Bicho b1 = new BichoNormal();
                        Bicho.bichos[j][k] = b1;
                    } else {
                        Bicho b1 = new BichoAlien();
                        Bicho.bichos[j][k] = b1;
                    }
                 }
            }
        }
        
        Tablero.imprimirTablero(numero);

        while(true){
            System.out.println("Ingrese posición a la que desea disparar:");
            System.out.println("|1|2|");
            System.out.println("|3|4|");
            int posicion = scan.nextInt();
            
            if(posicion==1){
                Bicho.atacar(Bicho.bichos[0][0]);
            } else if(posicion==2){
                Bicho.atacar(Bicho.bichos[0][1]);
            } else if (posicion==3){
                Bicho.atacar(Bicho.bichos[1][0]);
            } else if (posicion==4){
                Bicho.atacar(Bicho.bichos[1][1]);
            }
            
            Tablero.imprimirTablero(numero);
            
            if(numero==1){
                if(Bicho.bichos[0][0].getSalud()==0){
                    System.out.println("FIN DEL JUEGO");
                    break;
                }
            } else if(numero==2){
                if(Bicho.bichos[0][0].getSalud()==0 && Bicho.bichos[0][1].getSalud()==0){
                    System.out.println("FIN DEL JUEGO");
                    break;
                }
            } else if(numero==3){
                if(Bicho.bichos[0][0].getSalud()==0 && Bicho.bichos[0][1].getSalud()==0 && Bicho.bichos[1][0].getSalud()==0){
                    System.out.println("FIN DEL JUEGO");
                    break;
                }
            } else if (numero==4){
                if(Bicho.bichos[0][0].getSalud()==0 && Bicho.bichos[0][1].getSalud()==0 && Bicho.bichos[1][0].getSalud()==0 && Bicho.bichos[1][1].getSalud()==0){
                    System.out.println("FIN DEL JUEGO");
                    break;
                }
            }
            
        }
    }
    
}
