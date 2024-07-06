package Section11_Abstraction.Interfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Player {

    private String name;
    private String weapon;
    private int hitPoints;
    private int strength;

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", weapon='" + weapon + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                '}';
    }

    public List<String> write() {
        List<String> fields = new ArrayList<>();
        fields.add(name);
        fields.add(String.valueOf(hitPoints));
        fields.add(String.valueOf(strength));
        fields.add(weapon);

        return fields;
    };

    public void read(List<String> args) {
        List<String> blablabla = new ArrayList<>();
        for (String arg : args) {
            blablabla.add(arg);
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
}
