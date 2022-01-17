/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Emc24361230K;

/**
 * @version 1.2
 * @author Enrique Martinez crespo
 */
public class Emc24361230K {

    static final double FACTOR_HORA_EXTRA = 1.2;
    private String nombreCompleto, dni;
    private double salarioBasePorHora = 10.56;

    /**
     * 
     * @param nombreCompleto especificamos el nombre
     * @param dni especificamos el DNI
     */
    public void AnalistaED_24361230K(String nombreCompleto, String dni) {
        this.nombreCompleto = nombreCompleto;
        this.dni = dni; 

    }

    /**
     * 
     * @param horasExtra nos dice las horas extra realizadas
     * @return nos devuelve el salario final
     */
    public double getSalarioEsteMes(int horasExtra) {
        double cantidadExtra, salarioFinal;
        cantidadExtra = horasExtra * this.salarioBasePorHora
                * FACTOR_HORA_EXTRA;
        salarioFinal = this.salarioBasePorHora * 40 * 4 + cantidadExtra;
        salarioFinal = (double) Math.round(salarioFinal * 100d) / 100d;
        return salarioFinal;
    }

    
}
