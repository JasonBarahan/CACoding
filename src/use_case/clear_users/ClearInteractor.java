package use_case.clear_users;

public class ClearInteractor implements ClearInputBoundary {
    final ClearUserDataAccessInterface userDataAccessObject;
    final ClearOutputBoundary clearPresenter;

    public ClearInteractor(ClearUserDataAccessInterface userDataAccessInterface, ClearOutputBoundary clearOutputBoundary) {
        this.userDataAccessObject = userDataAccessInterface;
        this.clearPresenter = clearOutputBoundary;
    }

    @Override
    public void execute(ClearInputData clearInputData) {
        String usernames = userDataAccessObject.delete();

        // TODO: Returns success view.
        ClearOutputData clearOutputData = new ClearOutputData(usernames, false);
        clearPresenter.prepareSuccessView(clearOutputData);
    }
}
