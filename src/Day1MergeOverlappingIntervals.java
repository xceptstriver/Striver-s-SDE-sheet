import java.util.ArrayList;
import java.util.Collections;

class Interval{
    int start;
    int end;
    public Interval(int start, int end){
        this.start = start;
        this.end = end;

    }
}

public class Day1MergeOverlappingIntervals {
    public static void main(String[] args){
        ArrayList<Interval> input = new ArrayList<>();
        input.add(new Interval(1,4));
        input.add(new Interval(2,5));
        input.add(new Interval(6,9));

        ArrayList<Interval> output = mergeIntervals(input);
        for (Interval res : output){
            System.out.println(res.start + " " + res.end);
        }
    }

    private static ArrayList<Interval> mergeIntervals(ArrayList<Interval> intervals) {
        ArrayList<Interval> result = new ArrayList<>();
        if(intervals.size() < 2){
            return intervals;
        }
        Collections.sort(intervals,(a,b) -> Integer.compare(a.start,b.start));

        Interval temp = intervals.get(0);
        int start = temp.start;
        int end = temp.end;
        for (int i=1;i<intervals.size();i++){
            temp = intervals.get(i);
            if(temp.start <= end){
                end = Math.max(end,temp.end);
            }else {
                result.add(new Interval(start,end));
                start = temp.start;
                end = temp.end;
            }
        }
        result.add(new Interval(start,end));
        return result;

    }
}
