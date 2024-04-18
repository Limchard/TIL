package finalField;
// Korean 클래스를 보면 국가(nation)와 주민등록번호(ssn) 필드를 final 필드로 선언했다.
// nation 은 고정값이므로 선언 시에 초기값을 대입했고,
// ssn은 Korean 객체가 생성될 때 부여되므로 생성자 매개값으로 주민등록번호를 받아 초기값으로 대입했다.
public class KoreanExample
{
    public static void main(String[] args)
    {
        // 객체 생성 시 주민등록번화와 이름 전달.
        Korean k1=new Korean("123456-1234567","김자바");

        // 필드값 읽기
        System.out.println(k1.nation);
        System.out.println(k1.ssn);
        System.out.println(k1.name);

        // Final 필든느 값을 변경할 수 없음
//        k1.nation="USA";
//        k1.ssn="123-12-1234";

        // 비 final 필드는 값 변경 가능.
        k1.name="감자";
        System.out.println(k1.name);
    }
}
