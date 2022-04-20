package com.boookk.webfluxpracticeinfoservice;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;


@Component
public class Handler {

    public Mono<ServerResponse> info(ServerRequest request) {
        String name = request.queryParam("name").get();

        return ServerResponse
                .ok()
                .contentType(MediaType.APPLICATION_JSON)
                .bodyValue(new InfoService(""));
    }
}
