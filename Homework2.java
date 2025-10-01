import java.util.Scanner;

class Student {
    int studentId;
    String name;
    String major;
    long phoneNumber;

    public Student(int studentId, String name, String major, long phoneNumber) {
        this.studentId = studentId;
        this.name = name;
        this.major = major;
        this.phoneNumber = phoneNumber;
    }

    public String getFormattedPhoneNumber() {
        String phone = String.valueOf(phoneNumber);
        return "010-" + phone.substring(0, 4) + "-" + phone.substring(4);
    }
}

public class Homework2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
            int id = sc.nextInt();
            String name = sc.next();
            String major = sc.next();
            long phone = sc.nextLong();

            students[i] = new Student(id, name, major, phone);
        }
        System.out.println("\n입력된 학생들의 정보는 다음과 같습니다.");
        for (int i = 0; i < 3; i++) {
            System.out.printf("%d번째 학생: %d %s %s %s\n",
                    i + 1,
                    students[i].studentId,
                    students[i].name,
                    students[i].major,
                    students[i].getFormattedPhoneNumber()
            );
        }

        sc.close();
    }
}
