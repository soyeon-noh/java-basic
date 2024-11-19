package ref;

// Q. 메서드 내부에서 생성된 참조형 변수가 가리키는 메모리는 메서드가 끝날 때 메모리 상에서 삭제되는 것이 아닌가?
// A. 참조형 변수는 참조값을 가지고 있습니다.
//    이 참조값으로 나중에 배울 힙영역에 있는 인스턴스를 찾아갈 수 있습니다.
//    참조형 변수인 Student student 자체는 메서드가 끝나면 소멸합니다!
//    다만 메서드를 호출한 곳에서 넘겨준 참조값을 대입해서 새로 갖는 참조형 변수가 있다면, 해당 참조값을 계속 들고 있게 되는 것이고, 인스턴스에 접근할 수 있는 참조값을 계속 유지하고 있기 때문에 힙 영역에 있는 인스턴스도 소멸하지 않습니다.
//    반면에 기본값들은 리터럴 자체를 변수에 대입합니다. 이 지역변수의 스코프는 메서드 내부이고 메서드를 종료할 때 같이 소멸합니다. 이 때 기본형들은 리터럴 자체가 변수 내에 있기 때문에 같이 소멸하게 되는 것입니다.
// Q. 그럼 참조값을 return 하지 않으면 사라지나?
// java메모리 영역에 대한 자료 : https://inpa.tistory.com/entry/JAVA-%E2%98%95-%EA%B7%B8%EB%A6%BC%EC%9C%BC%EB%A1%9C-%EB%B3%B4%EB%8A%94-%EC%9E%90%EB%B0%94-%EC%BD%94%EB%93%9C%EC%9D%98-%EB%A9%94%EB%AA%A8%EB%A6%AC-%EC%98%81%EC%97%AD%EC%8A%A4%ED%83%9D-%ED%9E%99
public class Method2 {

    // 객체 생성과 함께 초기화가 가능하지 않을까?
    public static void main(String[] args) {
        Student student1 = createStudent("학생1", 15, 90);
        Student student2 = createStudent("학생2", 16, 80);

//        System.out.println("메서드 외부 주소1: " + student1);
//        System.out.println("메서드 외부 주소2: " + student2);

        printstudent(student1);
        printstudent(student2);
    }

    static Student createStudent(String name, int age, int grade) {
        Student student = new Student();
        student.name = name;
        student.age = age;
        student.grade = grade;

//        System.out.println("메서드 내부 주소: " + student);

        return student;
    }

    static void printstudent(Student student) {
        System.out.println("이름: " + student.name + " 나이: " + student.age + " 성적: " + student.grade);
    }
}
