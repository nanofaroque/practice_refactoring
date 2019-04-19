package replace_code_with_class;

public class SystemPermission_1 {
    private PermissionState permission;
    private boolean granted;
    public SystemPermission_1() {
        setState(PermissionState.REQUESTED);
        granted = false;
    }

    public void claimed() {
        if (getState().equals(PermissionState.REQUESTED))
            setState(PermissionState.CLAIMED);
    }

    public void denied() {
        if (getState().equals(PermissionState.CLAIMED))
            setState(PermissionState.DENIED);
    }

    public void granted() {
        if (!getState().equals(PermissionState.CLAIMED)) return;
        setState(PermissionState.GRANTED);
        granted = true;
    }

    public boolean isGranted() {
        return granted;
    }

    public PermissionState getState() {
        return permission;
    }

    public void setState(PermissionState state) {
        this.permission=state;
    }
}
