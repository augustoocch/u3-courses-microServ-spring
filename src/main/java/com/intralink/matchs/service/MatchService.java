package com.intralink.matchs.service;

import com.intralink.matchs.model.Match;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public interface MatchService {

    public Mono<ResponseEntity<Boolean>> newLike(long id, long idMatch);
    public Mono<String> newDislike(long id, long idMatch);
    public Flux<Match> findAllUsers();

}