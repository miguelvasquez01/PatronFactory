package co.edu.uniquindio.poo;

public class EnvioPrioritario implements MetodoEnvio {
    
    @Override
    public void calcularTiempoEntrega() {
        System.out.println("Envio prioritario : El tiempo de entrega estimado sera de 1-2 dias");
        
    }
    
}
