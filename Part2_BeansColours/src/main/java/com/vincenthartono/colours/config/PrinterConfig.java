package com.vincenthartono.colours.config;

import com.vincenthartono.colours.services.BluePrinter;
import com.vincenthartono.colours.services.ColourPrinter;
import com.vincenthartono.colours.services.GreenPrinter;
import com.vincenthartono.colours.services.RedPrinter;
import com.vincenthartono.colours.services.impl.ColourPrinterImpl;
import com.vincenthartono.colours.services.impl.EnglishBluePrinter;
import com.vincenthartono.colours.services.impl.EnglishGreenPrinter;
import com.vincenthartono.colours.services.impl.EnglishRedPrinter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// this is called a configuration class. We would label it with:
@Configuration // -> this tell Spring to look in this class for Bean declarations.
public class PrinterConfig {

    @Bean
    public BluePrinter bluePrinter() {
        return new EnglishBluePrinter();
    }

    @Bean
    public RedPrinter redPrinter(){
        return new EnglishRedPrinter();
    }

    @Bean
    public GreenPrinter greenPrinter(){
        return new EnglishGreenPrinter();
    }

    @Bean
    public ColourPrinter colourPrinter(BluePrinter bluePrinter, RedPrinter redPrinter, GreenPrinter greenPrinter){
        return new ColourPrinterImpl(redPrinter, bluePrinter, greenPrinter);
    }
}
