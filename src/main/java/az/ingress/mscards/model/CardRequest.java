package az.ingress.mscards.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CardRequest {
    private BigDecimal amount;
    private String cardholder;
    private Long card_number;
    private LocalDateTime last_transaction_date;
}
