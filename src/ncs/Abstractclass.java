package ncs;

public class Abstractclass {
	class Engineer extends Shape{
		int s;
		String g;
		@Override
		public int getSalary() {
			// TODO Auto-generated method stub
			return s;
		}
		  
		public void setSalary(int s) {
			// TODO Auto-generated method stub
			this.s = s;
		}
		
		public String getGrade() {
			// TODO Auto-generated method stub
			return g;
		}
		  
		public void setGrade(String g) {
			// TODO Auto-generated method stub
			this.g = g;
		}

	}
	
	class Manager extends Shape{
		int s;
		String g;
		@Override
		public int getSalary() {
			// TODO Auto-generated method stub
			return s;
		}
		  
		public void setSalary(int s) {
			// TODO Auto-generated method stub
			this.s = s;
		}
		
		public String getGrade() {
			// TODO Auto-generated method stub
			return g;
		}
		  
		public void setGrade(String g) {
			// TODO Auto-generated method stub
			this.g = g;
		}

	}
	abstract class Shape{

	
		   abstract public int getSalary();
		   
		   abstract public void setSalary(int s);
		  
		   abstract public String getGrade();
		   
		   abstract public void setGrade(String g);
		   
			public void label() {
				// TODO Auto-generated method stub
				System.out.print("Employee's data");
			}

		}

	
	
	public static void main(String[] args) {
		
	}	
}
