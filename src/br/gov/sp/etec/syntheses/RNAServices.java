package br.gov.sp.etec.syntheses;

import java.util.ArrayList;
import java.util.List;

public class RNAServices {

    private final List<Character> rnam;
    private final List<List<Character>> rnat;

    public RNAServices(List<Character> rnam, List<List<Character>> rnat) {
        this.rnam = rnam;
        this.rnat = rnat;
    }

    public void rnamConversion() {
        List<Character> chars = new ArrayList<>();

        int j = 1;
        for (int i = 0; i < rnam.size(); i++) {
            switch (rnam.get(i)) {
                case 'A':
                    System.out.println("A - U");
                    chars.add('U');
                    break;
                case 'U':
                    System.out.println("U - A");
                    chars.add('A');
                    break;
                case 'C':
                    System.out.println("C - G");
                    chars.add('G');
                    break;
                case 'G':
                    System.out.println("G - C");
                    chars.add('C');
                    break;
            }

            if (j % 3 == 0) {
                System.out.println("Corta");
                List<Character> codon = new ArrayList<>();
                codon.add(chars.get(i - 2));
                codon.add(chars.get(i - 1));
                codon.add(chars.get(i));
                rnat.add(codon);

                j = 1;
            } else {
                j++;
            }
        }
    }

}
