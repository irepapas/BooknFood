public class Food extends Prodotto{
    private float peso;
    private int durata;

    Food(String nome, int prezzo, float peso, int durata){
        super(nome,prezzo);
        this.peso=peso;
        this.durata=durata;
    }
    public float getPeso() {
        return peso;
    }
    public int getDurata() {
        return durata;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }
    String getInfoAutore(){
        String info;
        info = " Il libro scelto è :" + "\n";
        info+= getInfoProdotto() + "\n";
        info+= " Peso: " + peso + " Scadenza: " + durata;
        return info;
    }
    
}
