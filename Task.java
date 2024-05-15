class Task implements Comparable<Task> {
    private int deadline;
    private String name;

    public Task(int deadline, String name) {
        this.deadline = deadline;
        this.name = name;
    }

    public int getDeadline() {
        return deadline;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Task other) {
        return Integer.compare(this.deadline, other.deadline);
    }

    @Override
    public String toString() {
        return name;
    }
}