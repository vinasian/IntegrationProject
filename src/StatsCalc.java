//Vincent Nguyen
//Statistic Calculation Class
//Calculates mean, then variance, then standard deviation
//Variance is the hardest part of this function

public class StatsCalc {
    
      // method for finding variance
      static double varOp(double a[], double n)
      {
          // Computing average/mean
          double sum = 0;
           
          for (int i = 0; i < n; i++)
              sum += a[i];
          double mean = (double)sum/(double)n;
       
          // Computing sum squared differences with the mean
          double sqrDiff = 0;
          for (int i = 0; i < n; i++) 
              sqrDiff += (a[i] - mean) * (a[i] - mean);
           
          return (double)sqrDiff/n;
      }
       
      static double stdDev(double arr[], double n) 
      {
        //Standard Deviation is easy since we have variance.
          return Math.sqrt(varOp(arr, n));
      }
       
}