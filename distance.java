
public class editDistance {
	public static void main(String[] args){
		String[] str = {"abc","abd","abcd","adc"};
		String tar="ac";
		int k=1;
		System.out.println(editkDistance(str,tar,k));
		
	}
	
	public static List<String> editkDistance(String[] words,String target,int k){
		List<String> res=new ArrayList<String>();
		for (int i=0;i<words.length;i++){
			char[] chwords=words[i].toCharArray();
			char[] chtar=target.toCharArray();
			int wlen=words[i].length();
			int tlen=target.length();
			int[][] dp=new int[wlen+1][tlen+1];
			for(int t=0;t<=tlen;t++){
				dp[0][t]=t;
			}
			for(int w=0;w<=wlen;w++){
				dp[w][0]=w;
			}
			for(int w=1;w<=wlen;w++){
				for(int t=1;t<=tlen;t++){
					if(chwords[w-1]==chtar[t-1]){
						dp[w][t]=dp[w-1][t-1];
					}else{	
						int tmp=Math.min(dp[w-1][t]+1,dp[w][t-1]+1);
						dp[w][t]=Math.min(tmp,dp[w-1][t-1]+1);
					}
				}
			}
			if(dp[wlen][tlen]<=k){
				res.add(words[i]);
			}
		}
		return res;
	}
}
