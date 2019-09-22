import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
        String[] topics = {"Environment", "Politics", "Football", "Money", "Community"};
        int [][] ranks = new int [topics.length][];

       

        int i;
        int j;
        int people;
        int rank;


        for( i=0;i<ranks.length;i++)
        {
               ranks[i] = new int[10];
               for( j=0;j<ranks[i].length;j++)
                      ranks[i][j] = 0;
        }

       
        System.out.print("number surveying: ");
        people = scnr.nextInt();

        for( i=0;i<people;i++)

        {
               System.out.println("Rate each item on a scale of 1 to 10  "+topics.length+" topics : ");
               for(j=0;j<topics.length;j++)

               {

                      System.out.print("Enter your rank for "+topics[j]+" : ");
                      rank = scnr.nextInt();
                      while(rank < 1 || rank > 10)

                      {
                            System.out.println("Ranking should be between [1,10]");
                            System.out.print("Enter your rank for "+topics[j]+" : ");
                            rank = scnr.nextInt();
                      }
                      ranks[j][rank-1]++;
               }
        }

       

        int avgrank[] = new int[topics.length];

        String highestPointCategory="" , lowestPointCategory="" ;

        int highestPointTotal = 0 , lowestPointTotal= 0;

      

        for(i=0;i<ranks.length;i++)

        {

               avgrank[i] = 0;

               for(j=0;j<ranks[i].length;j++)

                      avgrank[i] += (ranks[i][j]*(j+1));

              

               if(i == 0) // for first entry initialize the variables

               {

                      highestPointTotal = avgrank[i];

                      lowestPointTotal= avgrank[i];

                      highestPointCategory = topics[i];

                      lowestPointCategory = topics[i];

               }else

               {

                      if(avgrank[i] > highestPointTotal)

                      {

                            highestPointCategory = topics[i];

                            highestPointTotal = avgrank[i];

                      }

                     

                      if(avgrank[i] < lowestPointTotal)

                      {

                            lowestPointCategory = topics[i];

                            lowestPointTotal= avgrank[i];

                      }

               }

              

               avgrank[i] = avgrank[i]/people;

        }


        System.out.printf("\n%-20s","");
        for(i=0;i<10;i++)
        System.out.printf("%-10d",(i+1));
        System.out.printf("%20s","Average rank");
        System.out.println();
        for(i=0;i<ranks.length;i++)

        {

               System.out.printf("\n%-20s",topics[i]);
               for(j=0;j<ranks[i].length;j++)
                      System.out.printf("%-10d",ranks[i][j]);
               System.out.printf("%20d",avgrank[i]);

        }
        
        System.out.println("\nHighest Point total : "+highestPointTotal+" Category : "+highestPointCategory);
        System.out.println("Lowest Point total : "+lowestPointTotal+" Category : "+lowestPointCategory);

        scnr.close();

  }

}
		
