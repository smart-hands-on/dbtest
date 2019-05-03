package sho.dbtest;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class GenericService {

	public GenericService() {
	}

	@PersistenceContext
	EntityManager em;

	public <T> T create(T t) {
		em.persist(t);
		em.flush();
		em.refresh(t);
		return t;
	}
}
