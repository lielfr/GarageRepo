package ac.il.haifa.cs.sweng.GarageRepo;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Font;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class PrimaryController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField searchField;

    @FXML
    private TableView<Record> dataTable;

    @FXML
    void updateList(ActionEvent event) {
    	Retrofit retrofit = new Retrofit.Builder()
    			.baseUrl("https://data.gov.il/api/3/action/")
    			.addConverterFactory(JacksonConverterFactory.create())
    			.build();
    	APIAccess apiAccess = retrofit.create(APIAccess.class);
    	APIData data;
		try {
			data = apiAccess.datastoreSearch(searchField.getText()).execute().body();
			List<Record> records = data.getResult().getRecords();
	    	
	    	TableColumn<Record, String> misparColumn = new TableColumn<>("Garage ID");
	    	misparColumn.setCellValueFactory(new PropertyValueFactory<>("misparMosah"));
	    	
	    	TableColumn<Record, String> nameColumn = new TableColumn<>("Garage Name");
	    	nameColumn.setCellValueFactory(new PropertyValueFactory<>("shemMosah"));
	    	
	    	TableColumn<Record, String> addressColumn = new TableColumn<>("Address");
	    	addressColumn.setCellValueFactory(new PropertyValueFactory<>("ktovet"));
	    	
	    	TableColumn<Record, String> telephoneColumn = new TableColumn<>("Phone Number");
	    	telephoneColumn.setCellValueFactory(new PropertyValueFactory<>("telephone"));
	    	dataTable.getColumns().clear();
	    	
	    	dataTable.getColumns().addAll(misparColumn, nameColumn, addressColumn, telephoneColumn);
	    	
	    	dataTable.setItems(FXCollections.observableArrayList(records));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }

    @FXML
    void initialize() {
        assert searchField != null : "fx:id=\"searchField\" was not injected: check your FXML file 'primary.fxml'.";
        assert dataTable != null : "fx:id=\"dataTable\" was not injected: check your FXML file 'primary.fxml'.";
        
        
        
    }
}
