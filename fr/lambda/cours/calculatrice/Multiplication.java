package fr.lambda.cours.calculatrice;

public class Multiplication implements Operation{
    @Override
    public int execute(int a, int b) {
        return a * b;
    }
}
