package testhan;

import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class WeinDetailDialog extends Dialog<ButtonType>{
	public WeinDetailDialog (Wein w) {
		Label lbl1 = new Label (w.getName());
		Label lbl2 = new Label (w.getWeingut());
		Label lbl3 = new Label ("Jahr: " + Integer.toString(w.getJahr()));
		Label lbl4 = new Label (Double.toString(w.getPreis())+ " €");

		
		VBox vb = new VBox(10, lbl1, lbl2, lbl3, lbl4);
		
		this.getDialogPane().setContent(vb);	
		this.getDialogPane().getButtonTypes().add(ButtonType.OK);

	}

}
