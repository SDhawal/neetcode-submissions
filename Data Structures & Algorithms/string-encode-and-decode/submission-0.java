class Solution {
StringBuilder encoded = new StringBuilder();
    public String encode(List<String> strs) {
        

        for(String str: strs){
            encoded.append(str.length()).append("#").append(str);
        }

        return(encoded.toString());

    }

    public List<String> decode(String str) {
        List result = new ArrayList<> ();

        int i = 0;
        while(i < encoded.length()){
            int j = i;

            while (encoded.charAt(j) != '#'){
                j++;
            }

            int length = Integer.parseInt(encoded.substring(i,j));

            String strf = encoded.substring(j+1,j+1+length);

            result.add(strf);

            i = j+1+length;

        }

        return result;

    }
}
