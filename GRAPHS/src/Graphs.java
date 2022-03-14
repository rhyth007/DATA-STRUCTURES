import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

//Find the Minimum Distance from source to Destination
public class Graphs {

    public static void main(String[] args) {

        int v =7;
        ArrayList<ArrayList<Integer>>adj = new ArrayList<>();
        for (int i = 0; i <=v ; i++) {
            adj.add(new ArrayList<Integer>());
        }
        addEdge(adj,1,2);
        addEdge(adj,1,3);
        addEdge(adj,1,0);
        addEdge(adj,1,5);
        addEdge(adj,2,5);
        addEdge(adj,5,6);
        addEdge(adj,4,5);
        addEdge(adj,3,4);
        addEdge(adj,4,6);

        System.out.println(bfsOfGraph(v,adj,1,6));
        System.out.println();
        System.out.println();


    }

    static  void addEdge(ArrayList<ArrayList<Integer>>adj,int src,int dest){
        adj.get(src).add(dest);
        adj.get(dest).add(src);

 }

    static void printGraph(ArrayList<ArrayList<Integer> > adj)
    {
        for (int i = 0; i < adj.size(); i++) {
            System.out.println("\nAdjacency list of vertex " + i);
            System.out.print("head");
            for (int j = 0; j < adj.get(i).size(); j++) {
                System.out.print(" -> " + adj.get(i).get(j));
            }
            System.out.println();
        }
    }


    static boolean bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj,int src,int dest)
    {

        ArrayList<Integer>bfs = new ArrayList<>();
        boolean vis[] = new boolean[V+1];
        int pred[] = new int[V+1];
        int dist[] = new int[V+1];
        boolean isReached = false;
        Queue<Integer> q = new LinkedList<Integer>();

        for (int i = 0; i<V ; i++) {
            vis[i] = false;
            dist[i] = Integer.MAX_VALUE;
            pred[i] = -1;
        }


        dist[src] =0;
        q.add(src);
        vis[src] =true;

        while(!q.isEmpty()){
            int curr = q.poll();
            bfs.add(curr);

            for(int it : adj.get(curr)){

                System.out.println( curr+"    "+it);

                if(vis[it]==false){
                    vis[it] = true;
                    dist[it] =dist[curr]+1;
                    pred[it] =curr;
                    q.add(it);


                    if(it==dest)
                        isReached=true;

                }
            }


        }
        System.out.println(Arrays.toString(dist));
        System.out.println(Arrays.toString(pred));

        if(isReached)
            return true;
        return false;


    }
}















