package inventory.domain;

public class Warehouse {
    // 창고 id
    private Long id;
    // 창고 타입
    private String type; // TODO : enum으로 변경
    // 지역
    private String location;
    // 택배사 id (하나의 창고는 하나의 택배사를 사용하도록 규정함)
    private Long deliveryCmpId;
}
