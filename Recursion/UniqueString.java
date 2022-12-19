public class UniqueString {
    public static void removeDuplicate(String str,int i,StringBuilder news, boolean[] map){
        if(i==str.length()) return;
        if(map[str.charAt(i)-'a']==true){
            removeDuplicate(str, i+1, news, map);
        }
        else{
            map[str.charAt(i)-'a']=true;
            news = news.append(str.charAt(i));
            removeDuplicate(str, i+1, news, map);
        }
    }
    public static void main(String[] args) {
        String s="aaryankfhahfiockarncfpqwir";
        StringBuilder ns=new StringBuilder();
        boolean map[]=new boolean[26];
        removeDuplicate(s, 0, ns, map);
        System.out.println(ns);
    }
}
