public class Tablero {

    Tablero(){
    }
    
    public static void imprimirTablero(int num){
        String texto1 = "     ";
        String texto2 = "     ";
        String texto3 = "     ";
        String texto4 = "     ";
        
        if(Bicho.bichos[0][0]!=null){
            texto1 = Bicho.bichos[0][0].toString();
        } 
        if(Bicho.bichos[0][1]!=null){
            texto2 = Bicho.bichos[0][1].toString();
        } 
        if(Bicho.bichos[1][0]!=null){
            texto3 = Bicho.bichos[1][0].toString();
        } 
        if(Bicho.bichos[1][1]!=null){
            texto4 = Bicho.bichos[1][1].toString();
        } 
        
        System.out.println("-------------");
        System.out.println("|" + texto1 + "|"+ texto2 + "|");
        System.out.println("-------------");
        System.out.println("|" + texto3 + "|"+ texto4 + "|");
        System.out.println("-------------");
    }
}