
import java.util.Arrays;
import java.util.List;

public class Player {

  private String name;
  private int score;
  private List<String> scoreName =  Arrays.asList("Love", "Fifteen", "Thirty", "Forty");

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getScore() {
    return score;
  }

  public void setScore(int score) {
    this.score = score;
  }

  public void addPoint() {
    this.score = this.score +1;
  }

  public String getScoreName() {
    return scoreName.get(score);
  }

}
