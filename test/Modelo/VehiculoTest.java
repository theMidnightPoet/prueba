/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Modelo;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author oarboleda
 */
public class VehiculoTest {
    
    public VehiculoTest() {
    }

    /**
     * Test of calcularCostoBase method, of class Vehiculo.
     */
    @Test
    public void testCalcularCostoBase_añoMenor() {
        System.out.println("testCalcularCostoBase_añoMenor");
        Vehiculo instance = new Vehiculo("JKU 298","Martha",20000.0,new RegistroTecnico("RT01","Bogota",2017));
        assertEquals(16000.0, instance.calcularCostoBase(), 0);
    }
    
    @Test
      public void testCalcularCostoBase_añoMayor() {
        System.out.println("testCalcularCostoBase_añoMayor");
        Vehiculo instance = new Vehiculo("JKU 298","Martha",20000.0,new RegistroTecnico("RT01","Bogota",2024));
        double expResult = 24000.0;
        double result = instance.calcularCostoBase();
        assertEquals(expResult, result, 0);
    }
    
    @Test
    public void testCalcularCostoBase_añoIgual() {
        System.out.println("testCalcularCostoBase_añoIgual");
        Vehiculo instance = new Vehiculo("JKU 298","Martha",20000.0,new RegistroTecnico("RT01","Bogota",2020));
        double expResult = 24000.0;
        double result = instance.calcularCostoBase();
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of calcularCostoBase method, of class Vehiculo.
     */
    @Test
    public void testCalcularCostoBase_double() {
        System.out.println("calcularCostoBase");
        double factor = 2.2;
        Vehiculo instance = new Vehiculo("JKU 298","Martha",20000.0,new RegistroTecnico("RT01","Bogota",2017));
        String expResult = "35200.0 INCREMENTO SIGNIFICATIVO";
        String result = instance.calcularCostoBase(factor);
        assertEquals(expResult, result);
    } 
}
