package br.gov.sp.etec.syntheses;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DNAServices extends RNAServices{
    private List<Character> dna;
    private final List<Character> rnam;

    public DNAServices(List<Character> rnam, List<List<Character>> rnat) {
        super(rnam, rnat);
        this.rnam = rnam;
    }

    public void inputMessage() {
        final Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("-- Seja bem vindo ao conversor de DNA para RNA --");
        System.out.println("_________________________________________________");
        System.out.println("Escreva o seu DNA com as bases nitrogenadas A T C G");
        System.out.print("\nDNA: ");
        dna = scanner.next().toUpperCase().chars().mapToObj(ch -> (char) ch).collect(Collectors.toList());

        scanner.close();
    }

    public void dnaConversion() {
        for (int i = 0; i < dna.size(); i++) {
            if(!(dna.get(i).equals('A') || dna.get(i).equals('T') || dna.get(i).equals('C') || dna.get(i).equals('G'))) {
                dna.remove(i);
                break;
            }

            switch (dna.get(i)) {
                case 'A':
                    System.out.println("A - U");
                    rnam.add('U');
                    break;
                case 'T':
                    System.out.println("T - A");
                    rnam.add('A');
                    break;
                case 'C':
                    System.out.println("C - G");
                    rnam.add('G');
                    break;
                case 'G':
                    System.out.println("G - C");
                    rnam.add('C');
                    break;
            }
        }
    }

    public void getDna() {
        System.out.println(dna);
    }
}
