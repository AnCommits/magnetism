package com.weblab.magnetism.service.impl;

import com.weblab.magnetism.model.Task;
import com.weblab.magnetism.service.interf.TaskService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {
    @Override
    public void create(Task entity) {

    }

    @Override
    public Task findById(Long id) {
        return null;
    }

    @Override
    public List<Task> findAll() {
        return null;
    }

    @Override
    public Task update(Task entity) {
        return null;
    }

    @Override
    public void delete(Task entity) {

    }
}
