public class Reptil extends Animal{
    protected boolean temEscama;
    protected boolean temPatas;
    protected boolean venenoso;

    public Reptil(String nome, int idade, boolean temEscama, boolean temPatas, boolean venenoso) {
        super(nome, idade);
        this.temEscama = temEscama;
        this.temPatas = temPatas;
        this.venenoso = venenoso;
    }

    @Override
    public void comer() {
        System.out.println("Comendo!!!");
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Tem escama: " + (temEscama ? "sim" : "não"));
        System.out.println("Patas: " + (temPatas ? "sim" : "não"));
        System.out.println("Venenoso: " + (venenoso ? "sim" : "não"));
    }
}
