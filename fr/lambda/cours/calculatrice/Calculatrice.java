package fr.lambda.cours.calculatrice;

import java.util.Scanner;

public class Calculatrice {

    private int a;
    private int b;
    private int resultat;
    private Operation operationEnCours;

    public void resetEntrees() {
        Scanner myObj = new Scanner(System.in);
            System.out.println("Entree 1 : ");
            this.a = myObj.nextInt();  // Read user input
            System.out.println("Entree 2 : ");
            this.b = myObj.nextInt();  // Read user input
    }

    public void setOperationEnCours(Operation operationEnCours) {
        this.operationEnCours = operationEnCours;
    }

    public void executeOperation(){
        this.resultat = operationEnCours.execute(this.a, this.b);
    }

    public void afficheResultat(){
        System.out.println("Le resultat vaut : " + this.resultat);
    }

}
