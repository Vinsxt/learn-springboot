package com.vincenthartono.colours.services.impl;

import com.vincenthartono.colours.services.BluePrinter;
import org.springframework.stereotype.Service;

@Service
public class SpanishBluePrinter implements BluePrinter {
    @Override
    public String print() {
        return "azul";
    }
}
