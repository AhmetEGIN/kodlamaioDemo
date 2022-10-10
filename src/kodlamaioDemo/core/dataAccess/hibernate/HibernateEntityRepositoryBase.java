package kodlamaioDemo.core.dataAccess.hibernate;

import java.util.ArrayList;
import java.util.List;
import kodlamaioDemo.core.dataAccess.EntityRepository;

public class HibernateEntityRepositoryBase<TEntity>  implements EntityRepository<TEntity>  {
	public List<TEntity> entities; 

	@Override
	public void add(TEntity entity) {
		entities.add(entity);
		System.out.println("Hibenate ile eklendi");
		
	}
	public List<TEntity> get(){
		return entities;
	}
	
}
