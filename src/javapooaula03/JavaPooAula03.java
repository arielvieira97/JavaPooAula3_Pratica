package javapooaula03;


public class JavaPooAula03 {
    public static void main(String[] args) {
       
        Caneta c1 = new Caneta ();
        c1.modelo = "BIC Cristal";
        c1.cor = "azul";
        //c1.ponta = 0.5f; (metodo que nao tem como usar desta forma)
        c1.carga = 80;
        c1.destampar(); //(tampada é privada, porem o metodo destampar ou tampar nao é)
        c1.status();
       
    }
    
}
