package com.vincenthartono.colours.services.impl;

import com.vincenthartono.colours.services.GreenPrinter;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class SpanishGreenPrinter implements GreenPrinter {
    @Override
    public String print() {
        return "verde";
    }
}
