package fr.lambda.cours.calculatrice;

public class Division implements Operation{
    @Override
    public int execute(int a, int b) {
        return a / b;
    }
}
