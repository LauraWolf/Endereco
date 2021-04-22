package sample;

import sample.model.Endereço;
import sample.model.Pessoa;

public class Main {

    public static void main(String[] args) {

        Endereço endereço = new Endereço();
        endereço.setRua("sete de setembro");
        System.out.println("Rua: " + endereço.getRua());
        endereço.setBairro("Centro");
        System.out.println("Bairro: " + endereço.getBairro());
        endereço.setNumero(190);
        System.out.println("Numero: " + endereço.getNumero());
        endereço.setCidade("Parabranco");
        System.out.println("Cidade: " + endereço.getCidade());
        Pessoa pessoa = new Pessoa();
        pessoa.setDataNascimento("19/8/2004");
        pessoa.setNome("mariazinha");
        pessoa.setEndereço(endereço);

        System.out.println(pessoa);

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("pedrinho");
        pessoa2.setDataNascimento("08/02/2005");
        pessoa2.setEndereço("Rio Branco", 354, "Centro", "Florianópolis");
        System.out.println(pessoa2);

    }
}
