package Ejercicio3;

public class Calculadora {
    private Integer a;
    private Integer b;
    public Calculadora(Integer a, Integer b) {
        this.a = a;
        this.b = b;
    }

    public Integer Suma(){
        return  a+b;
    }
    public Integer Resta(){
        return  a - b;
    }
    public Integer Multi(){
        return  a * b;
    }
    public Integer Division(){
        return a/b;
    }

}
