package ro.aassaa.demo03;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static ro.aassaa.demo03.EcuatieGradDoi.rezolva;

public class EcuatieGradDoiTests {
    @Test
    public void ecuatieNedefinita() {
        assertEquals("Ecuatie nedefinita!",rezolva(0.0,0.0,0.0));
    }

    @Test
    public void ecuatieImposibila() {
        assertEquals("Ecuatie imposibila!", rezolva(0.0, 0.0, 2.0));
    }

    @Test
    public void ecuatieGradUnu() {
        assertEquals("Ecuatie de gradul 1 cu solutia: 3.00", rezolva(0.0, 1.0, -3.0));
    }

    @Test
    public void ecuatieGradDoiCuOSolutieDubla() {
        assertEquals("Ecuatie de gradul 2 cu solutia dubla: 2.00", rezolva(2.0,-8.0, 8.0));
    }

    @Test
    public void ecuatieGradDoiCuDouaSolutiiRealeDistincte() {
        assertEquals("Ecuatie de gradul 2 cu doua solutii reale: 2.00 si 3.00", rezolva(1.0, -5.0, 6.0));
    }

    @Test
    public void ecuatieGradDoiCuDouaSolutiiComplexe() {
        assertEquals("Ecuatie de gradul 2 cu doua solutii complexe: 1.00 - 2.00i, 1.00 + 2.00i", rezolva(1,-2,5));
    }

    @Test
    public void ecuatieGradDoiCuDouaSolutiiComplexe2() {
        assertEquals("Ecuatie de gradul 2 cu doua solutii complexe: 1.00 - 2.00i, 1.00 + 2.00i", rezolva(-1,2,-5));
    }
}

