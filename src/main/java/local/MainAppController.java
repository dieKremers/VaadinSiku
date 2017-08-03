package local;

import java.util.ArrayList;
import java.util.List;

public class MainAppController 
{
	private List<Car> cars = new ArrayList<Car>();
	
	public void addDriver()
	{
//		try 
//		{
//			Car car = new Car();
//			car.setCarId( cars.size()+1 );
//
//			TextInputDialog dialog = new TextInputDialog("Driver Name");
//			dialog.setTitle("Bitte Fahrer-Namen eingeben");
//			dialog.setHeaderText(null);
//			dialog.setContentText("Bitte Fahrer Namen eingeben:");		
//			Optional<String> result = dialog.showAndWait();
//			if (result.isPresent()){
//			    car.setDriverName(result.get());
//			}
//			else
//			{
//				return;
//			}
//
//			//Open Template Picture
//			FileChooser fileDialog = new FileChooser();
//			fileDialog.setTitle("Bitte Bild zum Wiedererkennen des Autos auswählen");
//			fileDialog.setInitialDirectory(new File(".\\..\\templates"));
//			File file = fileDialog.showOpenDialog(primaryStage);
//			Image value;
//			value = new Image(file.toURI().toURL().toString());
//			car.setCarMask(cvUtil.imageToMat( value, true ));
//			
//			//TODO: Remove this. Just to have some sample Qualifying Results
//			car.setQualifyingTime(23);
//			car.setQualifyingTime(88);
//			car.setQualifyingTime(42);
//			cars.add(car);
//			updateCarListView();
//		} catch (Exception e) 
//		{
//			Alert alert = new Alert(AlertType.ERROR);
//			alert.setContentText("Car could not be created!");
//			alert.setHeaderText("ERROR: " + e.getClass() );
//			alert.setTitle("ERROR");
//			alert.showAndWait();
//			e.printStackTrace();
//		}

	}
	
	public void removeDriver()
	{
		
	}

}
