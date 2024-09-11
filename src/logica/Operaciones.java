package logica;

public class Operaciones {

    double numeroUno;
    double numeroDos;


    public Operaciones(double numeroUno, double numeroDos){
        this.numeroUno = numeroUno;
        this.numeroDos = numeroDos;
    }

    public double suma(){
        return numeroUno + numeroDos;
    }

    public double resta(){
        return numeroUno - numeroDos;
    }

    public double multiplicacion(double numUno, double numDos){
        return numUno * numDos;
    }

    public double division(double numUno, double numDos){
        if(numDos != 0){
            return numUno / numDos;
        }else{
            System.out.println("No se puede dividir un numero en cero");
            return 0;
        }
    }
}
