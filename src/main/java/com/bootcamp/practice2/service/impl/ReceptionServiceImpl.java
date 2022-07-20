package com.bootcamp.practice2.service.impl;
import com.bootcamp.practice2.model.Reception;
import com.bootcamp.practice2.repository.ReceptionRepository;
import com.bootcamp.practice2.service.IReceptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ReceptionServiceImpl implements IReceptionService {

    @Autowired
    ReceptionRepository receptionRepository;

    @Override
    public List<Reception> findAll() {return receptionRepository.findAll();
    }

    @Override
    public Reception findById(long id) {
        Optional<Reception> op = receptionRepository.findById(id);
        return op.isPresent() ? op.get() : new Reception();
    }

    @Override
    public Reception create(Reception reception) {
        return receptionRepository.save(reception);
    }


    @Override
    public Reception update(Reception reception) {
        return receptionRepository.save(reception);
    }

    @Override
    public void delete(long id) {
        receptionRepository.deleteById(id);
    }

    @Override
    public void deleteById(long id) {

    }

    @Override
    public Reception save(Reception reception) {
        return null;
    }
}
