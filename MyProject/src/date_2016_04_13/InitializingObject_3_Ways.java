package date_2016_04_13;

class employee{
	int emp_id=100;
	public employee() {
		System.out.println("Default Constructor called, value set to : "+emp_id);
	}
	public employee(int i) {
	emp_id = i;
	System.out.println("Constructor called, value set to : "+emp_id);
	}
	public void set_emp_id(int i) {
		emp_id = i;
	}
}

public class InitializingObject_3_Ways {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee obj_1 = new employee();
		//employee obj_2 = new employee();		
	}
}
