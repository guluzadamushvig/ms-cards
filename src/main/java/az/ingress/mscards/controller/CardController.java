package az.ingress.mscards.controller;

import az.ingress.mscards.model.CardRequest;
import az.ingress.mscards.service.CardService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/cards")
public class CardController {

    private final CardService cardService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void saveCardTransaction(@RequestBody CardRequest cardRequest){
        cardService.saveCardTransaction(cardRequest);
    }
}
