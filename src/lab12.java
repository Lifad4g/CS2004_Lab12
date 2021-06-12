import java.util.ArrayList;

public class lab12 {
	
	public static void main(String args[]) {
		
		
		System.out.println("---------Experiment------");
		testing(10);
			
	}
	
	private static void testing(int rep) {
		ArrayList<Double> fitness = new ArrayList<Double>();
		
		for(int i=1;i<=rep;++i)
		{
			System.out.println("------Test---" + i + "--------- " );
			
			//Reset the fitness count
			OneMaxChrome.ClearFC();
			//The following parameters are not very good!
			//These are the ones you should try and optimise!
			//AIM Exercise 2 = GA run 10 times final solution of 1 each times
			//These values produce 1.0 each time
			//population size
			int popsize = 100;
			//Mutation rate
			double mrate = 0.001;
			//crossover rate
			double crate = 0.70;
			
			//You will not need to change the following
			SimpleGeneticAlgorithm ga = new SimpleGeneticAlgorithm(popsize,10,1000,mrate,crate);
			//Run the GA for 10,000 function calls
			double f = ga.RunSGA(true).GetFitness();
			fitness.add(f);			
			System.out.println("fitness: " + f);
		}
		System.out.println();
		
		double totalFitness = 0;
		for(int i = 0; i<fitness.size();i++) {
			totalFitness = totalFitness + fitness.get(i);
		}
		double averageFitness = (totalFitness/fitness.size());
		System.out.println("Average Fitness = "+ averageFitness);
		System.out.println();
		
	}
	
}


