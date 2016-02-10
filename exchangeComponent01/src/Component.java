import java.lang.reflect.Method;

/**
 *  The <tt>Component</tt> class finds the first occurrence of a pattern string
 *  in a text string.
 *  <p>
 *  This implementation uses the Boyer-Moore algorithm (with the bad-character
 *  rule, but not the strong good suffix rule).
 *  <p>
 *  For additional documentation,
 *  see <a href="http://algs4.cs.princeton.edu/53substring">Section 5.3</a> of
 *  <i>Algorithms, 4th Edition</i> by Robert Sedgewick and Kevin Wayne.
 */
public class Component {

    private static Component instance = new Component();
    public Port port;

    private Component() {
        port = new Port();
    }

    public static Component getInstance() {
        return instance;
    }

    public String getVersion() {
        return "BoyerMoore";
    }

    public class Port implements IComponent {
        private Method[] methods = getClass().getMethods();

        public void printComponentVersion() {
            System.out.println(getVersion() + "\n");
        }

        public int stringSearch(String pattern, String hiboString) {
            return innerStringSearch(pattern, hiboString);
        }


        public void listMethods() {
            System.out.println("--- public methods for " + getClass().getName());
            for (int i = 0; i < methods.length; i++)
                if (!methods[i].toString().contains("Object") && !methods[i].toString().contains("list"))
                    System.out.println(methods[i]);
            System.out.println("---");
        }
    }

    private int innerStringSearch(String pattern, String hiboString) {
        BoyerMoore boyerMoore = new BoyerMoore(pattern);
        return boyerMoore.search(hiboString);

    }
}


