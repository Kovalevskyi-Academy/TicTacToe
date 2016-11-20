package xo.model;

	public class Game {

    	private final Player player1;

    	private final Player player2;
	
    	private final Field field;

    	private final String name;

    public Game(final Player player1, final Player player2, final Field field, final String name) {

		this.player1 = player1;
		this.player2 = player2;
		this.field = field;
		this.name = name;
    }
	
    public Player getPlayer1() {
    	return player1;
    }

    public Player getPlayer2() {
    	return player2;
    }

    public Field getField() {
	return field;
    }

    public String getName() {
    	return name;
    }

}