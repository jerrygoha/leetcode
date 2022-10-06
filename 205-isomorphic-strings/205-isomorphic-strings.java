class Solution {
    public boolean isIsomorphic(String s, String t) {
    
        //input param 체크
        if (s == null || t == null) {
            return false;
        }
    
        if (s.length() != t.length()) {
            return false;
        }
    
        //해시맵 선언 -> char, int(인덱스)
        Map<Character, Integer> mapS = new HashMap<Character, Integer>();
        Map<Character, Integer> mapT = new HashMap<Character, Integer>();
    
        //한단어씩 확인하면서 확인
        //s와 t가 같은 형태로 배열되어있다면, 단어별 map에 등록되는 index도 같게되므로 아래 로직으로 확인 가능하다.
        for (int i = 0; i < s.length(); i++) {
            int indexS = mapS.getOrDefault(s.charAt(i), -1);
            int indexT = mapT.getOrDefault(t.charAt(i), -1);
                     
            if (indexS != indexT) {
                return false;
            }
        
            mapS.put(s.charAt(i), i);
            mapT.put(t.charAt(i), i);
        }    
        return true;
    }
}