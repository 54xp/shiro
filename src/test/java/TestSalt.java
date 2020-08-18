import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.SimpleHash;

/**
 * @author xp
 * @create 2020-08-18 15:23
 */

public class TestSalt {
    public static void main(String[] args) {
        String password = "abcde";
    //    String salt = new SecureRandomNumberGenerator().nextBytes().toString();
        String salt = "123456";
        int times = 2;
        String algorithmName = "md5";

        String encodedPassword = new SimpleHash(algorithmName,password,salt,times).toString();

        System.out.printf("原始密码是 %s , 盐是： %s, 运算次数是： %d, 运算出来的密文是：%s ",password,salt,times,encodedPassword);

    }
}
