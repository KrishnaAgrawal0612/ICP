class Solution {
    public int findMinArrowShots(int[][] points) {
         Arrays.sort(points, (a, b) -> Integer.compare(a[0], b[0]));
         int ans=1;
         int max=points[0][1];
         for(int i=1;i<points.length;i++){
                if(points[i][0]<=max){
                    max=Math.min(points[i][1],max);
                }
                else{ 
                    max=points[i][1];
                    ans++;}
         }
        return ans;
    }
}