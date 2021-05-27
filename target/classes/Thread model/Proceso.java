package clases;

public class Proceso extends Thread{
    int num;
    public Proceso(String NombreHilo){
        super(NombreHilo);
    }
    
    @Override
    public void run(){
        int contador = 2;
        boolean primo=true;
        while ((primo) && (contador!=num)){
            if (num % contador == 0){
                primo = false;
            }
            contador++;
        }
        if (primo){
            System.out.println(this.getName() + "SI es primo");
        } else {
            System.out.println(this.getName() + "NO es primo");
        }

    }
    public void ValorDeLaCondicion(int valor){
        this.num = valor;
    }
}
