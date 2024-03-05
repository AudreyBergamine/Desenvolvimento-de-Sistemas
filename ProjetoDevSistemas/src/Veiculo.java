public class Veiculo {
    private 
            String marca, modelo, placa_veiculo, cor;
            int ano_fabricacao, velocidade;
            float potencia_motor;

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca_veiculo() {
        return placa_veiculo;
    }

    public void setPlaca_veiculo(String placa_veiculo) {
        this.placa_veiculo = placa_veiculo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno_fabricacao() {
        return ano_fabricacao;
    }

    public void setAno_fabricacao(int ano_fabricacao) {
        this.ano_fabricacao = ano_fabricacao;
    }

    public float getPotencia_motor() {
        return potencia_motor;
    }

    public void setPotencia_motor(float potencia_motor) {
        this.potencia_motor = potencia_motor;
    }
    
    public void acelerar() {
        velocidade++;
        System.out.println("Acelerando... Velocidade: " + getVelocidade());
    }
    
    public void parar() {
        velocidade--;
        System.out.println("Parando... Velocidade: " + getVelocidade());
    }
    
    public void buzinar() {
        System.out.println("Bibi");
    }
           
            
 
            
}


