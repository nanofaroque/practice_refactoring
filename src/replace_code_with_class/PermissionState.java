package replace_code_with_class;

public class PermissionState {
    public final static PermissionState REQUESTED = new PermissionState();
    public final static PermissionState CLAIMED = new PermissionState();
    public final static PermissionState GRANTED = new PermissionState();
    public final static PermissionState DENIED = new PermissionState();
}
