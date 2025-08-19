class Solution {
    public double pow(double x, int n){
        if(n == 0){
            return 1;
        }
        if(n<0){
            if(n == Integer.MIN_VALUE){
                return 1 / (x * pow(x,Integer.MAX_VALUE));
            }
            n = -1*n;
            return 1 / pow(x, n);
        }
        if(n% 2 ==0){
            double temp = pow(x,n/2);
            return  temp * temp;
        }
        double temp = pow(x,n/2);
        return x *temp * temp;
    }
    public double myPow(double x, int n) {
        double result = pow(x,n);
        return result;
    }
}