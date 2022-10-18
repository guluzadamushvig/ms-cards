package az.ingress.mscards.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="cards")
@Builder
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id ;

    @Column(name = "card_number")
    private Long card_number ;

    @Column(name="last_transaction_amount")
    private BigDecimal last_transaction_amount;

    @Column(name="cardholder")
    private String cardholder;

    @Column(name = "last_transaction_date")
    private LocalDateTime last_transaction_date;

    @Column(name = "created_at")
    private LocalDateTime created_at;
}
