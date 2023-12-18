
import java.util.Scanner;

            class Programs {
    private String name;

    public Programs(String name) {
           this.name = name;
    }

         public void displayPrograms() {
          Scanner course = new Scanner(System.in);

                    System.out.println("A. TEP");
                                System.out.println("B. BSBA");
                                        System.out.println("C. BSIT");
                                                   System.out.println(name + " Enter Program Name: ");

        String selectedProgram = course.nextLine();

        if (selectedProgram.equals("A")) {
                     System.out.println(name + ". Teacher Education Program");
        } else if (selectedProgram.equals("B")) {
                       System.out.println(name + ". Bachelor of Science Business Administration");
        } else if (selectedProgram.equals("C")) {
                      System.out.println(name + ". Bachelor of Science in Information Technology");
        } else {
                   System.out.println("Enter value again!");
        }

        course.close();
    }
}