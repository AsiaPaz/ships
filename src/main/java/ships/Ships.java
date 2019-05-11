package ships;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Ships {
    private List<Ship> ships = new ArrayList<Ship>();

    public Ships(List<Ship> ships) {
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

    public Ships() {
    }


    public List<Ship> getShips() {
        return ships;
    }

    public void setShips(List<Ship> ships) {
        this.ships = ships;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ships ships1 = (Ships) o;
        return Objects.equals(ships, ships1.ships);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ships);
    }

    @Override
    public String toString() {
        return "Ships{" +
                "ships=" + ships +
                '}';
    }
}
