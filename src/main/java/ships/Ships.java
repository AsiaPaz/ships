package ships;

import java.util.ArrayList;
import java.util.List;

public class Ships {
    private final static List<Ship> ships = new ArrayList<Ship>();


    public Ships() { Ship ship = new Ship(4);
    ships.add(new Ship(4));
    ships.add(new Ship(3));
    ships.add(new Ship(3));
    ships.add(new Ship(2));
    ships.add(new Ship(2));
    ships.add(new Ship(2));
    ships.add(new Ship(1));
    ships.add(new Ship(1));
    ships.add(new Ship(1));
    ships.add(new Ship(1));
    }
}
