public class Calculation {

    public static void main(String[] args) {
        // Input values based on the dataset
        int truePositives = 0;
        int falsePositives = 0;
        int falseNegatives = 0;
        int trueNegatives = 0;
        
        // Calculate Precision
        double precision = calculatePrecision(truePositives, falsePositives);
        System.out.println("Precision: " + precision);
        
        // Calculate Recall
        double recall = calculateRecall(truePositives, falseNegatives);
        System.out.println("Recall: " + recall);
        
        // Calculate Accuracy
        double accuracy = calculateAccuracy(truePositives, trueNegatives, falsePositives, falseNegatives);
        System.out.println("Accuracy: " + accuracy);
        
        // Calculate F1 Score
        double f1Score = calculateF1Score(precision, recall);
        System.out.println("F1 Score: " + f1Score);
    }
    
    // Method to calculate precision
    public static double calculatePrecision(int truePositives, int falsePositives) {
        return (double) truePositives / (truePositives + falsePositives);
    }
    
    // Method to calculate recall
    public static double calculateRecall(int truePositives, int falseNegatives) {
        return (double) truePositives / (truePositives + falseNegatives);
    }
    
    // Method to calculate accuracy
    public static double calculateAccuracy(int truePositives, int trueNegatives, int falsePositives, int falseNegatives) {
        return (double) (truePositives + trueNegatives) / (truePositives + trueNegatives + falsePositives + falseNegatives);
    }
    
    // Method to calculate F1 score
    public static double calculateF1Score(double precision, double recall) {
        return 2 * ((precision * recall) / (precision + recall));
    }
}
