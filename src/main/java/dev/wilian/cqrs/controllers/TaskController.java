package dev.wilian.cqrs.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import an.awesome.pipelinr.Pipeline;
import dev.wilian.cqrs.commands.CreateTaskCommand;

@RestController
@RequestMapping("/task")
public class TaskController {

    @Autowired
    private Pipeline pipeline;

    @PostMapping("/create")
    public String createTask(@RequestBody CreateTaskCommand command) {
        return pipeline.send(command);
    }
}
