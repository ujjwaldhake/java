package CommandLIneArgument;

public class CommandLineArgument {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            // System.out.println(args[i]);
            System.out.println(Integer.parseInt(args[i]));

        }
    }

}
