package pokemonthegame;

import java.util.Scanner;

/**
 *
 * @author leonh
 */
public class Main {
     public static void main(String[] args) {
        
        //TYPES
        pokemonthegame.Type fireType = new pokemonthegame.Type("FIRE");
        pokemonthegame.Type eletricType = new pokemonthegame.Type("ELETRIC");
        pokemonthegame.Type waterType = new pokemonthegame.Type("WATER");
        pokemonthegame.Type flyingType = new pokemonthegame.Type("FLIGHT");
        pokemonthegame.Type grassType = new pokemonthegame.Type("GRASS");
        //Player
        Trainer player = new Trainer("Red", "Player", 2, 'd');
        
        Move[] MovePkm1 = new Move[4];        
        MovePkm1[0] = new Move("Thunder Wave","um golpe",40, eletricType, 10);
        MovePkm1[1] = new Move("Thunderbolt","um golpe",70, eletricType, 8);
        MovePkm1[2] = new Move("Thunder","um golpe",90, eletricType, 5);
        MovePkm1[3] = new Move("Thunder Shock","um golpe", 100, eletricType, 2);        

        Move[] MovePkm2 = new Move[4];        
        MovePkm2[0] = new Move("Water Jet","um golpe",40, waterType, 10);
        MovePkm2[1] = new Move("Surf","um golpe",60, waterType, 8);
        MovePkm2[2] = new Move("Hydro pump","um golpe",90, waterType, 5);
        MovePkm2[3] = new Move("Waterfall","um golpe",100, waterType, 2);        

        Pokemon[] pkmPrincipal = new Pokemon[2];
        pkmPrincipal[0] = new Pokemon("Pikachu", eletricType, fireType, 50, 200, 80, 50, 90);
        pkmPrincipal[0].setMoves(MovePkm1);
        
        pkmPrincipal[1] = new Pokemon("Feraligatr", waterType, grassType,50, 200, 75, 67, 85);
        pkmPrincipal[1].setMoves(MovePkm2);
        
        player.setPokemon(pkmPrincipal);
        
        
        //Gary        
        Trainer opponent1 = new Trainer("Gary", "Opponent", 2, 'd');
        
        Move[] MovePkm3 = new Move[4];        
        MovePkm3[0] = new Move("Air Slash","Um corte de Ar",40, flyingType, 10);
        MovePkm3[1] = new Move("Huricane","Um tornado",60, flyingType, 8);
        MovePkm3[2] = new Move("Gust","um golpe",80, flyingType, 5);
        MovePkm3[3] = new Move("Air Cutter","um golpe", 100, flyingType, 2);        

        Move[] MovePkm4 = new Move[4];        
        MovePkm4[0] = new Move("Lava Fist","um golpe",40, fireType, 10);
        MovePkm4[1] = new Move("Fire Cannon","um golpe",60, fireType, 8);
        MovePkm4[2] = new Move("Incinerate","um golpe",85, fireType, 5);
        MovePkm4[3] = new Move("Fire Explosion","um golpe",100, fireType, 2);        

        Pokemon[] pkmSecondary1 = new Pokemon[2];
        pkmSecondary1[0] = new Pokemon("Pidgeot", flyingType, eletricType, 50, 200, 60, 55, 80);
        pkmSecondary1[0].setMoves(MovePkm3);
        
        pkmSecondary1[1] = new Pokemon("Magmortar", fireType, waterType, 50 , 200, 50, 60, 70);
        pkmSecondary1[1].setMoves(MovePkm4); 
        
        opponent1.setPokemon(pkmSecondary1);
        
        //Dawn
        Trainer opponent2 = new Trainer("Dawn", "Opponent", 2, 'd');
        
        Move[] MovePkm5 = new Move[4];        
        MovePkm5[0] = new Move("Whip","um golpe",40, grassType, 10);
        MovePkm5[1] = new Move("Leaf Storm","um golpe",50, grassType, 8);
        MovePkm5[2] = new Move("Seed Gatling","um golpe",70, grassType, 5);
        MovePkm5[3] = new Move("Solar Beam","um golpe", 100, grassType, 2);        

        Move[] MovePkm6 = new Move[4];        
        MovePkm6[0] = new Move("Aerial Ace","um golpe",40, flyingType, 10);
        MovePkm6[1] = new Move("Wing Attack","um golpe",60, flyingType, 8);
        MovePkm6[2] = new Move("Sky Attack","um golpe",90, flyingType, 5);
        MovePkm6[3] = new Move("Sky Drop","um golpe",100, flyingType, 2);        

        Pokemon[] pkmSecondary2 = new Pokemon[2];
        pkmSecondary2[0] = new Pokemon("Venusaur", grassType, fireType, 50, 200, 85, 90, 45);
        pkmSecondary2[0].setMoves(MovePkm5);
        
        pkmSecondary2[1] = new Pokemon("Aerodactyl", flyingType, eletricType,50, 200, 60, 80, 95);
        pkmSecondary2[1].setMoves(MovePkm6);
        
        opponent2.setPokemon(pkmSecondary2);
        
        //LIDER GINASIO Brock
        Trainer liderGinasio = new Trainer("Gym Leader Brock", "Leader", 2, 'd');
        
        Move[] MovePkm7 = new Move[4];        
        MovePkm7[0] = new Move("Lava Beam","um golpe",40, fireType, 10);
        MovePkm7[1] = new Move("Fire Fang","um golpe", 70, fireType, 8);
        MovePkm7[2] = new Move("Flame claws","um golpe",90, fireType, 5);
        MovePkm7[3] = new Move("Supernova","um golpe",100, fireType, 2);        

        Move[] MovePkm8 = new Move[4];        
        MovePkm8[0] = new Move("Frenzy Plant","um golpe",40, grassType, 10);
        MovePkm8[1] = new Move("Leaf Storm","um golpe",60, grassType, 8);
        MovePkm8[2] = new Move("Seed Bomb","um golpe",70, grassType, 5);
        MovePkm8[3] = new Move("Giga Drain","um golpe",100, grassType, 2);        

        Pokemon[] pkmLeader = new Pokemon[2];
        pkmLeader[0] = new Pokemon("Entei", fireType, waterType, 75, 200, 70, 45, 80);
        pkmLeader[0].setMoves(MovePkm7);
        
        pkmLeader[1] = new Pokemon("Sceptile", grassType, flyingType, 75, 200, 70, 60, 85);
        pkmLeader[1].setMoves(MovePkm8);
        
        liderGinasio.setPokemon(pkmLeader);
    
        // TREINADORES / OPONENTES
        Trainer[] trainers = new Trainer[4];        
        trainers[0] = player;
        trainers[1] = opponent1;
        trainers[2] = opponent2;
        trainers[3] = liderGinasio;        
        Battle battle = new Battle(trainers);
        
        Scanner choice = new Scanner(System.in);
        String opponent;
        String winner;
        int i = 0;
        
        
        
        do{
            System.out.println(battle.showOpponents());        
            System.out.println("Who do you wanna face?");
            
                winner = battle.chooseOpponent(choice.nextInt());
                while(winner.equals("Invalid option!")){
                    System.err.println("Type again a new option");
                    winner = battle.chooseOpponent(choice.nextInt());
                }            
            System.out.println(winner);
            i++;
        }while(winner.contains("Red") && i < 3);
        
     }
}
