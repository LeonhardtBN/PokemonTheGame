package pokemonthegame;

/**
 * A classe Type representa um tipo de Pokémon, como "Fogo" ou "Água".
 * Ela é usada para associar o tipo de um Pokémon com sua fraqueza e resistência a outros tipos.
 */
public class Type {
    private final String name;  // O nome do tipo de Pokémon

    
    public Type(String name) {
        this.name = name;
    }

    
    public String getName() {
        return name;
    }

    
    @Override
    public String toString() {
        return name;
    }   
}
