package Section18_FewNutsAndBolts.RandomChallenge;

import Section18_FewNutsAndBolts.RandomChallenge.dice.DiceGame;
import Section18_FewNutsAndBolts.RandomChallenge.dice.ScoredItem;
import Section18_FewNutsAndBolts.RandomChallenge.game.GameConsole;

import java.util.ArrayList;
import java.util.List;

public class MainGame {

    public static void main(String[] args) {

//        List<Integer> currentDice = new ArrayList<>(
//                List.of(2, 2, 4, 4, 4));
//        for (ScoredItem s : ScoredItem.values()) {
//            System.out.printf("Score for %s is %d %n", s, s.score(currentDice));
//        }

        var console = new GameConsole<>(new DiceGame("Dice Rolling Game"));
        console.playGame(console.addPlayer());


    }
}
