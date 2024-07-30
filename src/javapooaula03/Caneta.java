package javapooaula03;

public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
    
    public void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("uma caneta " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println(" esta tampada? " + this.tampada);
    }
    
    public void rabiscar() {
        if (this.tampada == true) {
            System.out.println("ERRO! Nao posso rabiscar");
        } else {
            System.out.println("Estou Rabiscando");
        }
    }
    
    protected void tampar() {
        this.tampada = true;
 }
    
    protected void destampar() {
        this.tampada = false;
    }
}
