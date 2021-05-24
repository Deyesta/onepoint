package onepoint.ielaichaoui.bowling.converter;

public interface IConverter<S,T> {
	public T convertToTarget(S source);
}
