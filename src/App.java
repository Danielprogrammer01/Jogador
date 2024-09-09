import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Jogador jogador = new Jogador("Carlos", "Defesa", LocalDate.of(1985, 6, 20), 1.80f, 75.0f);

        // Usando o método imprimirDados()
        jogador.imprimirDados(); 
        // Saída:
        // DADOS DO JOGADOR
        // Nome: Carlos
        // Posição: Defesa
        // Data de Nascimento: 1985-06-20
        // Altura: 1.8
        // Peso: 75.0

        // Calculando e imprimindo a idade
        jogador.calculaIdade(); 
        // Saída (supondo que o ano atual seja 2024):
        // Idade de Carlos: 39 anos

        // Verificando se o jogador pode se aposentar
        jogador.aposentar(); 
        // Saída:
        // Falta 1 anos para Carlos se aposentar!

        // Alterando alguns atributos do jogador
        jogador.setNome("Lucas");
        jogador.setPosicao("Ataque");
        jogador.setAltura(1.85f);
        jogador.setPeso(78.0f);
        jogador.setDataNascimento(LocalDate.of(1984, 9,9));

        // Imprimindo dados atualizados
        jogador.imprimirDados();
        // Saída:
        // DADOS DO JOGADOR
        // Nome: Lucas
        // Posição: Ataque
        // Data de Nascimento: 1985-06-20
        // Altura: 1.85
        // Peso: 78.0

        // Calculando a idade e verificando aposentadoria após as alterações
        jogador.calculaIdade();
        jogador.aposentar();
        // Saída:
        // Falta 4 anos para Lucas se aposentar!
        


    
    }
}



