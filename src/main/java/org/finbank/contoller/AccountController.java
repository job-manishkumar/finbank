package org.finbank.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @GetMapping("/my-account")
    public String getAccountDetails(){
        return "Here is the Account Details";

    }
}
