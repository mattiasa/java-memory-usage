class memusage {
    public static void main(String args[]) {
        if (args.length != 2) {
            System.err.println("usage: memusage <basesize> <varyingsize>");
            System.exit(1);
        }

        int MEGABYTE = 1024*1024;

        int basesize = Integer.parseInt(args[0]);
        int varyingsize = Integer.parseInt(args[1]);
        System.out.println("Basesize: " + basesize);
        System.out.println("Varyingsize: " + varyingsize);
        System.out.println();

        System.out.println("Allocating base array");

        byte basearray[][] = new byte[basesize][];
        byte varyingarray[][] = null;

        for (int i=0; i < basesize; i++) {
            basearray[i] = new byte[MEGABYTE];
        }

        
        while(true) {
            System.out.println("Reallocating " + varyingsize + " MB");
            varyingarray = new byte[varyingsize][];

            for (int i=0; i < varyingsize; i++) {
                varyingarray[i] = new byte[MEGABYTE];
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // recommended because catching InterruptedException clears interrupt flag
                Thread.currentThread().interrupt();
                // you probably want to quit if the thread is interrupted
                System.err.println("Got interrupted");
                return;
            }
            
        }
    }
}
    
