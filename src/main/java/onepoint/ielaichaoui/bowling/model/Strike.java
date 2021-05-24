package onepoint.ielaichaoui.bowling.model;

public class Strike implements IRoll{
	
	private static final int SCORE = 10;
	private static boolean addsNextFrame = true;
	private static int numberOfAddedNextFrames = 2;
	
	@Override
	public int getScore() {
		return SCORE;
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
		return SCORE;
	}
}
