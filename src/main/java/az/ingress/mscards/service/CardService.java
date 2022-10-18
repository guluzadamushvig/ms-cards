package az.ingress.mscards.service;

import az.ingress.mscards.dao.repository.CardRepository;
import az.ingress.mscards.mapper.CardMapper;
import az.ingress.mscards.model.CardRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.awt.*;

@Service
@RequiredArgsConstructor
public class CardService {

    private final CardRepository cardRepository;
    public void saveCardTransaction(CardRequest cardRequest) {
        cardRepository.save(CardMapper.CardRequestToCardEntity(cardRequest));
    }
}
