package fr.lambda.cours.calculatrice;

@FunctionalInterface
public interface Operation {

    public int execute(int a, int b);

}
