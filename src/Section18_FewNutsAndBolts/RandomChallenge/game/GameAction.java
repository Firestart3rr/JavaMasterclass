package Section18_FewNutsAndBolts.RandomChallenge.game;

import java.util.function.Predicate;

public record GameAction(char key, String prompt, Predicate<Integer> action) {
}
