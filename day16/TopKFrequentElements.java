package day16;

import java.util.HashMap;
import java.util.PriorityQueue;

public class TopKFrequentElements {
    class Pair implements Comparable<Pair>{
    int num, count;
    Pair(int num_, int count_){
        num = num_;
        count= count_;
    }

    public int compareTo(Pair b){
        return this.count - b.count;
    }
}
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i:nums){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for(int i : map.keySet()){
            if(pq.size()<k) pq.add(new Pair(i, map.get(i)));
            else {
                if(pq.peek().count<map.get(i)){
                    pq.poll();
                    pq.add(new Pair(i,map.get(i)));
                }
            }
        }
        int[] res = new int[k];
        int ind = k-1;
        while(!pq.isEmpty()){
            res[ind--] = pq.poll().num; 
        }
        return res;
    }
}
}
