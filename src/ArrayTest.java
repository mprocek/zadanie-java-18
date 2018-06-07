public class ArrayTest {
    public static void main(String[] args) {
        int[][] tab1= {
                {1, 2, 3, 4},
                {2, 4, 5, 6},
                {2, 4, 5, 6}
        };

        int[][] tab2= {
                {1, 2, 3, 4},
                {2, 4, 5, 6},
                {2, 4, 5, 6}
        };

        ArrayComparator arrayComparator = new ArrayComparator();

        System.out.println("Tablice są identyczne: " + arrayComparator.compare(tab1, tab2));

    }

}
