package src.main.java.com.mrbatista.gb2sdelivery.courier.management.domain;

import lombok.*;

import java.time.OffsetDateTime;
import java.util.UUID;


@Getter
@Setter(AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PACKAGE)
@EqualsAndHashCode
public class AssignedDelivery {


    @EqualsAndHashCode.Include
    private UUID id;

    private OffsetDateTime assignedAt;


    @Getter(AccessLevel.PRIVATE)
    private Courier courier;

    static AssignedDelivery pending(UUID deliveryId, Courier courier) {
        AssignedDelivery delivery = new AssignedDelivery();
        delivery.setId(deliveryId);
        delivery.setAssignedAt(OffsetDateTime.now());
        delivery.setCourier(courier);
        return delivery;
    }
}
