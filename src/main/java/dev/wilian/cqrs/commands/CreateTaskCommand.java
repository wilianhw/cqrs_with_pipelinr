package dev.wilian.cqrs.commands;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import an.awesome.pipelinr.Command;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateTaskCommand implements Command<String> {

    private String taskName;
}
