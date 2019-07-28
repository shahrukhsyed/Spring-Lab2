package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cg.daos.TraineeDAO;
import com.cg.entities.Trainee;


@Service
@Transactional
public class TraineeServiceImpl implements TraineeService {

    @Autowired private TraineeDAO dao;
    
    @Transactional(readOnly=true)
    
    public Trainee find(int id) {
        return dao.findById(id);
    }

    @Transactional(readOnly=true)
    
    public List<Trainee> getAll() {
        return dao.findAll();
    }

    @Transactional(propagation=Propagation.REQUIRED)
    
    public void create(Trainee p) {
        dao.save(p);
    }

	public void delete(int id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	public void modify(Trainee t) {
		// TODO Auto-generated method stub
		dao.modify(t);
	}

}
