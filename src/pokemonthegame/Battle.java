package pokemonthegame;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Battle{

    // Declaração de uma variável de instância "trainers" que é um array de 4 objetos da classe "Trainer"
    private Trainer[] trainers = new Trainer[4];

    // Construtor que recebe um array de objetos da classe "Trainer" e inicializa a variável de instância "trainers" com esses objetos
    public Battle(Trainer[] trainers) {
        this.trainers = trainers;
    }

    // Método que retorna o array de objetos da classe "Trainer"
    public Trainer[] getTrainers() {
        return trainers;
    }

    // Método que modifica o array de objetos da classe "Trainer"
    public void setTrainers(Trainer[] trainers) {
        this.trainers = trainers;
    }
    
    
    public String showOpponents() {
    // Imprime uma linha com asteriscos para separar o resultado
    System.out.println("********************************************************");

    // Verifica se todos os três oponentes estão disponíveis para batalha
    if (trainers[1].getAvaibleForBattle() == 'd' && trainers[2].getAvaibleForBattle() == 'd' && trainers[3].getAvaibleForBattle() == 'd') {
        // Retorna a lista de oponentes disponíveis
        return "1 - Gary, " + "2 - Dawn, " + "3 - Gym Leader Brock" + " 4 - Log out";

    // Verifica se Gary e Dawn estão disponíveis para batalha
    } else if (trainers[1].getAvaibleForBattle() == 'd' && trainers[2].getAvaibleForBattle() == 'd') {
        // Retorna a lista de oponentes disponíveis
        return "1 - Gary, " + "2 - Dawn" + " 4 - Log out";

    // Verifica se Gary e Brock estão disponíveis para batalha
    } else if (trainers[1].getAvaibleForBattle() == 'd' && trainers[3].getAvaibleForBattle() == 'd') {
        // Retorna a lista de oponentes disponíveis
        return "1 - Gary, " + "3 - Gym Leader Brock" + " 4 - Log out";

    // Verifica se Dawn e Brock estão disponíveis para batalha
    } else if (trainers[2].getAvaibleForBattle() == 'd' && trainers[3].getAvaibleForBattle() == 'd') {
        // Retorna a lista de oponentes disponíveis
        return "2 - Dawn e 3 - Gym Leader Brock" + " 4 - Log out";

    // Verifica se Gary está disponível para batalha
    } else if (trainers[1].getAvaibleForBattle() == 'd') {
        // Retorna a lista de oponentes disponíveis
        return "1 - Gary" + " 4 - Log out";

    // Verifica se Dawn está disponível para batalha
    } else if (trainers[2].getAvaibleForBattle() == 'd') {
        // Retorna a lista de oponentes disponíveis
        return "2 - Dawn" + " 4 - Log out";

    // Caso contrário, Brock está disponível para batalha
    } else {
        // Retorna a lista de oponentes disponíveis
        return "3 - Gym Leader Brock" + " 4 - Log out";
    }
}


    
   public String chooseOpponent(int opponent) {

    // Reseta os HPs e número de usos dos movimentos dos Pokémon do jogador
    for (int i = 0; i < 2; i++) {
        trainers[0].getPokemon()[i].setHp(200);
        trainers[0].getPokemon()[i].getMoves()[0].setMoveUse(10);
        trainers[0].getPokemon()[i].getMoves()[1].setMoveUse(8);
        trainers[0].getPokemon()[i].getMoves()[2].setMoveUse(5);
        trainers[0].getPokemon()[i].getMoves()[3].setMoveUse(2);
    }
    
    // Verifica se o oponente escolhido pelo jogador está disponível para batalha
    if (opponent == 1 && trainers[1].getAvaibleForBattle() == 'd') {
        // Marca o oponente como "f" para indicar que já foi escolhido
        trainers[1].setAvaibleForBattle('f');
        // Inicia a batalha com o oponente escolhido
        return battle(trainers[1]);
    } else if (opponent == 2 && trainers[2].getAvaibleForBattle() == 'd') {
        trainers[2].setAvaibleForBattle('f');
        return battle(trainers[2]);
    } else if (opponent == 3 && trainers[3].getAvaibleForBattle() == 'd') {
        trainers[3].setAvaibleForBattle('f');
        return battle(trainers[3]);
    } else if (opponent == 4) {
        // O jogador escolheu sair do jogo
        return "You logged out the game! See ya!";
    } else {
        // O jogador escolheu uma opção inválida
        return "Invalid option!";
    }
}


    public String battle(Trainer trainer) {
        Scanner entrada = new Scanner(System.in); // Cria um objeto Scanner para receber entradas do usuário
        int i = 0, j = 0, k = 0,z = 0, op;
        for (z = 0; i < 2; i++){
            trainers[0].setQntPokemon(2); // Configura a quantidade de pokémons do primeiro treinador como 2
            trainer.setQntPokemon(2); // Configura a quantidade de pokémons do segundo treinador como 2
        }
        // Loop que será executado enquanto os segundos pokémons de ambos treinadores tiverem pontos de vida (hp) maiores que 0
        while (trainers[0].getPokemon()[1].getHp() > 0 && trainer.getPokemon()[1].getHp() > 0) {
            // Se o primeiro pokémon do primeiro treinador estiver sem pontos de vida (hp)
            if (trainers[0].getPokemon()[0].getHp() <= 0) {
                j = 1;
            }
            if (trainer.getPokemon()[0].getHp() <= 0) {
                if(k == 0)
                    trainer.setQntPokemon(trainer.getQntPokemon() - 1);
                k = 1;
                
            }
            // O código abaixo realiza a impressão na tela de informações sobre a batalha entre os treinadores.
            // São mostrados o número de pokémons de cada treinador, o turno atual, nome, nível e HP dos pokémons em combate, assim como as opções de ataque disponíveis para o pokémon do treinador que está jogando.
            System.out.println("********************************************************");
            System.out.println("Red has " + trainers[0].getQntPokemon() + " pokemons!");
            System.out.println(trainer.getName()+ " has " + trainer.getQntPokemon() + " pokemons!");
            System.out.println("\nTurn: " + (z + 1));
            System.out.println("Your Pokemon: " + trainers[0].getPokemon()[j].getName() + "(LV" + trainers[0].getPokemon()[j].getLevel() + ")" + "HP: " + trainers[0].getPokemon()[j].getHp() + "/200");
            System.out.println("-------------------VS-------------------");
            System.out.println("Enemy Pokemon: " + trainer.getPokemon()[k].getName() + "(LV" + trainer.getPokemon()[k].getLevel() + ")" + "HP: " + trainer.getPokemon()[k].getHp()+ "/200.0");
            System.out.println("\nWhat attack your " + trainers[0].getPokemon()[0].getName() + " should use?");
            System.out.println("(1) " + trainers[0].getPokemon()[j].getMoves()[0]);
            System.out.println("(2) " + trainers[0].getPokemon()[j].getMoves()[1]);
            System.out.println("(3) " + trainers[0].getPokemon()[j].getMoves()[2]);
            System.out.println("(4) " + trainers[0].getPokemon()[j].getMoves()[3]);
            
            // Entrada de dados pelo usuário
            do{
                op = entrada.nextInt();
                // Verifica se o movimento escolhido pode ser usado
                if(trainers[0].getPokemon()[j].getMoves()[op - 1].getMoveUse() < 0){
                    System.err.println("Please re-enter another valid option!");
                }else{
                    // Define o uso do movimento escolhido para -1
                    trainers[0].getPokemon()[j].getMoves()[op - 1].setMoveUse(trainers[0].getPokemon()[j].getMoves()[op - 1].getMoveUse() - 1);
                }
                
            }while (trainers[0].getPokemon()[j].getMoves()[op - 1].getMoveUse() < 0);
            // Exibe a velocidade do Pokémon que ataca primeiro e o resultado do ataque
            System.out.println(SpdTest(trainer.getPokemon()[k], trainers[0].getPokemon()[j], op));
            i++;   
        }
        // Verifica se algum dos Pokémon foi nocauteado
        if (trainers[0].getPokemon()[1].getHp() > 0) {
            return "Round Winner: " + trainers[0].getName();
        }
        return "Round Winner: " + trainer.getName();
    }

    // Função para testar a velocidade dos dois Pokemons e decidir quem ataca primeiro
    public String SpdTest(Pokemon pokemonAdv, Pokemon pokemonJog, int nGolpe) {
        // Se o Pokemon adversário tiver mais velocidade, ele ataca primeiro
        if (pokemonAdv.getSpd() > pokemonJog.getSpd()) {
            return dmgMath(pokemonAdv, pokemonJog, nGolpe);
        }
        // Senão, o Pokemon do jogador ataca primeiro
        else {
            return dmgMath(pokemonJog, pokemonAdv, nGolpe);
        }
    }

    public String dmgMath(Pokemon pokemonR, Pokemon pokemonL, int nGolpe) {
    // Cria um objeto Random para gerar números aleatórios
    Random random = new Random(); 

    // Escolhe um número aleatório entre 0 e 2 (inclusive)
    int dmgAdv = random.nextInt(3);

    // Variável para guardar o dano causado
    float dmg;

    // Verifica se o Pokemon à esquerda é Pikachu ou Feraligatr
    if (pokemonL.getName().equals("Pikachu") || pokemonL.getName().equals("Feraligatr")) {
        // Calcula o dano causado pelo golpe aleatório do Pokemon à direita
        dmg = ((pokemonR.getAtk() + pokemonR.getMoves()[dmgAdv].getMovePower()) - pokemonL.getDef()) * dmgMultiplier(pokemonR, pokemonL);

        // Reduz a vida do Pokemon à esquerda pelo dano causado
        pokemonL.setHp(pokemonL.getHp() - dmg);

        // Verifica se o Pokemon à esquerda foi nocauteado
        if (pokemonL.getHp() <= 0) {
            return pokemonL.getName() + " was knocked out\n";
        }

        // Calcula o dano causado pelo golpe escolhido pelo treinador do Pokemon à direita
        dmg = ((pokemonR.getAtk() + pokemonR.getMoves()[nGolpe - 1].getMovePower()) - pokemonL.getDef()) * dmgMultiplier(pokemonR, pokemonL);

        // Reduz a vida do Pokemon à direita pelo dano causado
        pokemonR.setHp(pokemonR.getHp() - dmg);

        // Verifica se o Pokemon à direita foi nocauteado
        if (pokemonR.getHp() <= 0) {
            return pokemonR.getName() + " was knocked out\n";
        }

        // Se nenhum dos dois Pokemons foi nocauteado, retorna que ambos estão vivos
        return "Both Pokemon are alive!\n";
    } else {
        // Calcula o dano causado pelo golpe escolhido pelo treinador do Pokemon à direita
        dmg = ((pokemonR.getAtk() + pokemonR.getMoves()[nGolpe - 1].getMovePower()) - pokemonL.getDef()) * dmgMultiplier(pokemonR, pokemonL);

        // Reduz a vida do Pokemon à esquerda pelo dano causado
        pokemonL.setHp(pokemonL.getHp() - dmg);

        // Verifica se o Pokemon à esquerda foi nocauteado
        if (pokemonL.getHp() <= 0) {
            // Se foi nocauteado, diminui a quantidade de Pokemons do treinador da esquerda e retorna que o Pokemon foi nocauteado
            trainers[0].setQntPokemon(trainers[0].getQntPokemon() - 1);
            return pokemonL.getName() + " was knocked out\n";
        }

        // Verifica se o Pokemon à esquerda é Entei ou Sceptile
        if(pokemonL.getName().equals("Entei") || pokemonL.getName().equals("Sceptile")){
            // Se for Entei ou Sceptile, calcula o dano causado pelo golpe aleatório do Pokemon à esquerda e aplica um multiplicador de 1.25
            dmg = ((pokemonL.getAtk() + pokemonL.getMoves()[dmgAdv].getMovePower()) - pokemonR.getDef());
                dmg = (0.25f * dmg) + dmg;
            }else{
                dmg = ((pokemonL.getAtk() + pokemonL.getMoves()[dmgAdv].getMovePower()) - pokemonR.getDef());
            }
            pokemonR.setHp(pokemonR.getHp() - (dmg * dmgMultiplier(pokemonR, pokemonL)));
            //Se o pokemon a direita chegar a zero, ele será nocauteado
            if (pokemonR.getHp() <= 0) {
                trainers[0].setQntPokemon(trainers[0].getQntPokemon() - 1);
                return pokemonR.getName() + " was knocked out\n";
            }
            //Ambos vivos
            return "Both Pokemon are alive!\n";
        }

    }
    // Este método calcula o multiplicador de dano de acordo com o tipo de ataque e o tipo do oponente
    public float dmgMultiplier(Pokemon pokemonR, Pokemon pokemonL) {
        // Se o tipo de ataque for fogo e o tipo do oponente for elétrico, o dano será multiplicado por 1.5
        if(pokemonR.getMoves()[0].getType().getName().equals("FIRE") && pokemonL.getType().getName().equals("ELETRIC")){
            return 1.5f;
        }
        // Se o tipo de ataque for elétrico e o tipo do oponente for voador, o dano será multiplicado por 1.5
        if(pokemonR.getMoves()[0].getType().getName().equals("ELETRIC") && pokemonL.getType().getName().equals("FLIGHT")){
            return 1.5f;
        }
        // Se o tipo de ataque for voador e o tipo do oponente for grama, o dano será multiplicado por 1.5
        if(pokemonR.getMoves()[0].getType().getName().equals("FLIGHT") && pokemonL.getType().getName().equals("GRASS")){
            return 1.5f;
        }
        // Se o tipo de ataque for grama e o tipo do oponente for água, o dano será multiplicado por 1.5
        if(pokemonR.getMoves()[0].getType().getName().equals("GRASS") && pokemonL.getType().getName().equals("WATER")){
            return 1.5f;
        }
        // Se o tipo de ataque for água e o tipo do oponente for fogo, o dano será multiplicado por 1.5
        if(pokemonR.getMoves()[0].getType().getName().equals("WATER") && pokemonL.getType().getName().equals("FIRE")){
            return 1.5f;
        }
        // Se o tipo de ataque for fogo e o tipo do oponente for água, o dano será multiplicado por 0.5
        if(pokemonR.getMoves()[0].getType().getName().equals("FIRE") && pokemonL.getType().getName().equals("WATER")){
            return 0.5f;
        }
        // Se o tipo de ataque for água e o tipo do oponente for grama, o dano será multiplicado por 0.5
        if(pokemonR.getMoves()[0].getType().getName().equals("WATER") && pokemonL.getType().getName().equals("GRASS")){
            return 0.5f;
        }
        // Se o tipo de ataque for grama e o tipo do oponente for voador, o dano será multiplicado por 0.5
        if(pokemonR.getMoves()[0].getType().getName().equals("GRASS") && pokemonL.getType().getName().equals("FLIGHT")){
            return 0.5f;
        }
        // Se o tipo de ataque for voador e o tipo do oponente for elétrico, o dano será multiplicado por 0.5
        if(pokemonR.getMoves()[0].getType().getName().equals("FLIGHT") && pokemonL.getType().getName().equals("ELETRIC")){
            return 0.5f;
        }
        // Se o tipo de ataque for elétrico e o tipo do oponente for fogo, o dano será multiplicado por 0.
        if(pokemonR.getMoves()[0].getType().getName().equals("ELETRIC") && pokemonL.getType().getName().equals("FIRE")){
            return 0.5f;
        }
        
        //Qualquer outra opção o dano permance normal.
        return 1f;
    }

}
