package courses;

public class AmasBscanner {

    public AmasBscanner() {
        init();
    }
    
    private void init() {
        try (java.io.PrintWriter out = nuevoOutput(); java.util.Scanner in = nuevoInput()) {
            out.println(in.nextInt() + in.nextInt());
        } catch (java.io.IOException ex) {
            /* TODO-CODE here */
        }
    }

    public java.util.Scanner nuevoInput() throws java.io.IOException {
        if (System.getProperty("JUDGE") != null) {
            return new java.util.Scanner(new java.io.File("input.txt"));
        } else {
            return new java.util.Scanner(System.in);
        }
    }
    
    public java.io.PrintWriter nuevoOutput() throws java.io.IOException {
        if (System.getProperty("JUDGE") != null) {
            return new java.io.PrintWriter("output.txt");
        } else {
            return new java.io.PrintWriter(System.out);
        }
    }
}