package net.vtstar.rest.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class SpringDataRestDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDataRestDemoApplication.class, args);
    }

    @Autowired
    CustomerRepository customers;

    @Autowired
    UserRepository userRepository;
    public @PostConstruct
    void init() {
       /* customers.save(new Customer("Dave", "Matthews", Customer.Gender.MALE, //
                new Address("4711 Some Place", "54321", "BeiJing", "VA")));
        customers.save(new Customer("Ray", "Allen", Customer.Gender.MALE, //
                new Address("XinLuo Street", "123456", "Miami", "FL")));
        customers.save(new Customer("Andy", "Dufresne", Customer.Gender.MALE, //
                new Address("The Shawshank Redemption", "123456", "OKC", "DC")));
        customers.save(new Customer("Kobe", "Bryant", Customer.Gender.MALE, //
                new Address("Queens", "123456", "NYK", "WA")));
        customers.save(new Customer("Taylor", "Swift", Customer.Gender.FEMALE, //
                new Address("Brooklyn", "AA", "NYK", "VA")));*/

       User user1 = new User();
       user1.setLastname("Matthews");
       user1.setFirstname("Dave");
       user1.setPassword("123456");
       User user2 = new User();
        user2.setLastname("Allen");
        user2.setFirstname("Ray");
        user2.setPassword("123456");
       User user3 = new User();
        user3.setLastname("Dufresne");
        user3.setFirstname("Andy");
        user3.setPassword("123456");

       User user4 = new User();
        user4.setLastname("Bryant");
        user4.setFirstname("Kobe");
        user4.setPassword("123456");

       User user5 = new User();
        user5.setLastname("Swift");
        user5.setFirstname("Taylor");
        user5.setPassword("123456");

        userRepository.save(user1);
        userRepository.save(user2);
        userRepository.save(user3);
        userRepository.save(user4);
        userRepository.save(user5);
        /*userRepository.save(User.builder().name("Ray").password(")OKM1qaz").build());
        userRepository.save(User.builder().name("Kobe").password("!QAZ0okm").build());
        userRepository.save(User.builder().name("Andy").password("563202=").build());*/
    }
}
