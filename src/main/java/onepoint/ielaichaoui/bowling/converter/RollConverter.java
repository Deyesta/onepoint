package onepoint.ielaichaoui.bowling.converter;

import onepoint.ielaichaoui.bowling.model.Roll;

public class RollConverter implements IConverter<String,Roll> {

	@Override
	public Roll convertToTarget(String source) {
		if(source.length()!=2)
			return null;
		Roll roll = new Roll();
		try {
			if(source.contains("-")) {
				if(source.indexOf("-")==0) {
					roll.setFirstThrow(0);
					roll.setSecondThrow(Integer
							.parseInt(source.substring(1)));
				}else {
					roll.setFirstThrow(Integer
							.parseInt(source.substring(0, 1)));
					roll.setSecondThrow(0);
				}
			}else {
				roll.setFirstThrow(Integer
						.parseInt(source.substring(0, 1)));
				roll.setSecondThrow(Integer
						.parseInt(source.substring(1)));
			}
		}catch(NumberFormatException e) {
			return null;
		}
		return roll;
	}

}
