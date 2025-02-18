public abstract class Animal {
    protected String nome;
    protected int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public abstract void comer();

    public void imprimir() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }

    /**
     * private -> Apenas a classe principal consegue interagir
     * public -> Qualquer classe tem acesso
     * protected -> Apenas as classes que herdam
     */
}
