package onepoint.ielaichaoui.bowling.model;

public class Spare implements IRoll{
	
	private int firstThrow;
	private int bonus;
	private static final int SCORE = 10;
	private static boolean addsNextFrame = true;
	private static int numberOfAddedNextFrames = 1;
	
	public Spare() {
		bonus = 0;
	}
	
	@Override
	public int getScore() {
		return SCORE + bonus;
	}

	@Override
	public boolean isAddsNextFrame() {
		return addsNextFrame;
	}

	@Override
	public int getNumberOfAddedNextFrames() {
		return numberOfAddedNextFrames;
	}

	@Override
	public int getFirstThrow() {
		return firstThrow;
	}

	public void setFirstThrow(int firstThrow) {
		this.firstThrow = firstThrow;
	}
	
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
}
