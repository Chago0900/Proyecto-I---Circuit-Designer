package logic;

/**
 * Clase que se encarga de la logica de las compuertas
 * @author Santiago Brenes Torres
 * @date 25.9.2019
 */
public class Compuerta {

    private int input1, input2;
    private int output;

    /**
     * Constructor de la clase
     */
    public Compuerta () {
        this.input1 = input1;
        this.input2 = input2;
    }

    /**
     * Metodo de la compuerta AND
     * @return output
     */
    public int and (){
        if (input1 == 1 && input2 == 1){
            output = 1;
            return output;
        }else {
            output = 0;
            return output;
        }
    }

    public int nand (){
        if (input1 == 1 && input2 == 1){
            output = 0;
            return output;
        }else {
            output = 1;
            return output;
        }
    }

    public int or (){
        if (input1 == 0 && input2 == 0){
            output = 0;
            return output;
        }else {
            output = 1;
            return output;
        }
    }

    public int nor (){
        if (input1 == 0 && input2 == 0){
            output = 1;
            return output;
        }else {
            output = 0;
            return output;
        }
    }

    public int not (){
        if(input1 == 0){
            output = 1;
            return output;
        }else{
            output = 0;
            return output;
        }
    }

    public int xor (){
        if (input1 == input2){
            output = 0;
            return output;
        }else {
            output = 1;
            return output;
        }
    }

    public int xnor (){
        if (input1 == input2){
            output = 1;
            return output;
        }else {
            output = 0;
            return output;
        }
    }
}
