public abstract class Animal {

    protected float peso;
    protected int idade;
    protected  int membros;

    //METODOS ABSTRATOS NÃO PODEM TER CORPO, ENTÃO NÃO PODE TER "{}", DEVE TERMINAR COM ";"
    public abstract void locomover();

    public abstract void alimentar();

    public abstract void emitirSom();
}
