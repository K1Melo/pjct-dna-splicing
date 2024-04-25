package br.gov.sp.etec.syntheses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DNAEntrypoint {
    private final Scanner scanner = new Scanner(System.in);

    private List<Character> dnaArray;
    private List<Character> rnamArray;
    private List<Character> rnatArray;
    private int index = 1;
    private int arrayIndex = 0;

    public void entryDna() {
        entryDnaMessage();
        System.out.print("\nDNA: ");
        String dna = scanner.next().toUpperCase();
        convertStringToCharList(dna);
        System.out.println(dnaArray);
        System.out.println("\n---------");
        dnaToRnaM(dnaArray);
        System.out.println("\n---------");
        rnamToRNAt(rnamArray);
        scanner.close();
    }

    private void entryDnaMessage() {
        System.out.println();
        System.out.println("-- Seja bem vindo ao conversor de DNA para RNA --");
        System.out.println("_________________________________________________");
        System.out.println("Escreva o seu DNA com as bases nitrogenadas A T C G");
    }

    private void convertStringToCharList(String string) {
        List<Character> chars = new ArrayList<>();

        for(Character ch : string.toCharArray()) {
            if (!(ch.equals('A') || ch.equals('T')  || ch.equals('C')  || ch.equals('G') )) {
                chars.remove(ch);
            } else {
                chars.add(ch);
            }
        }
        dnaArray = chars;
    }

    public void dnaToRnaM(List<Character> dna) {
        List<Character> chars = new ArrayList<>();
        System.out.println("\nTransformando DNA para RNAm... \n");
        dna.forEach(base -> {
            switch (base) {
                case 'A':
                    System.out.println("A - U");
                    chars.add('U');
                    break;
                case 'T':
                    System.out.println("T - A");
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
        });
        rnamArray = chars;
    }

    public void rnamToRNAt(List<Character> rnam) {
        List<Character> chars = new ArrayList<>();
        List<List<Character>> amin = new ArrayList<>();
        System.out.println("\nTransformando RNAm para RNAt... \n");
        rnam.forEach(base -> {
            switch (base) {
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

            if(index % 3 == 0) {
                System.out.println("Corta");
                List<Character> aminoacid = new ArrayList<>();
                aminoacid.add(chars.get(arrayIndex - 2));
                aminoacid.add(chars.get(arrayIndex - 1));
                aminoacid.add(chars.get(arrayIndex));
                amin.add(aminoacid);
                index = 1;
            } else {
                index++;
            }
            arrayIndex++;
        });
        System.out.println("\n\n" + amin + "\n\n");
        rnatArray = chars;
    }
}