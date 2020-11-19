import java.util.Scanner;
public class Juego{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int numero = (int)(Math.random()*4+1);   
        
        int izquierda=0;
        int derecha=0;
        
        for(int i=0; i<numero; i++){
            int tipo = (int)(Math.random()*2+1);
            
            if(tipo==1){
                Bicho b1 = new BichoNormal();
                Bicho.bichos[izquierda][derecha] = b1;
            } else {
                Bicho b1 = new BichoAlien();
                Bicho.bichos[izquierda][derecha] = b1;
            }
            
            if(derecha==0){
                derecha++;
            } else if (izquierda==0 && derecha==1){
                izquierda++;
                derecha--;
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

            int contadorVivos=0;
            for(int i=0; i<2; i++){
                for(int j=0; j<2; j++){
                    if(Bicho.bichos[i][j]!=null && Bicho.bichos[i][j].getSalud()!=0){
                        contadorVivos++;
                    }
                }
            }

            if(contadorVivos==0){
                System.out.println("FIN DEL JUEGO");
                break;
            }

        }
    }
}
