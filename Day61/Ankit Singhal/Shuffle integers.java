class  Solution
{
    void shuffleArray(long arr[], int n)
    {
        int mod = 1001;
        for(int i=0; i<n/2; i++){
            arr[i * 2] += (arr[i] % mod) * mod;
            arr[i * 2 + 1] += (arr[i + n/2] % mod) * mod;
        }
        
        for(int i=0; i<n; i++){
            arr[i] /= mod;
        }
    }
}