public class Employee implements DepartmentComponent {

    private String name;
    private int age;
    private int id;
    private String workPosition;

    public Employee(String name, int age, int id, String workPosition) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.workPosition = workPosition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWorkPosition() {
        return workPosition;
    }

    public void setWorkPosition(String workPosition) {
        this.workPosition = workPosition;
    }


    @Override
    public void showWorks() {
        System.out.println("[Employee " + getName() + "] I am " + age + " years old. My work position is: " + workPosition);
    }
}
