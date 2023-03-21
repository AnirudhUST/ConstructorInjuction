package ustbatchno3.ConstructorInjuction;

public class Roles1 {
	
	public String char_name;
	
	/**
	 * @param char_name
	 * @param responsibility
	 */
	public Roles1(String char_name, String responsibility) {
		super();
		this.char_name = char_name;
		this.responsibility = responsibility;
	}

	public String responsibility;
	@Override
	public String toString() {
		return "Roles [char_name=" + char_name + ", responsibility=" + responsibility + "]";
	}
	
	public  void display() {
		System.out.println("name= "+char_name+" responsibility ="+responsibility);
	}
}
	
