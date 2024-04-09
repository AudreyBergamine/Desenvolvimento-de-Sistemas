public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ola Mundo");
        Veiculo carro = new Veiculo();
        
        carro.setVelocidade(40);
        
        carro.acelerar();
        
        carro.parar();

        carro.buzinar();
    }
    
}
