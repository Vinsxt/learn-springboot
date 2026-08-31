package com.vincenthartono.colours.services.impl;

import com.vincenthartono.colours.services.BluePrinter;
import com.vincenthartono.colours.services.ColourPrinter;
import com.vincenthartono.colours.services.GreenPrinter;
import com.vincenthartono.colours.services.RedPrinter;
import org.springframework.stereotype.Component;

@Component
// it says: Hello Spring, I'm a bean and implementation of ColourPrinter, and it should be
// put into the application context.
// It also says, any dependencies I require in my constructor I want to be injected as well.

// When one main impl class is becoming @Component, any of its children should be too.
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
