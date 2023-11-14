package com.example.demo.rest.controller;

import com.example.demo.mapper.MapstructMapper;
import com.example.demo.model.request.CreateTaskRequest;
import com.example.demo.model.response.TaskResponse;
import com.example.demo.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("task")
public class TaskController {
    final TaskService taskService;
    final MapstructMapper mapper;

    @PostMapping("create")
    UUID createTask(@RequestBody CreateTaskRequest createTaskRequest) {
        return taskService.createTask(mapper.createTaskRequestToTask(createTaskRequest));
    }

    @GetMapping("byId/{id}")
    TaskResponse getTaskById(@PathVariable("id") UUID id) {
        return mapper.taskToTaskResponse(taskService.getTaskByID(id));
    }

    @PostMapping("update")
    void getTaskById(@RequestBody CreateTaskRequest createTaskRequest) {
        taskService.updateTask(mapper.createTaskRequestToTask(createTaskRequest));
    }

    @GetMapping("allTasks")
    List<TaskResponse> getAllTasks() {
        return mapper.taskListToTaskResponseList(taskService.getAllTasks());
    }
}
