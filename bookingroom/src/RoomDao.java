import java.util.ArrayList;

import org.bson.Document;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;

public class RoomDao {
    ConnectMongoDB connect;
    MongoDatabase database;
	RoomDao(){
	  connect = new ConnectMongoDB();
	  database = connect.getMongoDatabase();
    }
	
	ArrayList<Document> getRoomAll(Document queryBook) {
		MongoCollection  collection = database.getCollection("Booking");
		
		ArrayList<Document> arr = new ArrayList<>();
		MongoCursor<Document> cursor = collection.find(queryBook).iterator();		
		
		try {
		    while (cursor.hasNext()) {
                arr.add(cursor.next());
		    }
		} finally {
		    cursor.close();
		}

		return arr;
	}
	
}
