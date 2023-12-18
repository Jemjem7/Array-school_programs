
import java.util.Scanner;

class NbscPrograms {
    String name;

    NbscPrograms(String name) {
        this.name = name;
    }

                  void showNBSC() {
                       System.out.println(name + " (NBSC)");

                              Scanner scanner = new Scanner(System.in);

                              for (int i = 0; i < 3; i++) {
                     System.out.println("Select a course (1. BSBA, 2. BSIT, 3. TEP): ");
                  System.out.println("Enter your chosen course:");
                        int selectedCourse = scanner.nextInt();

                      if (selectedCourse == 1) {
                showBSBA();
            }        else if (selectedCourse == 2) {
                showBSIT();
            }        else if (selectedCourse == 3) {
                showTEP();
            }        else {
                System.out.println("Invalid input.");
            }
        }

        scanner.close();
    }

    void showBSBA() {
        System.out.println(name + " BSBA");
    }

    void showBSIT() {
        System.out.println(name + " BSIT");
    }

    void showTEP() {
        System.out.println(name + " TEP");
    }
}