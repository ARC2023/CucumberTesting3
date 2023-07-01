package stepdefinition;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.When;

public class DataListMapsCode {

	@When("User enters below credentials")
	public void user_enters_below_credentials(DataTable dataTable) {

		List<String> single = dataTable.asList(String.class);

		for (String str : single) {

			System.out.println(str);
		}

	}

	@When("User enters below credentials Multiple cells")
	public void user_enters_below_credentials_multiple_cells(DataTable dataTable) {

		List<List<String>> multiple = dataTable.asLists(String.class);

		for (List<String> str : multiple) {

			for (String str1 : str) {

				System.out.print(str1 + "   ");
			}

			System.out.println();

		}

	}

	
	
	
}
