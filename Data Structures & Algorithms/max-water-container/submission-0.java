class Solution {
    public int maxArea(int[] he) {

            int i=0;
            int j=he.length-1;
            int max=0;
            while(i<j){
                int area=(j-i)*Math.min(he[i],he[j]);
                if(area>max) max=area;
                int a=(he[i]<he[j])? i++:j--;
            }
            return max;
    }
}
