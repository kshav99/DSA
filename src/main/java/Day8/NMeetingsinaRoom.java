package Day8;

import java.util.*;

public class NMeetingsinaRoom {

  static class meeting {
        int start;
        int end;
        int pos;

      public meeting(int start, int end, int pos)
        {
            this.start = start;
            this.end = end;
            this.pos = pos;
        }
    }
    static class meetingComparator implements Comparator<meeting>
    {
        @Override
        public int compare(meeting o1, meeting o2)
        {
            if (o1.end < o2.end)
                return -1;
            else if (o1.end > o2.end)
                return 1;
            else if(o1.start < o2.start)
                return -1;
            return 1;
        }
    }

    public static void main(String args[])
    {
        int n = 6;
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,5,7,9,9};
        List<Integer> answer = maxMeetings(start,end,n);
         System.out.println("The order in which the meetings will be performed is ");
        for(int i = 0;i<answer.size(); i++) {
            System.out.print(answer.get(i) + " ");
        }
    }
    public static List<Integer> maxMeetings(int [] start, int [] end, int n)
    {
        List<meeting> meet = new ArrayList<>();

        for(int i = 0; i<n; i++)
        {
        meet.add(new meeting(start[i], end[i], i+1));

        }
        Collections.sort(meet,new meetingComparator());
        List<Integer> answer = new ArrayList<>();
        answer.add(meet.get(0).pos);
        int limit  = meet.get(0).end;
        for(int i = 1; i<n ; i++)
        {
            if(meet.get(i).start>limit)
            {
                answer.add(meet.get(i).pos);
                limit = meet.get(i).end;
            }

        }
        return answer;

    }
}
