class Solution {
    public double largestTriangleArea(int[][] arr) {
        
        double ans = 0;

        int  n = arr.length; 
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int k = j+1; k < n; k++) {
                    int x1 = arr[i][0], y1 = arr[i][1];
                    int x2 = arr[j][0], y2 = arr[j][1];
                    int x3 = arr[k][0], y3 = arr[k][1];

                    double cross = (x2-x1)*(y3-y1) - (x3-x1)*(y2-y1);
                    double area = 0.5 * Math.abs(cross);
                    ans = Math.max(ans, area);
                }
            }
        }
       

        return ans;

    }
}