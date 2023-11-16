package oct7th;

public class InvalidAgeException extends RuntimeException{

		
	public InvalidAgeException()
	{
		super("Invalis age ... not eligible for registration...");
	}
}
