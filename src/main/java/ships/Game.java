package ships;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Game {
  @Id
  @GeneratedValue
 private int id;
  @OneToMany
 private Player player;


}
