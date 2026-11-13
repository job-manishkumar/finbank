package org.finbank.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardsController {

    @GetMapping("/cards")
    public String getCardsDetails(){
        return "Here is the Cards Details";

    }
}
