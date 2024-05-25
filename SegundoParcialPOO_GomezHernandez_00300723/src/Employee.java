public class Employee extends Person implements DepartmentComponent {
    public Employee(String name, int age, int id, String workPosition) {
        super(name, age, id, workPosition);
    }

    @Override
    public void showWorks() {
        System.out.println("I am an employee, I do work!");
    }
}
