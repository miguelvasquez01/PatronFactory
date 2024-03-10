package co.edu.uniquindio.poo;

public class EnvioEstandar implements MetodoEnvio{
    @Override
    public void calcularTiempoEntrega() {
        System.out.println("Envio estandar : El tiempo de entrega estimado sera de 4-5 dias");
        
    }
    
}
