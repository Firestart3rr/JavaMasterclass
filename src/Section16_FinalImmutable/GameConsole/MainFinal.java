package Section16_FinalImmutable.GameConsole;

import Section16_FinalImmutable.GameConsole.game.Game;
import Section16_FinalImmutable.GameConsole.game.GameConsole;
import Section16_FinalImmutable.GameConsole.game.Player;
import Section16_FinalImmutable.GameConsole.pirate.PirateGame;

public class MainFinal {

    public static void main(String[] args) {

        GameConsole<PirateGame> game = new GameConsole<>(new PirateGame("Pirate Game"));

    }
}

//class SpecialGameConsole<T extends Game<? extends Player>> extends GameConsole<Game<? extends Player>> {
//
//    public SpecialGameConsole(Game<? extends Player> game) {
//        super(game);
//    }
//}