package dev.wilian.cqrs.handles;

import org.springframework.stereotype.Service;

import an.awesome.pipelinr.Command;
import dev.wilian.cqrs.commands.CreateTaskCommand;

@Service
public class CreateTaskCommandHandler implements Command.Handler<CreateTaskCommand, String> {

    @Override
    public String handle(CreateTaskCommand command) {
        return "Task created: " + command.getTaskName();
    }
}
