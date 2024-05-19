package Day8;

import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class JobSequencing {

   static class Job {
        int id, profit, deadline;
        Job(int x, int y, int z) {
            this.id = x;
            this.deadline = y;
            this.profit = z;
        }
    }
        public static void main(String[] args) throws IOException {

            //size of array
            Job[] arr = new Job[4];
            arr[0] = new Job(1, 4, 20);
            arr[1] = new Job(2, 1, 10);
            arr[2] = new Job(3, 2, 40);
            arr[3] = new Job(4, 2, 30);

            JobSequencing ob = new JobSequencing();

            //function call
            Object[] res = ob.JobScheduling(arr, 4);
            System.out.println(res[0] + " " + res[1]);

        }
        public Object[] JobScheduling(Job [] arr, int n)
        {
            AtomicInteger maxDealine = new AtomicInteger(Integer.MIN_VALUE);
            Arrays.sort(arr, (a,b)-> {
                maxDealine.set(Math.max(maxDealine.get(), b.deadline));
               return b.profit - a.profit;

            });
            System.out.println(maxDealine.get());
            int [] deadline = new int[maxDealine.get()+1];
            for (int i = 0; i< maxDealine.get() +1; i++) {
                deadline[i] = -1;
            }
            int profit = 0;
            int jobsScheduled = 0;
            for (int i = 0; i< arr.length ;i ++){
                int currentdeadline = arr[i].deadline;
                if(deadline[currentdeadline] == -1) {
                deadline[currentdeadline] = arr[i].id;
                profit += arr[i].profit;
                jobsScheduled++;
                continue;
                }
                int j = currentdeadline-1;
                while(j >0){
                    if(deadline[j] == -1) {
                        deadline[j] = arr[i].id;
                        profit += arr[i].profit;
                        jobsScheduled++;
                        break;
                    }
                    j--;
                }
            }
            return Arrays.asList(jobsScheduled, profit).toArray();
        }
}
