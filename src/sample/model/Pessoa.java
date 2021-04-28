package sample.model;

/** Classes */

public class Pessoa {
    private String nome;
    private String dataNascimento;
    private Endereço endereço;

    /** Getter e Setter */

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public Endereço getEndereço(){
        return this.endereço;
    }
    public void setEndereço(Endereço endereço){
        this.endereço = endereço;
    }
    public void setEndereço(String rua, int numero, String bairro, String cidade){
        Endereço endereço = new Endereço();
        endereço.setRua(rua);
        endereço.setNumero(numero);
        endereço.setBairro(bairro);
        endereço.setCidade(cidade);
        this.setEndereço(endereço);
    }

    /** ToString */

    @Override
    public String toString() {
        return "Nome: " + nome +
                ", data Nascimento: " + dataNascimento + " " + endereço ;
    }
}
