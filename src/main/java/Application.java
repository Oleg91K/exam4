import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Application {
        public static void main(String[] args) {
            EntityManagerFactory factory = Persistence.createEntityManagerFactory("entityManager");
            EntityManager manager = factory.createEntityManager();

            ClimberDao climberDao = new ClimberDao(manager);
            MountainDao mountainDao = new MountainDao(manager);
            ClimbingGroupDao climbingGroupDao = new ClimbingGroupDao(manager);
            // Альпинисты
            Climber climber1 = new Climber("Олег", 29, "abv");
            Climber climber2 = new Climber("Рома", 24, "avc");
            Climber climber3 = new Climber("Ира", 30, "anb");
            Climber climber4 = new Climber("Дарья", 25, "abd");
            // Горы
            Mountain mountain1 = new Mountain("Швейцарские альпы",2000);
            Mountain mountain2 = new Mountain("Логан", 5000);
            Mountain mountain3 = new Mountain("Фудзи", 3000);
            Mountain mountain4 = new Mountain("Йотунхеймен",4000);
            //Группы альпинистов
            // Groups
            /*
            LocalDate startDate1 = LocalDate.of(2021, Month.JANUARY, 20);
            LocalDate startDate2 = LocalDate.of(2021, Month.APRIL, 13);
            LocalDate startDate3 = LocalDate.of(2022, Month.MARCH, 22);
            GroupUp group1 = new GroupUp(mountain1, true, startDate1, 5);
            GroupUp group2 = new GroupUp(mountain2, true, startDate2, 3);
            GroupUp group3 = new GroupUp(mountain1, false, startDate3, 10);














































            // Manager
            /*manager.getTransaction().begin();
            climberDao.add(climber1);
            climberDao.add(climber2);
            climberDao.add(climber3);
            climberDao.add(climber4);
            mountainDao.add(mountain1);
            mountainDao.add(mountain2);
            mountainDao.add(mountain3);
            groupDao.add(group1);
            groupDao.add(group2);
            groupDao.add(group3);
            manager.getTransaction().commit();

            System.out.println(climberDao.getClimbersByAge(30, 80));
            System.out.println(mountainDao.getMountainsByCountry("Russia"));
            System.out.println(groupDao.getGroupsByIsOpen(true));
            System.out.println(groupDao.getGroupsByMountainName("Everest"));


        }
    }
