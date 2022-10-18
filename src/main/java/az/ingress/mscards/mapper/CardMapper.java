package az.ingress.mscards.mapper;

import az.ingress.mscards.dao.entity.Card;
import az.ingress.mscards.model.CardRequest;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


public class CardMapper {

    public static Card CardRequestToCardEntity
            (CardRequest cardRequest){
        return Card.builder()
                .cardholder(cardRequest.getCardholder())
                .last_transaction_date(cardRequest.getLast_transaction_date())
                .last_transaction_amount(cardRequest.getAmount())
                .card_number(cardRequest.getCard_number())
                .created_at(LocalDateTime.now())
                .build();
    }
}
