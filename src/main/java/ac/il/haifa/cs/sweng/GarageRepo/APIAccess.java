package ac.il.haifa.cs.sweng.GarageRepo;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface APIAccess {
	@GET("datastore_search?resource_id=bb68386a-a331-4bbc-b668-bba2766d517d")
	Call<APIData> datastoreSearch(@Query("q") String query);
}
