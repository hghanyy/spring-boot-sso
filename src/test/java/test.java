import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class test {

    public static void main(String[]args)
    {
        BCryptPasswordEncoder bpe = new BCryptPasswordEncoder();
        System.out.println(bpe.encode("admin"));
    }



}
