package sample.model;

public class Endereço {

    private String rua;
    private String bairro;
    private int numero;
    private String cidade;


    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getRua(){
        return rua;
    }

    public void setBairro(String bairro){
        this.bairro = bairro;
    }
    public String getBairro(){
        return bairro;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }
    public int getNumero(){
        return this.numero;
    }
    public void setCidade(String cidade){
        this.cidade = cidade;
    }
    public String getCidade(){
        return cidade;
    }


    @Override
    public String toString() {
        return "Endereço{" +
                "rua='" + rua + '\'' +
                ", bairro='" + bairro + '\'' +
                ", numero=" + numero +
                ", cidade='" + cidade + '\'' +
                '}';
    }
}

