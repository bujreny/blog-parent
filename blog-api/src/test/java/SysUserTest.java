import org.apache.commons.codec.digest.DigestUtils;

/**
 * @author Administrator
 * @description TODO
 * @date 2023/3/10
 */
public class SysUserTest {

    private static final String salt = "bujreny!@#";

    //    calculatePassword
    public static void main(String[] args) {
        String password = "admin" + salt;
        System.out.println(DigestUtils.md5Hex(password));
    }
}
