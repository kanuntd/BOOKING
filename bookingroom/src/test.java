import java.util.ArrayList;
import java.util.Arrays;

import org.bson.Document;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		///file test basic
        RoomDao room = new RoomDao();
        Document doc = new Document("timeStart","08:00");
      
        ArrayList<Document> a = room.getRoomAll(doc); 
        for(int i=0;i<a.size();i++) {
        	 
        	 System.out.print(a.get(i).get("date")+" ");   
        	 System.out.print(a.get(i).get("timeStart")+" ");
        	 System.out.print(a.get(i).get("timeEnd")+" ");
        	 System.out.println("");
         }
         
       
        
         
        
	}

}
