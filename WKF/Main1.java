package WKF;

import java.util.Arrays;
//issue 

class Workflow {

    private String[] instMnems;

    public Workflow(String[] instMnems) {
        this.instMnems = instMnems;
    }

    public void process() {

        System.out.println("instMnems length = " + instMnems.length);

        for (int i = 0; i < instMnems.length; i++) {
            System.out.println("Processing: " + instMnems[i]);
        }
    }
}

public class Main1 {

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

        // WRONG MAPPING
        String[] instMnems = { entityList[0] };

        Workflow workflow = new Workflow(instMnems);

        workflow.process();
    }
}