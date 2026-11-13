package org.finbank.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoansController {

    @GetMapping("/loans")
    public String getLoansDetails(){
        return "Here is the Loans Details";

    }
}
