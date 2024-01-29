package entities;

public class Inscription implements Comparable<Inscription> {
    private Integer queueId;
    private String name;

    public Inscription(Integer queueId, String name) {
        this.queueId = queueId;
        this.name = name;
    }

    public Integer getQueueId() {
        return queueId;
    }

    public void setQueueId(Integer queueId) {
        this.queueId = queueId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Inscription other) {
        return queueId.compareTo(other.queueId);
    }

    @Override
    public String toString() {
        return "Inscription{" +
                "queueId=" + queueId +
                ", name='" + name + '\'' +
                '}';
    }
}
