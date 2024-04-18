package constant;

public class Earth
{
    // 상수 언언 및 초기화
    static final double EARTH_RADIUS = 6400;

    // 상수선언
    static final double EARTH_SURFACE_AREA;

    // 정적 블로에서 상수 초기화
    static {
        EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
    }
}
