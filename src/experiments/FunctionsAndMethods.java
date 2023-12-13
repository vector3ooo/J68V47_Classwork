package experiments;

public class FunctionsAndMethods {

    public static void main(String[] args) {
        FunctionsAndMethods.welcomer("Piotr");

        String name = "Wiktor";
        welcomer(name);

        name = "Urszula";

        welcomer(name);

        welcomer();

        nazwijmyInt(10);

        System.out.println("PRZERWA");

        for (int i = 0; i < 10; i++){
            nazwijmyInt(i);
        }

    }

    public static void welcomer(String personsName){
        System.out.println("Hello " + personsName);
    }

    public static void welcomer(){
        System.out.println("Hello world");
    }

    public static void nazwijmyInt(Integer option) {
        //Nasza funckjac przyjmuje w tym momencie jeden ktory jest Intygerem. (Nazwa zmiennej ,,option'' jst w tym momencie dowolna)

//        System.out.print("Sprawdzmy to ");
//        System.out.print(option);
//        System.out.print("\n");

        System.out.printf("Sprawdzmy to %d\n", option);
    }
}


// FETCH PULL ------ COMMIT PUSH
// odwiez zaciagnij ------ zapisz wyslij
