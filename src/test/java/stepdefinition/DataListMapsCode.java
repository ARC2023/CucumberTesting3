package stepdefinition;

import java.util.Iterator;
import java.util.List;
import java.util.*;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.When;

public class DataListMapsCode {

	@When("User enters below credentials")
	public void user_enters_below_credentials(DataTable dataTable) {

		List<String> lister = dataTable.asList(String.class);

		for (String str : lister) {
			System.out.println(str);
		}
		for (int i = 0; i < lister.size(); i++) {
			System.out.println(lister.get(i));
		}
		Iterator<String> itr = lister.iterator();

		while (itr.hasNext()) {

			System.out.println(itr.next());
		}

	}

	@When("User enters below credentials Multiple cells")
	public void user_enters_below_credentials_multiple_cells(DataTable dataTable) {

		List<List<String>> outerlister = dataTable.asLists(String.class);

		for (List<String> innerList : outerlister) {

			for (String str : innerList) {

				System.out.print(str);

			}
			System.out.println();

		}

	}

	@When("User enters below credentials Multiple cells in maps")
	public void user_enters_below_credentials_multiple_cells_in_maps(DataTable dataTable) {

		List<Map<String, String>> sanjana = dataTable.asMaps(String.class, String.class);

		for (int i = 0; i < sanjana.size(); i++) {

			Map<String, String> maper = sanjana.get(i);
			for (String str : maper.keySet()) {

				System.out.println(maper.get(str));

			}

		}
		for (int i = 0; i < sanjana.size(); i++) {

			Map<String, String> maper = sanjana.get(i);
			
			System.out.println(maper.get("UN"));
			System.out.println(maper.get("EMAIL"));
			System.out.println(maper.get("CITY"));
			System.out.println(maper.get("PINCODE"));

		}

		for (Map<String, String> mapper : sanjana) {

			Set<String> keys = mapper.keySet();

			for (String str : keys) {

				System.out.println(mapper.get(str));
			}

		}

		for (Map<String, String> mapper : sanjana) {

			Iterator<String> itr = mapper.keySet().iterator();
			while (itr.hasNext()) {
				System.out.println(mapper.get(itr.next()));
			}

		}

	}

}
