public class UsingArraysOfStrings {
    public static void main(String[] args){
        String[] superheroes = {"Batman", "Superman", "Wonder Woman", "Spider-Man", "Iron Man"};
        int[] introductionYears = {1939, 1938, 1941, 1962, 1963};

        for (int i = 0; i < superheroes.length; i++){
            System.out.println(superheroes[i] + " " + introductionYears[i]);
        }

        System.out.println("Orginal superhero name at position: "+ superheroes[2]);

        superheroes[2] = "Thor";

        for (int i = 0; i < superheroes.length; i++) {
            System.out.println(superheroes[i]);

        }
    }
}
