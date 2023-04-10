package pokemonthegame;

public class Move {
    // Declaração dos atributos privados da classe Move
    private String moveName; // nome do movimento
    private String moveDesc; // descrição do movimento
    private Type type; // tipo do movimento (pode ser Fogo, Água, etc)
    private int movePower; // poder do movimento
    private int moveUse; // número de vezes que o movimento pode ser usado

    // Construtor da classe Move que recebe os atributos necessários para criar um novo objeto Move
    public Move(String moveName, String moveDesc, int movePower, Type type, int moveUse) {
        // Atribuição dos valores recebidos aos atributos da classe
        this.moveName = moveName;
        this.moveDesc = moveDesc;
        this.type = type;
        this.movePower = movePower;
        this.moveUse = moveUse;
    }

    // Método getter para o atributo moveName
    public String getMoveName() {
        return this.moveName;
    }
    
    // Método getter para o atributo moveDesc
    public String getMoveDesc() {
        return this.moveDesc;
    }
    
    // Método getter para o atributo type
    public Type getType(){
        return this.type;    
    }

    // Método getter para o atributo movePower
    public int getMovePower() {
        return this.movePower;
    }

    // Método setter para o atributo moveName
    public void setMoveName(String moveName) {
        this.moveName = moveName;
    }

    // Método setter para o atributo moveDesc
    public void setMoveDesc(String moveDesc) {
        this.moveDesc = moveDesc;
    }

    // Método setter para o atributo type
    public void setType(Type type) {
        this.type = type;
    }

    // Método setter para o atributo movePower
    public void setMovePower(int movePower) {
        this.movePower = movePower;
    }

    // Método getter para o atributo moveUse
    public int getMoveUse() {
        return this.moveUse;
    }

    // Método setter para o atributo moveUse
    public void setMoveUse(int moveUse) {
        this.moveUse = moveUse;
    }

    // Sobrescrita do método toString() para exibir informações do objeto Move como uma String
    @Override
    public String toString() {
        return "Move: " + moveName + ", Description: " + moveDesc + ", Type: " + type + ", Power: " + movePower + ", Uses Remain: " + moveUse;
    }
}
