package hellojpa;

import javax.persistence.*;
import java.util.List;

public class JpaMain {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        tx.begin();

        try {
            Member member = new Member();
            member.setUsername("kim");
            em.persist(member);

            String query =
                    "SELECT m.member_id, m.city, m.street, m.zipcode, m.username " +
                    "FROM member m " +
                    "WHERE m.username = 'kim'";

            List<Member> result = em.createNativeQuery(query, Member.class).getResultList();

            for (Member findMember : result) {
                System.out.println("findMember = " + findMember.getUsername());
            }

            tx.commit();
        } catch (Exception e) {
            tx.rollback();
            e.printStackTrace();
        } finally {
            em.close();
        }

        emf.close();
    }

}
