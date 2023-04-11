import java.util.HashMap;
public class Songs{
    public static void main(String[] args){
        HashMap<String, String> songMap = new HashMap<String,String>();
            songMap.put("Staying Alive", "ha.ha.ha...Stayin' alive");
            songMap.put("Day In The Life", "Day in the life lets see if you really traped");
            songMap.put("Sicko Mode", "Sun is down,freezin cold");
            songMap.put("Mockingbird", "Now hush little,baby dont you cry");
            String name1 = songMap.get("Mockingbird");
            String name2 = songMap.get("Staying Alive");
            String name3 = songMap.get("Day In The Life");
            String name4 = songMap.get("Sicko Mode");
            System.out.println(name1);
            System.out.println(name2);
            System.out.println(name3);
            System.out.println(name4);
            for(String key : songMap.keySet()){
            System.out.println(String.format("Track: %s - Lyrics: %s", key, songMap.get(key)));
            }


        
    }
}

