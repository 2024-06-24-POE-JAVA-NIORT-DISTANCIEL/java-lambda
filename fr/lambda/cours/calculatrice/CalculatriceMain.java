package fr.lambda.cours.calculatrice;

import java.util.function.Consumer;

public class CalculatriceMain {

    public static void main(String[] args) {
       Calculatrice maCalculette = new Calculatrice();

        System.out.println("Multiplication");
       maCalculette.setOperationEnCours(new Multiplication());
       maCalculette.resetEntrees();
       maCalculette.executeOperation();
       maCalculette.afficheResultat();

        System.out.println("Division");
        Division division = new Division();
        maCalculette.setOperationEnCours(division);
        maCalculette.resetEntrees();
        maCalculette.executeOperation();
        maCalculette.afficheResultat();

        ///le client demande d'élever deux entiers avec une certaine puissance
        //Le code ci-dessous est long, et n'est jamais utilisé en entreprise
        Operation maPuissance = (int a, int b) -> {
            System.out.println("Ce code est une lambda");
            return (int) Math.pow(a,b);
        };
        maCalculette.setOperationEnCours(maPuissance);
        maCalculette.resetEntrees();
        maCalculette.executeOperation();
        maCalculette.afficheResultat();

        //le client demande un modulo
        //Le code ci-dessous est plus celui utilisé en entreprise
        maCalculette.setOperationEnCours((int a, int b) -> {return a%b;});
        //La ligne ci-dessus fait la même chose que celle ci-dessous
        maCalculette.setOperationEnCours((a, b) -> a%b);

        OperationUnaire operationUnaire = (int a) -> {return 2*a;};
        //La ligne ci-dessus fait la même chose que celle ci-dessous
        OperationUnaire operationUnaire2 = a -> 2*a;

        Consumer<String> operationString = s -> {
            System.out.println(s);
        };



    }

}