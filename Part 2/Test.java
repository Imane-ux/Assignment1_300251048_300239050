public class Test{
	public static void main(String args[]){
		Address[] add = new Address[6];
		Employee e = new Employee("Falcao",40,15.50,add);
		String o1 = e.getName();
		add[0] = new Address ("Queen",48,"K1P1N2");
		add[1] = new Address ("King Edward",800,"K1N6N5");
		System.out.println(o1+" "+e.getAddress(0));
		System.out.println(o1+" "+e.getAddress(1));
		
	}
}

