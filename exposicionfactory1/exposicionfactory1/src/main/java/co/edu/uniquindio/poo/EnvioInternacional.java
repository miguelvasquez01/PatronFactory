package co.edu.uniquindio.poo;

public class EnvioInternacional implements MetodoEnvio{
    
    @Override
    public void calcularTiempoEntrega() {
        System.out.println("Envio internacional : El tiempo de entrega estimado sera de 1 semana");
        
    }
}
