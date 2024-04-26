package br.gov.sp.etec.syntheses;

import java.util.ArrayList;

public class DNAEntrypoint extends DNAServices {


    public DNAEntrypoint() {
        super(new ArrayList<>(), new ArrayList<>());
        inputMessage();
        getDna();
        System.out.println("\n\n DNA conversion \n\n");
        dnaConversion();
        System.out.println("\n\n RNAm conversion \n\n");
        rnamConversion();
    }
}