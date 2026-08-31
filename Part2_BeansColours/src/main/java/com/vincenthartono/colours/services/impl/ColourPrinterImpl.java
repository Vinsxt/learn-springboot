package com.vincenthartono.colours.services.impl;

import com.vincenthartono.colours.services.BluePrinter;
import com.vincenthartono.colours.services.ColourPrinter;
import com.vincenthartono.colours.services.GreenPrinter;
import com.vincenthartono.colours.services.RedPrinter;

public class ColourPrinterImpl implements ColourPrinter {

    private RedPrinter redPrinter;
    private BluePrinter bluePrinter;
    private GreenPrinter greenPrinter;

    public ColourPrinterImpl() {
        this.redPrinter = new EnglishRedPrinter();
        this.bluePrinter = new EnglishBluePrinter();
        this.greenPrinter = new EnglishGreenPrinter();
    }

    @Override
    public String print() {
        return String.join(", ", redPrinter.print(), bluePrinter.print(), greenPrinter.print());
    }
}
