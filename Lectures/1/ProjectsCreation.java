import java.util.Scanner;

public class ProjectsCreation {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String name= scan.nextLine();
        int countOfProjects=Integer.parseInt(scan.nextLine());
        System.out.printf("The architect %s will need %d hours to complete %d project/s.",name,countOfProjects*3,countOfProjects);
    }
}
