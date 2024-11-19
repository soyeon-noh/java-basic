package class1;

public class ClassStart3 {

    public static void main(String[] args) {
        // 설계도인 클래스를 사용해서
        // 실제 메모리에 만들어진 실체를
        // 객체 또는 인스턴스라 한다.

        // Student 타입의 변수 선언
        Student student1;
        // 객체 생성. Student 인스턴스 생성. 메모리 공간 확보.
        // 참조값 보관. 생성된 인스턴스의 참조값을 변수에 저장
        // student1 변수를 통해 메모리에 있는 실제 객체를 접근하고 사용 가능
        student1 = new Student();
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        System.out.println(student1); //class1.Student@6acbcfc0
        System.out.println(student2); //class1.Student@5f184fc6

        System.out.println("이름: " + student1.name + " 나이: " + student1.age + " 성적: " + student1.grade);
        System.out.println("이름: " + student2.name + " 나이: " + student2.age + " 성적: " + student2.grade);




    }
}
