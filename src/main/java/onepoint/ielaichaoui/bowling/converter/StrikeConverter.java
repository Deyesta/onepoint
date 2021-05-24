package onepoint.ielaichaoui.bowling.converter;

import onepoint.ielaichaoui.bowling.model.Strike;

public final class StrikeConverter implements IConverter<String, Strike> {
	
	private static final String strike = "x";
	
	@Override
	public Strike convertToTarget(String source) {
		if(strike.equals(source))
			return new Strike();
		return null;
	}

}
