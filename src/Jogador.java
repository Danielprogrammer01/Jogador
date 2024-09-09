import java.time.LocalDate;
import java.time.Period;

public class Jogador {

    private String nome;
    private String posicao;
    private LocalDate dataNascimento;
    private float altura;
    private float peso;
    private int idade;
    private LocalDate dataAtual = LocalDate.now();


    public Jogador(String nome,String posicao, LocalDate dataNascimento, float altura, float peso){

        setNome(nome);
        setPosicao(posicao);
        setDataNascimento(dataNascimento);
        setAltura(altura);
        setPeso(peso);


    }

    public void imprimirDados(){

        System.out.println("DADOS DO JOGADOR");
        System.out.println("Nome: " + getNome());
        System.out.println("Posição: " + getPosicao());
        System.out.println("Data de Nascimento: " + toString());
        System.out.println("Altura: " + getAltura());
        System.out.println("Peso: " + getPeso());


    }

    public void calculaIdade(){

        Period idade = Period.between(dataNascimento, dataAtual);
        this.idade = idade.getYears();

        System.out.println("Idade de " + getNome() + ": " + this.idade + " anos");
    }

    public void aposentar(){

        int idadeLimite = 0;

        switch (posicao) {
            case "Defesa":
                idadeLimite = 40;
                break;
            case "Meio-campo":
                idadeLimite = 38;
                break;
            case "Ataque":
                idadeLimite = 35;
                break;
            default:
                System.out.println("Posição inválida!");
                return;
        }
    
        if (idade < idadeLimite) {
            int tempo = idadeLimite - idade;
            if (tempo == 1) {
                System.out.println("Falta " + tempo + " ano para " + getNome() + " se aposentar!");
            } else{
                System.out.println("Falta " + tempo + " anos para " + getNome() + " se aposentar!");
            }
        } else {
            System.out.println(getNome() + " já pode se aposentar!");
        }
    

        //     int tempo = 0;

        //     if (posicao == "Defesa") {
        //         if (idade < 40) {
        //             tempo = 40 - idade;
        //             System.out.println("Falta " + tempo + "anos para " + getNome() + " se aposentar!");
        //         } else{
        //             System.out.println(getNome() + " já pode se aposentar!");                
        //         }
        //     }

        //     if (posicao == "Meio-campo") {
        //         if (idade < 38) {
        //             tempo = 38 - idade;
        //             System.out.println("Falta " + tempo + "anos para " + getNome() + " se aposentar!");
        //         } else{
        //             System.out.println(getNome() + " já pode se aposentar!");                
        //         }
        //     }

        //     if (posicao == "Ataque") {
        //         if (idade < 35) {
        //             tempo = 35 - idade;
        //             System.out.println("Falta " + tempo + "anos para " + getNome() + " se aposentar!");
        //         } else{
        //             System.out.println(getNome() + " já pode se aposentar!");                
        //         }
        //     }
        
    }


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getPosicao() {
        return posicao;
    }
    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        
        
        if(dataNascimento.getMonthValue() < 10){
            
            return dataNascimento.getDayOfMonth() + "/" + "0" + dataNascimento.getMonthValue() + "/" + dataNascimento.getYear();
            
        } else{

            return dataNascimento.getDayOfMonth() + "/" + dataNascimento.getMonthValue() + "/" + dataNascimento.getYear();

        }

        
    }

    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }

    

}
