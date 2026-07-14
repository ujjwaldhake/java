package WKF;

//resolve
import java.util.ArrayList;
import java.util.Arrays;

class Workflow {

    private String[] instMnems;

    public Workflow(String[] instMnems) {
        this.instMnems = instMnems;
    }

    public void process() {

        String instMnemItems = "";
        ArrayList<String> instMnemsList = new ArrayList<>();

        for (int i = 0; i < instMnems.length; i++) {

            System.out.println("Loop Index = " + i);

            instMnemItems += instMnems[i] + ",";

            if ((i + 1) % 100 == 0) {

                instMnemItems = instMnemItems.substring(0,
                        instMnemItems.length() - 1);

                instMnemsList.add(instMnemItems);

                System.out.println(
                        "Batch Created -> " + instMnemItems);

                instMnemItems = "";
            }
        }

        if (instMnemItems.length() > 0) {

            instMnemItems = instMnemItems.substring(0,
                    instMnemItems.length() - 1);

            instMnemsList.add(instMnemItems);
        }

        System.out.println("\nFinal Batches:");

        // for (String batch : instMnemsList) {
        // System.out.println(batch + 123);
        // }
    }
}

public class Main2 {

    public static void main(String[] args) {

        String[] entityList = {
                "$*5R54Dre1",
                "$*5@A4Dre1",
                "$*5PC4Dre1",
                "$*5454Dre1",
                "$*5DC4Dre1"
        };

        System.out.println("UI Passed:");
        System.out.println(Arrays.toString(entityList));

        Workflow workflow = new Workflow(entityList);

        workflow.process();
    }
}