package fr.lambda.cours;

import java.util.ArrayList;
import java.util.List;

public class Stream {

    public static void main(String[] args) {
        List<Stagiaire> stagiaires = new ArrayList<>();
        stagiaires.add(new Stagiaire("Hammou", "Yannis", false));
        stagiaires.add(new Stagiaire("Bossard", "Hugo", false));
        stagiaires.add(new Stagiaire("Marchal", "Muriel", true));
        stagiaires.add(new Stagiaire("Benseddik", "Amir", true));
        stagiaires.add(new Stagiaire("Paumier", "Dominique", true));

        //Affichage des prénoms des stagiaires chouchous
        System.out.println("Affichage des prénoms des stagiaires chouchous avec un for");
        for(Stagiaire stagiaire : stagiaires){
            if(stagiaire.isChouchou()){
                System.out.println(stagiaire.getPrenom());
            }
        }

        System.out.println("Affichage des prénoms des stagiaires chouchous avec un stream");
        //l'équivalent avec un stream fonctionnel
        stagiaires.stream()
                .filter((Stagiaire s)->{return s.isChouchou();})
                .forEach((Stagiaire s)->{
                    System.out.println(s.getPrenom());
                });

        //l'équivalent avec un stream fonctionnel raccourci
        stagiaires.stream()
                .filter(s-> s.isChouchou())
                .forEach(s -> System.out.println(s.getPrenom()));

        //Utilisation d'autres méthodes de stream : map et toList()
        List<String> prenomsStagiaires = stagiaires.stream()
                .filter(s-> s.getPrenom().startsWith("Yan"))
                .filter(s-> s.getNom().length() > 5)
                .map(s -> s.getPrenom())
                .toList();

    }
}
