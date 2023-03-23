import java.util.Scanner;
public class labAllocationForStudent {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the Lab1 Space: ");
        int lab1Space = scan.nextInt();

        System.out.println("Enter the Lab2 Space: ");
        int lab2Space = scan.nextInt();

        System.out.println("Enter the Lab3 Space: ");
        int lab3Space = scan.nextInt();

        System.out.println("Enter the Number of Student: ");
        int numberOfStudents = scan.nextInt();

        int[] differenceOfLabSpace = new int[]{lab1Space,lab2Space,lab3Space};

        int minimumSpacedLab = Integer.MAX_VALUE;

        for(int iterator = 0;iterator<differenceOfLabSpace.length;iterator++){

            if((differenceOfLabSpace[iterator]-numberOfStudents)>=0){

                int differenceOfLabSpaceAndStudentSpace = Math.abs(differenceOfLabSpace[iterator]-numberOfStudents);

                minimumSpacedLab = Math.min(minimumSpacedLab,differenceOfLabSpaceAndStudentSpace);

                differenceOfLabSpace[iterator] = differenceOfLabSpaceAndStudentSpace;

            }else{

                differenceOfLabSpace[iterator] = Integer.MAX_VALUE;

            }
        }

        int minimumAllocationOfLab = 0;

        for(int iterator = 0;iterator<differenceOfLabSpace.length;iterator++){

            if(differenceOfLabSpace[iterator] == minimumSpacedLab){

                minimumAllocationOfLab = iterator;

                break;

            }
        }

        System.out.println("L"+(minimumAllocationOfLab+1));

    }
}