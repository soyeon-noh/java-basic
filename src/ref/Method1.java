package ref;

public class Method1 {

    public static void main(String[] args) {
        Student student1 = new Student();
        initStudent(student1, "학생1", 15, 90);

        Student student2 = new Student();
        initStudent(student1, "학생2", 16, 80);

        printstudent(student1);
        printstudent(student2);
    }

    // 메서드 내부에 전달된 참조값을 통해 객체의 값을 변경
    // 전달한 학생 객체의 필드에 값을 설정
    static void initStudent(Student student, String name, int age, int grade) {
        student.name = name;
        student.age = age;
        student.grade = grade;
    }

    // 메서드 내부에 전달된 참조값을 통해 객체의 값을 읽어서 사용
    // 전달한 학생 객체의 필드 값을 읽어서 출력
    static void printstudent(Student student) {
        System.out.println("이름: " + student.name + " 나이: " + student.age + " 성적: " + student.grade);
    }
}
