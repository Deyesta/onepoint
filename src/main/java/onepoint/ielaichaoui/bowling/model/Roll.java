package onepoint.ielaichaoui.bowling.model;

public class Roll implements IRoll{
	
	private int firstThrow;
	private int secondThrow;
	private static boolean addsNextFrame = false;
	private static int numberOfAddedNextFrames = 0;
	
	public int getScore() {
		return firstThrow + secondThrow;
	}

	public int getFirstThrow() {
		return firstThrow;
	}

	public void setFirstThrow(int firstThrow) {
		this.firstThrow = firstThrow;
	}

	public int getSecondThrow() {
		return secondThrow;
	}

	public void setSecondThrow(int secondThrow) {
		this.secondThrow = secondThrow;
	}

	public boolean isAddsNextFrame() {
		return addsNextFrame;
	}

	public int getNumberOfAddedNextFrames() {
		return numberOfAddedNextFrames;
	}
	
	

}
