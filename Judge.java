import java.util.*;

public class Judge{
	static Judge townJudge;

    public Judge(){
        townJudge = new Judge();
    }

	public static int findJudge(int N, int[][] trust)
	{
		Graph graph = new Graph(N);

		/*Appends edges to the graph*/
		for (int i = 0; i < trust.length; i++){
			graph.addEdge(trust[i][0], trust[i][1]);
		}

		LinkedList<Integer>[] adjacent = graph.getGraph();

		/*Goes through the adjacent list/the vertices*/
		for(int i = 1; i < adjacent.length; i++){
			if(adjacent[i].size() == 0){
				int candidateJudge = i;

				boolean isJudge = true;

				/*Finds the judge by iterating through each linked list and checks if it contains
				the current vertex*/
				for(int j = 1; j <adjacent.length; j++){
					if(j == i){
						continue;
					}

					LinkedList<Integer> edges = adjacent[j];

					if(!edges.contains(candidateJudge)){
						isJudge = false;
						break;
					}
				}

				if(isJudge){
					return i;
				}
			}	
		}

		return -1;
	}


	/*This is for testing*/
	 public static void townJudgeFirstPositive() {
	 	int[][] arr = new int[][]{{1, 2}};
        int res = townJudge.findJudge(2, arr);

        System.out.println("Test 1: " + res);
    }

	public static void townJudgeSecondPositive() {
		int[][] arr = new int[][]{{1, 3}, {2, 3}};
        int res = townJudge.findJudge(3, arr);
      
        System.out.println("Test 2: " + res);
    }

 	public static void townJudgeThirdPositive() {
 		int[][] arr = new int[][]{{1, 3}, {2, 3}, {3, 1}};
        int res = townJudge.findJudge(3, arr);
        
        System.out.println("Test 3: " + res);
    }

    public static void townJudgeFourthPositive() {
    	int[][] arr = new int[][]{{1, 2}, {2, 3}};
        int res = townJudge.findJudge("Test 4: " + arr);

    	System.out.println(res);
    }

     public static void townJudgeFifthPositive() {
     	int[][] arr = new int[][]{{1, 3}, {1, 4}, {2, 3}, {2, 4}, {4, 3}};
        int res = townJudge.findJudge(4, arr);
        
        System.out.println("Test 5: " + res);
    }


	public static void main(String[] args) {
		townJudgeFirstPositive();
		townJudgeSecondPositive();
		townJudgeThirdPositive();
		townJudgeFourthPositive();
		townJudgeFifthPositive();
	}
}