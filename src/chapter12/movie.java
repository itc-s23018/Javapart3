package chapter12;

public class movie {
    private String Title;
    private int income;
    private int year;

    public movie(String title, int income, int year) {
        Title = title;
        this.income = income;
        this.year = year;
    }

    public String getTitle() {
        return Title;
    }

    public int getIncome() {
        return income;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "movie{" +
                "Title='" + Title + '\'' +
                ", income=" + income +
                ", year=" + year +
                '}';
    }
}
