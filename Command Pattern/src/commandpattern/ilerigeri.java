// MEHMET https://github.com/SouL-H/
package commandpattern;




import java.awt.Component;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JOptionPane;
import javax.swing.undo.CannotRedoException;
import javax.swing.undo.CannotUndoException;
import javax.swing.undo.UndoManager;



class UndoManagerYardim {

  public static Action getUndoAction(UndoManager manager, String label) {
    return new GeriAction(manager, label);
  }

  public static Action getUndoAction(UndoManager manager) {
    return new GeriAction(manager, "Geri");
  }

  public static Action getRedoAction(UndoManager manager, String label) {
    return new İleriAction(manager, label);
  }

  public static Action getRedoAction(UndoManager manager) {
    return new İleriAction(manager, "İleri");
  }

  private abstract static class UndoRedoAction extends AbstractAction {
    UndoManager undoManager = new UndoManager();

    String errorMessage = "Geri alınacak veri bulunamadı.";

    String errorTitle = "Geri almada problem yaşandı.";

    protected UndoRedoAction(UndoManager manager, String name) {
      super(name);
      undoManager = manager;
    }

    public void setErrorMessage(String newValue) {
      errorMessage = newValue;
    }

    public void setErrorTitle(String newValue) {
      errorTitle = newValue;
    }

    protected void showMessage(Object source) {
      if (source instanceof Component) {
        JOptionPane.showMessageDialog((Component) source, errorMessage,
            errorTitle, JOptionPane.WARNING_MESSAGE);
      } else {
        System.err.println(errorMessage);
      }
    }
  }

  public static class GeriAction extends UndoRedoAction {
    public GeriAction(UndoManager manager, String name) {
      super(manager, name);
      setErrorMessage("Geri alınacak veri bulunamadı.");
      setErrorTitle("Geri almada problem yaşandı.");
    }

    public void actionPerformed(ActionEvent actionEvent) {
      try {
        undoManager.undo();
      } catch (CannotUndoException cannotUndoException) {
        showMessage(actionEvent.getSource());
      }
    }
  }

  public static class İleriAction extends UndoRedoAction {
    String errorMessage = "İleri alınacak veri bulunamadı.";

    String errorTitle = "İleri almada problem yaşandı.";

    public İleriAction(UndoManager manager, String name) {
      super(manager, name);
      setErrorMessage("İleri alınacak veri bulunamadı.");
      setErrorTitle("İleri almada problem yaşandı.");
    }

    public void actionPerformed(ActionEvent actionEvent) {
      try {
        undoManager.redo();
      } catch (CannotRedoException cannotRedoException) {
        showMessage(actionEvent.getSource());
      }
    }
  }

}

           
         
  