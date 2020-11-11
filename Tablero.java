public class Tablero {
    public int posicion = 0;

    Tablero(){
    }
    
    public static void imprimirTablero(int num){
        if(num==1){
            System.out.println("-------------");
            System.out.println("|" + Bicho.bichos[0][0].toString() + "|     |");
            System.out.println("-------------");
            System.out.println("|     |     |");
            System.out.println("-------------");
        } else if (num==2){
            System.out.println("-------------");
            System.out.println("|" + Bicho.bichos[0][0].toString() + "|"+ Bicho.bichos[0][1].toString() + "|");
            System.out.println("-------------");
            System.out.println("|     |     |");
            System.out.println("-------------");
        } else if (num==3){
            System.out.println("-------------");
            System.out.println("|" + Bicho.bichos[0][0].toString() + "|"+ Bicho.bichos[0][1].toString() + "|");
            System.out.println("-------------");
            System.out.println("|" + Bicho.bichos[1][0].toString() + "|     |");
            System.out.println("-------------");
        } else if (num==4){
            System.out.println("-------------");
            System.out.println("|" + Bicho.bichos[0][0].toString() + "|"+ Bicho.bichos[0][1].toString() + "|");
            System.out.println("-------------");
            System.out.println("|" + Bicho.bichos[1][0].toString() + "|"+ Bicho.bichos[1][1].toString() + "|");
            System.out.println("-------------");
        }  


    }
}