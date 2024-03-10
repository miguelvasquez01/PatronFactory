package co.edu.uniquindio.poo;

/**
 * Hello world!
 *
 */
public class App {
    
    public static void main( String[] args ) throws NoSuchFieldException{
        procesarEnvio(TipoEnvio.ENVIO_AIRE);
        procesarEnvio(TipoEnvio.ENVIO_ESTANDAR);
    }
    
    public static void procesarEnvio(TipoEnvio tipoEnvio) throws NoSuchFieldException{
        EnvioFactory envioFactory = new EnvioFactory();
        MetodoEnvio metodoEnvio = envioFactory.obtenerMetodoEnvio(tipoEnvio);
        metodoEnvio.calcularTiempoEntrega();
    }
}
