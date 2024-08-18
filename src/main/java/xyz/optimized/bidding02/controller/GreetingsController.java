package xyz.optimized.bidding02.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.time.Duration;

@RestController
public class GreetingsController {

    @GetMapping("/greetings")
    Flux<String> greetings() {
        return Flux.just("Hello",", ", "World!").delayElements(Duration.ofMillis(400));
    }
}
