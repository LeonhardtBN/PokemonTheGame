package pokemonthegame;


public final class Pokemon {

    // Esses são os campos privados da classe, que são acessíveis apenas dentro da própria classe
    // Eles são final, o que significa que não podem ser modificados após a criação do objeto
    // Alguns desses campos são inicializados no construtor e outros são inicializados na declaração
    // Os campos de tipo Move[] e Type são arrays, que podem conter vários valores

    private final String name;
    private final Type type;
    private final Type weakness;
    private int level;
    private float hp;
    private final int atk;
    private final int def;
    private final int spd;
    private Move[] moves = new Move[4];

    /**
     *
     * Este é o construtor da classe, que é usado para criar um novo objeto Pokemon
     * Ele recebe vários parâmetros para definir os atributos do Pokemon
     * Os campos name, type, weakness, hp, atk, def ze spd são inicializados com os valores dos parâmetros
     * O campo level é inicializado com o valor padrão 1
     * O campo moves é inicializado com um array de 4 elementos vazios
     */

    public Pokemon(String name, Type type, Type weakness, int level, float hp, int atk, int def, int spd) {
        this.name = name;
        this.type = type;
        this.weakness = weakness;
        this.level = level;
        this.hp = hp;
        this.atk = atk;
        this.def = def;
        this.spd = spd;
    }

    // Esses são os métodos públicos da classe, que podem ser acessados por outras classes
    // Eles fornecem acesso aos campos privados da classe e permitem que outros objetos interajam com um Pokemon

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    public Type getWeakness() {
        return weakness;
    }

    public int getLevel() {
        return level;
    }

    public float getHp() {
        return hp;
    }

    public int getAtk() {
        return atk;
    }

    public int getDef() {
        return def;
    }

    public int getSpd() {
        return spd;
    }

    public Move[] getMoves() {
        return moves;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setHp(float hp) {
        this.hp = hp;
    }

    public void setMoves(Move[] moves) {
        this.moves = moves;
    }

    @Override
    public String toString() {
        return "Pokemon{" + "Name:" + name + ", type=" + type + ", weakness=" + weakness + ", level=" + level + ", hp=" + hp + ", atk=" + atk + ", def=" + def + ", spd=" + spd + ", moves=" + moves + '}';
    }
    
    
}




