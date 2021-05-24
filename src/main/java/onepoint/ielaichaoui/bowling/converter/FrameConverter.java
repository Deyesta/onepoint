package onepoint.ielaichaoui.bowling.converter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import onepoint.ielaichaoui.bowling.model.IRoll;
import onepoint.ielaichaoui.bowling.model.Roll;
import onepoint.ielaichaoui.bowling.model.Spare;
import onepoint.ielaichaoui.bowling.model.Strike;

public class FrameConverter implements IConverter<String,List<IRoll>> {
	StrikeConverter strikeConverter = new StrikeConverter();
	SpareConverter spareConverter = new SpareConverter();
	RollConverter rollConverter = new RollConverter();
	
	@Override
	public List<IRoll> convertToTarget(String source) {
		List<String> rolls = Arrays.asList(source.split(" "));
		List<IRoll> results = new ArrayList<>();
		for(String roll : rolls) {
			Roll convertedRoll = rollConverter.convertToTarget(roll);
			Spare convertedSpare = spareConverter.convertToTarget(roll);
			Strike convertedStrike = strikeConverter.convertToTarget(roll);
			if(convertedRoll!=null) {
				results.add(convertedRoll);
			}
			if(convertedSpare!=null) {
				results.add(convertedSpare);
			}
			if(convertedStrike!=null) {
				results.add(convertedStrike);
			}
		}
		return results;
	}

}
