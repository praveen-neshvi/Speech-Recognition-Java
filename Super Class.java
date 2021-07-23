package demo;

public class classNames {
	protected String name;
		
		public classNames()
		{
			name = "No name assigned";
		}
		
		public classNames(String name)
		{
			this.name = name;
		}
		
		public void printClassName()
		{
			System.out.println("An object has been created in the class " + name);
		}
		
		public void show()
		{
			System.out.println("classNames is the Super Class");
		}
		
		public void show(String s)
		{
			System.out.println("classNames is the Super Class of " + s);
		}
}
