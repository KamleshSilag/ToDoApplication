package io.kamlesh.todoapplicationspringboot.model;

public class Todo {

    public String content;
    public boolean done;

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}