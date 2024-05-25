import java.util.Vector;

public class Department implements DepartmentComponent {
    private String name;
    private Vector<DepartmentComponent> workers;

    public Department(String name) {
        this.name = name;
        workers = new Vector<DepartmentComponent>();
    }

    public void add(DepartmentComponent component) {
        workers.add(component);
    }

    public void remove(DepartmentComponent component) {
        workers.remove(component);
    }

    public Vector<DepartmentComponent> getWorkers() {
        return workers;
    }

    @Override
    public void showWorks() {
        System.out.println("[Department " + name + "]: Consists of the following workers:");
        for (DepartmentComponent worker : workers) {
            worker.showWorks();
        }
    }
}
