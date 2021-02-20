import java.util.Arrays;

class TestHarness {
    public static void main (String[] args) {
        // args
        if (args.length<2) {
            System.out.println(args);
            System.out.println(args.length);
            System.out.println("Syntax: java TestHarness LOG_PREFIX COMMAND");
            System.out.println("        java TestHarness run42 ls -l");
            System.exit(1);
        }
        String prefix = args[0];
        String command = String.join(" ", Arrays.copyOfRange(args, 1, args.length));
        System.out.println("Prefix: "+prefix);
        System.out.println("Command: "+command);
    }
}