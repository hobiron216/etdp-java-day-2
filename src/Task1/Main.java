package Task1;

public class Main {
    public static void main(String[] args) {


        Employee employee = new Employee();
        employee.setPhone("+6281422467854");
        employee.setId(6);
        employee.setName("shahid");
        employee.getById(6);

        employee.setupdatePhone(!employee.getPhone().isEmpty());

        Developer developer = new Developer();
        developer.setGitHubLink("https://github.com/hobiron216");

        Designer designer = new Designer();
        designer.setDribbleLink("https://dribble.com/hobiron216");

        System.out.println("Name : " + employee.updateName());
        System.out.println("Id : " + employee.getId());
        System.out.println("Git Link Developer : " + developer.updateGitLink() );
        System.out.println("Git Dribble Link Designer : " + designer.updateDribbleLink());
        System.out.println("Phone : " + employee.updatePhone());


    }
}
