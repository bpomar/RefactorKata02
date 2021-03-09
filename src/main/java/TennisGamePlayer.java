public class TennisGamePlayer implements TennisGame {

    private Player player1;
    private Player player2;

    public TennisGamePlayer(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public String getScore() {
        String s;
        if (player1.getScore() < 4 && player2.getScore() < 4 && !(player1.getScore() + player2.getScore() == 6)) {
            return (player1.getScore() == player2.getScore()) ? player1.getScoreName() + "-All" : player1.getScoreName() + "-" + player2.getScoreName();
        } else {
            if (player1.getScore() ==  player2.getScore())
                return "Deuce";
            s = player1.getScore() >  player2.getScore() ? player1.getName() : player2.getName();
            return ((player1.getScore() - player2.getScore()) * (player1.getScore() - player2.getScore()) == 1) ? "Advantage " + s : "Win for " + s;
        }
    }

    public void wonPoint(String playerName) {
        if (playerName.equals(player1.getName())) {
            player1.addPoint();
        } else {
            player2.addPoint();
        }

    }

}
