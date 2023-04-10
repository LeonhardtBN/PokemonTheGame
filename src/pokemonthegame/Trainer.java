package pokemonthegame;

public class Trainer {
    
    // Atributos da classe
    private final String name; // Nome do treinador
    private final String classe; // Classe do treinador
    private int qntPokemon; // Quantidade de Pokemons do treinador
    private char avaibleForBattle; // Indica se o treinador está disponível para batalha
    private Pokemon[] pokemon = new Pokemon[2]; // Array de Pokemons do treinador

    // Construtor da classe
    public Trainer(String name, String classe, int qntPokemon, char avaibleForBattle) {
        this.name = name;
        this.classe = classe;
        this.qntPokemon = qntPokemon;
        this.avaibleForBattle = avaibleForBattle;
    }

    // Métodos getters e setters
    public String getName() {
        return name;
    }

    public String getClasse() {
        return classe;
    }

    public int getQntPokemon() {
        return qntPokemon;
    }

    public char getAvaibleForBattle() {
        return avaibleForBattle;
    }

    public Pokemon[] getPokemon() {
        return pokemon;
    }

    public void setQntPokemon(int qntPokemon) {
        this.qntPokemon = qntPokemon;
    }

    public void setAvaibleForBattle(char avaibleForBattle) {
        this.avaibleForBattle = avaibleForBattle;
    }

    public void setPokemon(Pokemon[] pokemon) {
        this.pokemon = pokemon;
    }

    // Sobrescrita do método toString para imprimir informações do objeto Trainer
    @Override
    public String toString() {
        return "Trainer{" + "name=" + name + ", classe=" + classe +  ", qntPokemon=" + qntPokemon + ", avaibleForBattle=" + avaibleForBattle + ", pokemon=" + pokemon + '}';
    }

}
