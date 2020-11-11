package chapter02;

public class User {
    private String name;
    private Integer points;
    private Boolean isModerator;

    public User(String name, Integer points, Boolean isModerator) {
        this.name = name;
        this.points = points;
        this.isModerator = isModerator;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public Boolean getModerator() {
        return isModerator;
    }

    public void setModerator(Boolean moderator) {
        isModerator = moderator;
    }

    public void toModerator(){
        this.setModerator(true);
    }
}
