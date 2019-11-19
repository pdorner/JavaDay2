	package testhan;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.stage.Stage;

public class T3FX_TRV1 extends Application {

	@Override
	public void start(Stage primaryStage) {
		TreeItem<WeinObject> vinothek = new TreeItem<>(new WeinObject());
		TreeItem<WeinObject> weisswein = new TreeItem<>(new WeinObject("Weissweine"));
		TreeItem<WeinObject> gv = new TreeItem<>(new Wein("Grüner Veltliner", "Jamek", 2018, 13.45));
		TreeItem<WeinObject> gm = new TreeItem<>(new Wein("Gemischter Staz", "Zahel", 2018, 15.90));
		TreeItem<WeinObject> rotwein = new TreeItem<>(new WeinObject("Rotweine"));
		TreeItem<WeinObject> ml = new TreeItem<>(new Wein("Merlo", "Mezzano", 2018, 7.99));
		TreeItem<WeinObject> ci = new TreeItem<>(new Wein("Cianti", "Venzzia", 2018, 18.90));
		TreeItem<WeinObject> ch = new TreeItem<>(new Wein("Château Latour", "Pauilac", 2009, 11200.00));
		TreeItem<WeinObject> gemischter = new TreeItem<>(new WeinObject("Gemischter Satz"));
		TreeItem<WeinObject> wg = new TreeItem<>(new Wein("Wiener Gemischter Satz", "Mayer", 2018, 10.00));
		TreeItem<WeinObject> lg = new TreeItem<>(new Wein("Laessinger Gemischter Satz", "Laessinger", 2018, 4.90));

		
		weisswein.getChildren().addAll(gv, gm);
		rotwein.getChildren().addAll(ml, ci, ch);
		gemischter.getChildren().addAll(wg, lg);
		vinothek.getChildren().addAll(weisswein, rotwein, gemischter);
		vinothek.setExpanded(true);

		TreeView<WeinObject> tree = new TreeView<>(vinothek);
		tree.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
		tree.getSelectionModel().selectedItemProperty().
		addListener(new ChangeListener<TreeItem<WeinObject>>() {

			@Override
			public void changed(ObservableValue<? extends TreeItem<WeinObject>> observable,
					TreeItem<WeinObject> oldValue, 
					TreeItem<WeinObject> newValue) {
				if (newValue.getValue() instanceof Wein) { //ist im TreeItem ein WeinKlasse und nur dann modaler Dialog öffnen
					WeinDetailDialog wdd = 
							new WeinDetailDialog((Wein) newValue.getValue());
					wdd.showAndWait();
				}
			}
		});
		primaryStage.setScene(new Scene(tree));
		primaryStage.setTitle("T3FX_TRV1");
		primaryStage.show();


	}

	
	
	public static void main(String[] args) {
		launch(args);
	}
}
