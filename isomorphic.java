class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        // if ( s.length() != t.length() ) { return false;}
        
        HashMap <Character , Character > hashMap = new HashMap<>();
        HashMap <Character , Character > hashMap1 = new HashMap<>();
        
        
        for ( int i = 0 ; i < s.length() ; i++)
        {
            // if ( s.charAt(i) != s.charAt ) && ( s.charAt(i) )
            
            char schar = s.charAt(i);
            char tchar = t.charAt(i);
            
            
            if ( hashMap.containsKey(schar) && hashMap.get(schar) != tchar )
            {
                return false;
            }
            else
            {
                hashMap.put(schar , tchar);
            }
            
            if ( hashMap1.containsKey(tchar) && hashMap1.get(tchar) != schar)
            {
                return false;
            }
            
            else {
                hashMap1.put(tchar, schar);
            }
        }
        
        return true ;
        
    }
}