package replace_code_with_class;

        import org.junit.jupiter.api.Assertions;
        import org.junit.jupiter.api.Test;

public class SystemPermissionStateTest {
    @Test
    public void testClaimedBy() {
        SystemPermission_1 systemPermission = new SystemPermission_1();
        systemPermission.claimed();
        Assertions.assertEquals(PermissionState.CLAIMED, systemPermission.getState());
    }
}
