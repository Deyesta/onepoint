package onepoint.ielaichaoui.bowling.model;

public interface IRoll {
	
	public int getScore();
	public boolean isAddsNextFrame();
	public int getNumberOfAddedNextFrames();
	public int getFirstThrow();
}
