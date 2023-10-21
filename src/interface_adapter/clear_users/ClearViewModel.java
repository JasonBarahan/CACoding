package interface_adapter.clear_users;

// TODO: clear view model

import interface_adapter.ViewModel;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class ClearViewModel extends ViewModel {
    private ClearState state = new ClearState();
    public ClearViewModel() {
        super("clear");
    }

    private final PropertyChangeSupport support = new PropertyChangeSupport(this);

    //  public static final String CLEAR_BUTTON_LABEL = "Clear";

    @Override
    public void firePropertyChanged() {
        support.firePropertyChange("clear", null, this.state);
    }

    @Override
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }

    public void setState(ClearState state) {
        this.state = state;
    }

    public ClearState getState() {
        return state;
    }
}
