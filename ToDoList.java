import java.util.PriorityQueue;

class ToDoList {
    private PriorityQueue<Task> taskQueue;

    public ToDoList() {
        taskQueue = new PriorityQueue<>();
    }

    public void addTask(int deadline, String name) {
        Task task = new Task(deadline, name);
        taskQueue.add(task);
    }

    public void removeTask() {
        if (!taskQueue.isEmpty()) {
            Task removedTask = taskQueue.poll();
            System.out.println(removedTask + " selesai dilaksanakan, berikutnya " + viewNextTask());
        } else {
            System.out.println("Tidak ada task yang tersisa.");
        }
    }

    public String viewNextTask() {
        if (!taskQueue.isEmpty()) {
            return "Task terdekat yang harus diselesaikan: " + taskQueue.peek();
        } else {
            return "Tidak ada task yang tersisa.";
        }
    }

    public void clearTasks() {
        taskQueue.clear();
        System.out.println("Semua task telah dihapus.");
    }
}