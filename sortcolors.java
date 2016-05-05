public class Solution {
    public void sortColors(int[] nums) {
        HashMap<Integer,List<Integer>> map=new HashMap<>();
        HashSet<Integer> set=new HashSet<>();
        set.add(0);
        set.add(1);
        set.add(2);
        for(int i: nums){
            if(set.contains(i)){
                if(map.get(i)!=null){
                    List<Integer> tmp=new ArrayList<Integer>();
                    tmp=map.get(i);
                    tmp.add(i);
                    map.put(i,tmp);
                }else{
                    List<Integer> list=new ArrayList<Integer>();
                    list.add(i);
                    map.put(i,list);
                }
            }
        }
        List<Integer> list=new ArrayList<Integer>();
        int j=0;
        for(int i=0;i<=2;i++){
            List<Integer> tmp=new ArrayList<Integer>();
            tmp=map.get(i);
            if(tmp!=null){
                list.addAll(tmp);
            }
        }
        
        for(int i : list){
            nums[j++]=i;
        }
    }
}
