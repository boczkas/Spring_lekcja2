package com.przemek.lekcja2.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloController {

//    Chcielibyśmy zliczać ilość wejść na naszą stronę
//    Controller powinien mieć w sobie logikę związaną z odbieraniem i wysyłaniem danych do klienta,
//    ale nie z ich procesowaniem -
//    do zrobienia Serwis, endpoint do odbierania zliczenia

//    Spring widzi tylko co powiemy mu żeby widział

//    Do sali: stwórz możliwość pobrania informacji ile mordeczek z literą "e" w imieniu odwiedziło
//              naszą stronę

//    Mamy tutaj HelloController, a zaczynamy z niego wyczytywać liczbę odwiedzin.
//    Wydaje się, że nasz kontroler zyskuje zbyt wiele funkcjonalności
//    Wydziel osobny kontroler CountingController i przenieś tam metody odpowiedzialne za liczenie

//    Za przechowywanie danych powinno odpowiadać Repository - przenieść tam nasze kolekcje przechowujące
//    countery

    @GetMapping("siema")
    public String powitac() {
        System.out.println("Wchodze w powitac");
        return "Siema";
    }

    @GetMapping("graty")
    public String elo() {
        System.out.println("Wchodze w elo");
        return "Gratulacje mordeczki!";
    }


    @GetMapping("siema/{imie}")
    public String powitacCie(@PathVariable String imie) {
        System.out.println("Wchodze w powitacCie");
        return "Siema " + imie;
    }

    @GetMapping("elo/{mordeczka}")
    public String eloMordeczko(@PathVariable String imie) {
        System.out.println("Wchodze w eloMordeczko");
        return "Siema " + imie;
    }

}
