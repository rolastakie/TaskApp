package com.example.demo.mapper;

import com.example.demo.model.request.CreateTaskRequest;
import com.example.demo.model.request.CreateUserRequest;
import com.example.demo.model.response.TaskResponse;
import com.example.demo.model.response.UserResponse;
import com.example.demo.persistance.entity.Task;
import com.example.demo.persistance.entity.User;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MapstructMapper {
    User createUserRequestToUser(CreateUserRequest user);

    Task createTaskRequestToTask(CreateTaskRequest task);

    UserResponse userToUserResponse(User user);

    TaskResponse taskToTaskResponse(Task task);

    List<TaskResponse> taskListToTaskResponseList(List<Task> tasks);
}
