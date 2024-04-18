package finalField;
// Korean 클래스를 보면 국가(nation)와 주민등록번호(ssn) 필드를 final 필드로 선언했다.
// nation 은 고정값이므로 선언 시에 초기값을 대입했고,
// ssn은 Korean 객체가 생성될 때 부여되므로 생성자 매개값으로 주민등록번호를 받아 초기값으로 대입했다.
public class Korean
{
    // 인스턴스 fianl 필드 선언
    final String nation = "대한민국";
    final String ssn;

    // 인스턴스 필드 선언
    String name;

    // 생성자 선언
    public Korean(String ssn, String name)
    {
        this.ssn = ssn;
        this.name = name;
    }
}
