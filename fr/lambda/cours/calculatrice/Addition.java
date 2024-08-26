package fr.lambda.cours.calculatrice;

public class Addition implements Operation{
    @Override
    public int execute(int a, int b) {
        return a + b;
    }
}
