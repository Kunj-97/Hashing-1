class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        // System.out.println(strs[0]);
        
        HashMap < Long , List<String> > result =new HashMap<> ();
        
        for ( String s : strs)
        {
            long prod = calcProduct (s);
            
            System.out.println(prod);
            
            if ( !result.containsKey(prod) )
            {
                result.put( prod, new ArrayList<>());
             }
            
            result.get(prod).add(s);
        }
        
        // List ans  = new  ArrayList<ArrayList<String>> ();
//           return ans ; 
        
        return new ArrayList<> ( result.values());
        
        
        
    }
    
    public long calcProduct ( String s){
        
      int []primes =   { 2 ,3 ,5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101,103 } ;
        
     
    long mult = 1;
       for (  int i = 0 ; i < s.length() ; i++)
        {
           int index = s.charAt(i) - 'a' ;
            mult = mult *primes[index];
        }
        
        
        
      return mult;
        
    }
    
    
//     public List<Integer> findPrime (){
        
//         for ( int i = 0 ; i < 1000 ; i++)
//         {
//             if 
//         }
    // }
}