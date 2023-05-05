package org.owasp.wrongsecrets.challenges;

import io.swagger.v3.oas.annotations.Hidden;
import org.owasp.wrongsecrets.challenges.docker.Challenge30;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Controller;


@Controller
@RestController
public class ChallengeRestController {
    private final Challenge30 challenge30;

    public ChallengeRestController(Challenge30 challenge30) {
        this.challenge30 = challenge30;
    }

    @GetMapping("/hidden")
    @Hidden
    public String getChallengeSecret() {
        return challenge30.spoiler().solution();
    }

}
