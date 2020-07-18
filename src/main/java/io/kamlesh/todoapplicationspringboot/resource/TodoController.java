package io.kamlesh.todoapplicationspringboot.resource;

import io.kamlesh.todoapplicationspringboot.model.Todo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.concurrent.ConcurrentHashMap;

@Controller
public class TodoController {

    ConcurrentHashMap<String,Todo> task = new ConcurrentHashMap<>();

    @GetMapping("/dashboard")
    public String toDoForm(Model model,@ModelAttribute Todo todo) {
        model.addAttribute("todo", new Todo());
        model.addAttribute("tasks",task);
        return "todo";
    }

    @PostMapping("/dashboard")
    public String toDoFormSubmit(Model model,@ModelAttribute Todo todo) {
        task.put(todo.getContent(),todo);
        model.addAttribute("tasks",task);
        return "todo";
    }

}