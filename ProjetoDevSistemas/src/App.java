public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ola Mundo");
        Veiculo honda = new Veiculo();
        
        honda.setVelocidade(40);
        
        honda.acelerar();
        
        honda.parar();

        honda.buzinar();
    }
    
}
