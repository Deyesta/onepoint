package onepoint.ielaichaoui.bowling;

import java.util.List;

import onepoint.ielaichaoui.bowling.converter.FrameConverter;
import onepoint.ielaichaoui.bowling.model.IRoll;
import onepoint.ielaichaoui.bowling.model.Strike;

public class Frame {
	private static final FrameConverter frameConverter = new FrameConverter();
	private static final int maxRollsInFrame = 10;
	
	public int getScore(String rollsString) {
		List<IRoll> rolls = frameConverter.convertToTarget(rollsString);
		int score = 0;
		for(int index = 0; index < maxRollsInFrame; index++) {
			IRoll roll = rolls.get(index);
			score+=roll.getScore();
			if(roll.isAddsNextFrame()) {
				score+= getNextRollsScore(roll, rolls);
			}
		}
		return score;
	}
	
	private int getNextRollsScore(IRoll roll, List<IRoll> rolls) {
		int currentRoll = rolls.indexOf(roll);
		int score = 0;
		try {
			IRoll nextRoll = rolls.get(currentRoll+1);
			if(nextRoll != null) {
				if(nextRoll.getNumberOfAddedNextFrames()==1) {
					score+= nextRoll.getFirstThrow();
				}else {
					score+= nextRoll.getScore();
					if(nextRoll instanceof Strike) {
						score+= nextRoll.getScore();
					}
				}
			}
		}catch(IndexOutOfBoundsException e) {
			score = 0;
		}
		return score;
	}

}
