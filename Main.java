import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);
    private static final int MAX_STUDENTS = 10;
    private static final int REGISTER = 1;
    private static final int SHOW_STUDENTS = 2;
    private static final int EXIT_PROGRAM = 3;
    static Student[] student = new Student[MAX_STUDENTS];
    static int countStudent;
    public static void main(String[] args) {
        boolean continueProgram = true;

        do{
            switch (chooseOption()) {
                case REGISTER -> registerStudent();
                case SHOW_STUDENTS -> showRegister();
                case EXIT_PROGRAM -> {
                    System.out.println("Process done.");
                    continueProgram = false;
                }
                default -> System.out.println("Is not an option, try again.");
            }

        }while(continueProgram);

    }
    private static int chooseOption(){
        int option;
        System.out.println("Options ");
        System.out.println("1) Register new student");
        System.out.println("2) Show students");
        System.out.println("3) Exit");
        option = sc.nextInt();
        return option;
    }
    private static void registerStudent(){
        if(countStudent < MAX_STUDENTS){
            String name;
            int age;
            long telephone;
            float average;
            char gender;
            sc.nextLine();
            System.out.println("Registering student");
            System.out.print("Name: ");
            name = sc.nextLine();
            System.out.print("Age: ");
            age = sc.nextInt();
            System.out.print("Telephone: ");
            telephone = sc.nextLong();
            System.out.print("Average: ");
            average = sc.nextFloat();
            System.out.print("Gender: ");
            gender = sc.next().charAt(0);
            student[countStudent] = new Student(name,age,telephone,average,gender);
            countStudent++;
            System.out.println("Student registered");
        }else{
            System.out.println("System full");
        }
    }
    private static void showRegister() {
        if(countStudent > 0){
            for (int i = 0; i < countStudent; i++) {
                System.out.println("Showing data");
                System.out.println("Name: " + student[i].getName());
                System.out.println("Age: " + student[i].getAge());
                System.out.println("Telephone: " + student[i].getTelephone());
                System.out.println("Average: " + student[i].getAverage());
                System.out.println("Gender: " + student[i].getGender());
            }
        }else{
            System.out.println("No students previously registered");
        }
    }
}