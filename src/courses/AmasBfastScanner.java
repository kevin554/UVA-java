package courses;

public class AmasBfastScanner {

    public AmasBfastScanner() {
        init();
    }

    private void init() {
        try (java.io.PrintWriter out = nuevoOutput()) {
            FastScanner in = nuevoInput();
            out.println(in.nextInt() + in.nextInt());
        } catch (java.io.IOException ex) {
            /* TODO-CODE here */
        }
    }

    public FastScanner nuevoInput() throws java.io.IOException {
        if (System.getProperty("JUDGE") != null) {
            return new FastScanner(new java.io.File("input.txt"));
        } else {
            return new FastScanner(System.in);
        }
    }

    static java.io.PrintWriter nuevoOutput() throws java.io.IOException {
        if (System.getProperty("JUDGE") != null) {
            return new java.io.PrintWriter("output.txt");
        } else {
            return new java.io.PrintWriter(System.out);
        }
    }

    public class FastScanner {

        private java.io.BufferedReader br;
        private java.util.StringTokenizer st;

        public FastScanner(java.io.File file) {
            try {
                br = new java.io.BufferedReader(new java.io.FileReader(file));
            } catch (java.io.FileNotFoundException e) {
                /* TODO-CODE here*/
            }
        }

        public FastScanner(java.io.InputStream stream) {
            br = new java.io.BufferedReader(new java.io.InputStreamReader(stream));
        }

        public String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new java.util.StringTokenizer(br.readLine());
                } catch (java.io.IOException e) {
                    /* TODO-CODE here */
                }
            }

            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        // <editor-fold defaultstate="collapsed" desc="Getters y Setters">
        public java.io.BufferedReader getBr() {
            return br;
        }

        public void setBr(java.io.BufferedReader br) {
            this.br = br;
        }

        public java.util.StringTokenizer getSt() {
            return st;
        }

        public void setSt(java.util.StringTokenizer st) {
            this.st = st;
        }
        // </editor-fold>
    }
}
