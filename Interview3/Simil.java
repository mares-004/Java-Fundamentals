package Interview3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

class Simil
{
    public static class Tuple{
        String website;
        int user;
        public Tuple(String w, int u) {
            this.website = w;
            this.user = u;
        }
    }
    
    /*public static class Common{
        int counter;
        String id;
        public Common(String id1, String id2){
            id = id1+id2;
        }
        public void addCommon(){
            ++counter;
        }
        public void addDifferent(){
            --counter;
        }
        public String getId(){
            return id;
        }
    }*/

    public static String greatestSim(List<Tuple> webUsers){
        String key;
    	//Tuple currentTuple = webUsers.get(0);
        HashMap<String,Integer> common = new HashMap<String,Integer>();
        for(int k = 0; k < webUsers.size() ; k++){
        	for(int i = k+1; i < webUsers.size() ; i++){
        		if(!webUsers.get(k).website.equals(webUsers.get(i).website)){
                	key=webUsers.get(k).website+webUsers.get(i).website;
                	//Common newCommon = new Common(currentTuple.website, webUsers.get(i).website);
                    if(!common.containsKey(key)){
                        common.put(key, 0);
                    } //else {
                        //newCommon = common.get(common.indexOf(newCommon));
                    //}
                    System.out.println("key: "+key);
                    if(webUsers.get(k).user == webUsers.get(i).user){
                    	
                        common.put(key,common.get(key)+1);
                        System.out.println("plus: "+common.get(key));
                    } //else {
                    	
                    	//common.put(key,common.get(key)-1);
                    	//System.out.println("minus: "+common.get(key));
                    //}
                    //common.put(key,common.get(key)-1);
                	//System.out.println("minus: "+common.get(key));
                }
        	}
            //currentTuple=webUsers.get(i);
        }
        
        //int maxCommon = common.get(0).commonUser;
        //int minDiff = common.get(0).differentUser;
        //Common bestCommon = common.get(0);
        //for(Common c : common){
        //    if(c.commonUser > maxCommon && c.differentUser < minDiff){
        //        bestCommon = c;
        //    }
        //}
        //List<String> result = new ArrayList<>();
        //result.add(bestCommon.tuple1.website);
        //result.add(bestCommon.tuple2.website);

        String result ="";
        int value = Integer.MIN_VALUE;
        Iterator it = common.entrySet().iterator();
        while(it.hasNext()) {
        	Map.Entry mapE = (Map.Entry)it.next();
        	if(value < (int)mapE.getValue()) {
        		value = (int)mapE.getValue();
        		result = (String)mapE.getKey();
        	}
        }
        return result;
    }

    public static void main(String[] args) {
        List<Tuple> tuples = new ArrayList<>();
        tuples.add(new Tuple("a", 1));
        tuples.add(new Tuple("a", 3));
        tuples.add(new Tuple("a", 5));
        tuples.add(new Tuple("b", 2));
        tuples.add(new Tuple("b", 6));
        //tuples.add(new Tuple("a", 2));
        //tuples.add(new Tuple("a", 6));
        //tuples.add(new Tuple("b", 1));
        //tuples.add(new Tuple("b", 3));
        //tuples.add(new Tuple("b", 5));
        tuples.add(new Tuple("c", 1));
        tuples.add(new Tuple("c", 2));
        tuples.add(new Tuple("c", 3));
        tuples.add(new Tuple("c", 4));
        tuples.add(new Tuple("c", 5));
        tuples.add(new Tuple("d", 4));
        tuples.add(new Tuple("d", 5));
        tuples.add(new Tuple("d", 6));
        tuples.add(new Tuple("d", 7));
        tuples.add(new Tuple("e", 1));
        tuples.add(new Tuple("e", 3));
        tuples.add(new Tuple("e", 5));
        tuples.add(new Tuple("e", 6));
        String ls = greatestSim(tuples);
        //for(String s: ls) {
            System.out.println("Tuple: "+ls);
        //}

    }
}

