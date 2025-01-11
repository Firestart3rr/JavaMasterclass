package Section16_FinalImmutable.GameConsole;

import Section16_FinalImmutable.GameConsole.game.GameConsole;
import Section16_FinalImmutable.GameConsole.game.ShooterGame;

public class Main {

    public static void main(String[] args) {

        var console = new GameConsole<>(new ShooterGame("The Shootout Game"));

        int playerIndex = console.addPlayer();
        console.playGame(playerIndex);
    }
}
