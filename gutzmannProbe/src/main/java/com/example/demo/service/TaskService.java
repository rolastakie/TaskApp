package com.example.demo.service;

import com.example.demo.persistance.entity.Task;
import com.example.demo.persistance.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Slf4j
@Service
@RequiredArgsConstructor
public class TaskService {
    final TaskRepository taskRepository;

    public UUID createTask(Task taskRequest) {

        taskRepository.save(taskRequest);
        return taskRequest.getId();
    }

    public Task getTaskByID(UUID id) {
        return taskRepository.getReferenceById(id);
    }

    public void updateTask(Task task) {
        taskRepository.save(task);
    }

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }
}
