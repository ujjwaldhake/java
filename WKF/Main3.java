package WKF;

import java.util.ArrayList;

// ─── Workflow2 Class ──────────────────────────────────────────────────────────
class Workflow2 {

    public Workflow2() {
    }

    public void process(ArrayList<String> entityList) {
        System.out.println("=== Workflow2.process() called ===");
        System.out.println("Received entityList size: " + entityList.size());
        System.out.println("entityList contents: " + entityList);

        String[] instMnems = entityList.toArray(new String[0]);

        String instMnemItems = "";
        int instMnemCount = 0;
        ArrayList<String> instMnemsList = new ArrayList<>();

        for (int i = 0; i < instMnems.length; i++) {

            instMnemItems = instMnemItems + instMnems[i] + ",";

            System.out.println(
                    "  [Loop i=" + i + "] instMnemItems so far: "
                            + instMnemItems);

            if ((i + 1) % 100 == 0) {

                instMnemItems = instMnemItems.substring(
                        0,
                        instMnemItems.length() - 1);

                instMnemsList.add(instMnemItems);

                System.out.println(
                        "  [Flush at i=" + i + "] Chunk added: "
                                + instMnemItems);

                instMnemItems = "";
            }
        }

        if (instMnemItems.length() > 0) {

            instMnemItems = instMnemItems.substring(
                    0,
                    instMnemItems.length() - 1);

            instMnemsList.add(instMnemItems);

            System.out.println(
                    "  [Final flush] Chunk added: "
                            + instMnemItems);
        }

        instMnemCount = instMnemsList.size();

        System.out.println("\n=== Chunking Result ===");
        System.out.println("Total chunks: " + instMnemCount);

        for (int c = 0; c < instMnemsList.size(); c++) {
            System.out.println(
                    "Chunk[" + c + "] = "
                            + instMnemsList.get(c));
        }

        System.out.println("================================\n");
    }
}

// ─── MainForm Class
// ───────────────────────────────────────────────────────────
class MainForm {

    Workflow2 workflow;

    public MainForm() {
        this.workflow = new Workflow2();
    }

    public void caseOne() {

        System.out.println("========== CASE 1 ==========");

        ArrayList<String> entityList = new ArrayList<>();

        entityList.add("++9+hnTy2euBy0+b");
        entityList.add("++9+hnTy2euBy0+c");
        entityList.add("++9+hnTy2euBy0+d");
        entityList.add("++9+hnTy2euBy0+e");

        workflow.process(entityList);
    }

    public void caseTwo() {

        System.out.println("========== CASE 2 ==========");

        ArrayList<String> entityList = new ArrayList<>();

        for (int i = 0; i < 104; i++) {

            String mnem = "++9+hnTy2euBy0+"
                    + (char) ('a' + (i % 26))
                    + i;

            entityList.add(mnem);
        }

        workflow.process(entityList);
    }
}

// ─── Entry Point
// ──────────────────────────────────────────────────────────────
public class Main3 {

    public static void main(String[] args) {

        MainForm form = new MainForm();

        form.caseOne();
        // form.caseTwo();
    }
}