package Section16_FinalImmutable.GameConsole.pirate;

public final class Islander extends Combatant {

    public Islander(String name, Weapon weapon) {
        super(name);
        setCurrentWeapon(weapon);
    }
}
