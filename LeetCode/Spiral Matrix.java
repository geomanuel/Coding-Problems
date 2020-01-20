class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> output = new ArrayList<Integer>();
        if (matrix.length == 0) return output;
        
        int leftLimit = 0;
        int rightLimit = matrix[0].length - 1;
        int upperLimit = 0;
        int lowerLimit = matrix.length - 1;
        
        while(leftLimit <= rightLimit || upperLimit <= lowerLimit){
            if (lowerLimit < upperLimit || leftLimit > rightLimit) break;
            for (int i = leftLimit; i <= rightLimit; i++){
                output.add(matrix[upperLimit][i]);
            }
            upperLimit++;
            
            if (lowerLimit < upperLimit || leftLimit > rightLimit) break;
            for (int i = upperLimit; i <= lowerLimit; i++){
                output.add(matrix[i][rightLimit]);
            }
            rightLimit--;
            
            if (lowerLimit < upperLimit || leftLimit > rightLimit) break;
            for (int i = rightLimit; i >= leftLimit; i--){
                output.add(matrix[lowerLimit][i]);
            }
            lowerLimit--;
            
            if (lowerLimit < upperLimit || leftLimit > rightLimit) break;
            for (int i = lowerLimit; i >= upperLimit; i--){
                output.add(matrix[i][leftLimit]);
            }
            leftLimit++;
            
        }
        return output;
    }
}