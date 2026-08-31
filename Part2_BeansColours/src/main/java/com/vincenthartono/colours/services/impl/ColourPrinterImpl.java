package com.vincenthartono.colours.services.impl;

import com.vincenthartono.colours.services.BluePrinter;
import com.vincenthartono.colours.services.ColourPrinter;
import com.vincenthartono.colours.services.GreenPrinter;
import com.vincenthartono.colours.services.RedPrinter;
import org.springframework.stereotype.Component;

public class ColourPrinterImpl implements ColourPrinter {

    private RedPrinter redPrinter;
    private BluePrinter bluePrinter;
    private GreenPrinter greenPrinter;

    // This constructor is used for a way to identify which dependencies are needed and then inject them.
    public ColourPrinterImpl(RedPrinter redPrinter, BluePrinter bluePrinter, GreenPrinter greenPrinter) {
        this.redPrinter = redPrinter;
        this.bluePrinter = bluePrinter;
        this.greenPrinter = greenPrinter;
    }

    @Override
    public String print() {
        return String.join(", ", redPrinter.print(), bluePrinter.print(), greenPrinter.print());
    }
}
