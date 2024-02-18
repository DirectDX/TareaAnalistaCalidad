import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnalistaDeCalidadTest {
    @Test
    public void testComprobarEnvaseAceptado() {
        AnalistaDeCalidad analista = new AnalistaDeCalidad();
        Articulo articulo = new Articulo("Alfajor", 1250, 1250,"sano"); // envase "sano", peso dentro del rango, lote dentro del rango
        String resultado = analista.comprobarEnvase(articulo);
        assertEquals("envase aceptado", resultado);
    }

    @Test
    public void testComprobarEnvaseRechazado() {
        AnalistaDeCalidad analista = new AnalistaDeCalidad();
        Articulo articulo = new Articulo("Alfajor", 1250, 1250,"deteriorado"); // envase "deteriorado", otros valores dentro del rango
        String resultado = analista.comprobarEnvase(articulo);
        assertEquals("envase rechazado", resultado);
    }

    @Test
    public void testComprobarPesoAceptado() {
        AnalistaDeCalidad analista = new AnalistaDeCalidad();
        Articulo articulo = new Articulo("Alfajor", 1250, 1250,"sano"); // envase "sano", peso fuera del rango, lote dentro del rango
        String resultado = analista.comprobarPeso(articulo);
        assertEquals("peso aceptado", resultado);
    }

    @Test
    public void testComprobarPesoRechazado() {
        AnalistaDeCalidad analista = new AnalistaDeCalidad();
        Articulo articulo = new Articulo("Alfajor", 1100, 1500,"sano"); // envase "sano", peso fuera del rango, lote dentro del rango
        String resultado = analista.comprobarPeso(articulo);
        assertEquals("peso rechazado", resultado);
    }

    @Test
    public void testComprobarLoteAceptado() {
        AnalistaDeCalidad analista = new AnalistaDeCalidad();
        Articulo articulo = new Articulo("Alfajor", 1250, 1500,"sano"); // envase "sano", peso dentro del rango, lote dentro del rango
        String resultado = analista.comprobarLote(articulo);
        assertEquals("lote aceptado", resultado);
    }

    @Test
    public void testComprobarLoteRechazado() {
        AnalistaDeCalidad analista = new AnalistaDeCalidad();
        Articulo articulo = new Articulo("Alfajor", 999, 1300,"sano"); // envase "sano", peso dentro del rango, lote fuera del rango
        String resultado = analista.comprobarLote(articulo);
        assertEquals("lote rechazado", resultado);
    }

}