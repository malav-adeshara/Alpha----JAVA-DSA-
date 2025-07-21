public class FindShortestPath {
    public static void main(String[] args) {
        String path = "WWESNNSNEWWN";
        System.out.println("Shortest distance between starting point and ending point is : " + findShortestPath(path));
    }

    public static double findShortestPath(String path) {
        double x = 0;
        double y = 0;
        for(int i = 0; i <= path.length()-1; i++) {
            if(path.charAt(i) == 'W') {
                x--;
            }

            if(path.charAt(i) == 'E') {
                x++;
            }

            if(path.charAt(i) == 'N') {
                y++;
            }

            if(path.charAt(i) == 'S') {
                y--;
            }
        }

        System.out.println("Final Coordinates : (" + x + ", " + y + ").");
        double displacement = Math.sqrt(((x*x) + (y*y)));

        return displacement;
    }
}
