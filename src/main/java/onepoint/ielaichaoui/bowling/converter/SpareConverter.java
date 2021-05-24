package onepoint.ielaichaoui.bowling.converter;

import onepoint.ielaichaoui.bowling.model.Spare;

public class SpareConverter implements IConverter<String, Spare> {
	
	private static final String spare = "/";
	
	@Override
	public Spare convertToTarget(String source) {
		if(source.length() >= 2 && source.length() < 4) {
			if(source.contains(spare)) {
				Spare spare = new Spare();
				spare.setFirstThrow(Integer.parseInt(source.substring(0,1)));
				if(source.length() == 3) {
					spare.setBonus(Integer.parseInt(source.substring(2,3)));
				}
				return spare;
			}
		}
			
		return null;
	}

}
