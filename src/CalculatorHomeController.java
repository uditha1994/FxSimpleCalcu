import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

enum Exp{
    SUM, SUB, MUL, DIV
}

public class CalculatorHomeController {
    public TextField txtVal1;
    public TextField txtVal2;
    public TextField txtAnswer;

    public void calcAdition(ActionEvent actionEvent) {
        txtAnswer.setText(String.valueOf(calculate(Exp.SUM)));
    }

    public void calcSubtraction(ActionEvent actionEvent) {
        txtAnswer.setText(String.valueOf(calculate(Exp.SUB)));
    }

    public void calcDivide(ActionEvent actionEvent) {
        txtAnswer.setText(String.valueOf(calculate(Exp.DIV)));  }

    public void calcMultiplication(ActionEvent actionEvent) {
        txtAnswer.setText(String.valueOf(calculate(Exp.MUL)));
    }

    private double calculate(Exp exp){
        double val1 = Double.parseDouble(txtVal1.getText());
        double val2 = Double.parseDouble(txtVal2.getText());

        switch (exp){
            case SUM: return (val1+val2);
            case SUB: return (val1-val2);
            case DIV: return (val1/val2);
            case MUL: return (val1*val2);
            default: return 0.0;
        }
    }
}
