/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author Estudiantes
 */
public class Operacion {

    private String resultado;

    public Operacion() {
        this.resultado = "";
    }

    public String getResultado(String num1, String num2, String signo) {
        switch (signo) {
            case "+":
                this.resultado = String.valueOf(Integer.parseInt(num1)+Integer.parseInt(num2));
                return resultado;
            case "-":
                this.resultado = String.valueOf(Integer.parseInt(num1)-Integer.parseInt(num2));
                return resultado;
            case "X":
                this.resultado = String.valueOf(Integer.parseInt(num1)*Integer.parseInt(num2));
                return resultado;
            case "/":
                this.resultado = String.valueOf(Integer.parseInt(num1)/Integer.parseInt(num2));
                return resultado;
            default:
                break;
        }
        return "";
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
}
