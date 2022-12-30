package com.example.nbs.springbasic.dataaccess.SpringjdbcJPA;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class PlayerRepository {

    @PersistenceContext
    EntityManager entityManager;

    public PlayerEntity insertPlayer(PlayerEntity player)
    {
        return entityManager.merge(player);
    }

    public PlayerEntity updatePlayer(PlayerEntity player)
    {
        return entityManager.merge(player);
    }

    public PlayerEntity getPlayerById(int id) {
        return entityManager.find(PlayerEntity.class, id);
    }

    public void deleteById(int id){
        PlayerEntity player = entityManager.find(PlayerEntity.class, id);
        entityManager.remove(player);
    }
}
