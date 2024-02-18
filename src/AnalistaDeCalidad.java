public class AnalistaDeCalidad {

    public AnalistaDeCalidad() {
    }

    public String comprobarEnvase(Articulo articulo) {
        String respuesta = "envase rechazado";
        if ( articulo.getEnvasado().equals("sano")) {
            respuesta = "envase aceptado";
            comprobarPeso(articulo);
        }
        return respuesta;
    }

    public String comprobarPeso(Articulo articulo) {
        String respuesta = "peso rechazado";
        if (articulo.getPeso()>=1200 && articulo.getPeso()<=1300) {
            respuesta = "peso aceptado";
            comprobarLote(articulo);
        }
        return respuesta;
    }

    public String comprobarLote(Articulo articulo) {
        String respuesta = "lote rechazado";
        if (articulo.getLote()>=1000 && articulo.getLote()<=2000) {
            respuesta = "lote aceptado";
        }
        return respuesta;
    }

    public void comprobarCalidad(Articulo articulo) {
        comprobarEnvase(articulo);


    }
}
