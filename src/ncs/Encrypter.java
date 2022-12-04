package abstractclass;

public class Encrypter {
	public static String getEncrypterName(String name) {
		Validator mv = new Validator();
	
		if(mv.validate(name)) {
			return new StringBuilder(new String(name).toLowerCase()).reverse().toString();
		}else {
			throw new IllegalArgumentException("Try again with valid name");
		}
	
	}

}
