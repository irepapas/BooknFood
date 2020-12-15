public class Prodotto {
    private String nome;
    private int prezzo;//migliorabile con float

    Prodotto(String nome, int prezzo){
        this.nome=nome;
        this.prezzo=prezzo;
    }
    public String getNome() {
        return nome;
    }
    public int getPrezzo() {
        return prezzo;
    }
    String getInfoProdotto(){
        String info;
        info= "Il prodotto selezionato è:" + "\n";
        info+= " Nome: " + nome +"\n";
        info+= " Prezzo: " + prezzo + "€ \n";
        return info;
    }
    
}
