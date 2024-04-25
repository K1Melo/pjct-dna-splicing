package br.gov.sp.etec.syntheses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DNAEntrypoint extends SplicingServices{


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