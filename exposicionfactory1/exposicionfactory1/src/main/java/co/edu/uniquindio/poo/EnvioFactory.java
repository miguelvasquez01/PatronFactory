package co.edu.uniquindio.poo;

public class EnvioFactory {
    public MetodoEnvio obtenerMetodoEnvio(TipoEnvio tipoEnvio) throws NoSuchFieldException{
        return switch (tipoEnvio) { 
            case ENVIO_AIRE -> new EnvioAire();
            case ENVIO_ESTANDAR -> new EnvioEstandar();
            case ENVIO_EXPRESS -> new EnvioExpress();
            case ENVIO_INTERNACIONAL -> new EnvioInternacional();
            case ENVIO_MAR -> new EnvioMar();
            case ENVIO_PRIORITARIO -> new EnvioPrioritario();
            default -> throw new NoSuchFieldException("Metodo De envio no encontrado");
    };
}

}