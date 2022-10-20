public class Graph {
    private int[][] costs;
    private int INF = 9500;
    private int n;

    Graph(int nodes){
        n = nodes;
        costs = new int[nodes+1][nodes+1];
        for(int i = 1; i <= nodes; i++)
            for(int j = 1; j <= nodes; j++)
                costs[i][j] = INF;
    }

    public int getSize(){
        return n;
    }

    public void addArc(int v, int w, int cost){
        costs[v][w] = cost;
    }

    public boolean isArc(int v, int w){
        if(costs[v][w] == INF)
            return false;
        return true;
    }

    public int[][] floydWarshall() {
        int result[][];
        result = new int[n+1][n+1];
        int k, i, j;
        for(i = 1; i <= n; i++) {
            for(j = 1; j <= n; j++) {
                if(i == j) {
                    result[i][j] = 0;
                } else if(isArc(i, j)) {
                    result[i][j] = costs[i][j];
                } else {
                    result[i][j] = INF;
                }
            }
        }
        for(k = 1; k <= n; k++) {
            for(i = 1; i <= n; i++) {
                for(j = 1; j <= n; j++) {
                    int dist;
                    dist = result[i][k] + result[k][j];
                    if(result[i][j] > dist) {
                        result[i][j] = dist;
                    }
                }
            }
        }
        return result;
    }

    public String toString(){
        String ans = "";
        for(int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if(costs[i][j] == INF)
                    ans += "INF ";
                else
                    ans += costs[i][j] + " ";
            }
            ans += "\n";
        }
        return ans;
    }

    public static void main(String args[]) {
        Graph g = new Graph(4);
        g.addArc(1, 3, 2);
        g.addArc(1, 2, 3);
        g.addArc(2, 4, 6);
        g.addArc(2, 3, 2);
        System.out.println(g);
        System.out.println("Floyd-Warshall");
        int [][] my_matrix = g.floydWarshall();
        System.out.println("distanta minima dintre nodurile 1 si 4 este "+ my_matrix[1][4]); // rezultat - 9
    }


}
