package n2exercici2;

import java.util.Objects;

class Restaurant implements Comparable<Restaurant> {
    private String name;
    private int rating;

    public Restaurant(String name, int rating) {
        this.name = name;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }

    @Override
    public int compareTo(Restaurant other) {

        return Integer.compare(this.rating, other.rating);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Restaurant that = (Restaurant) o;

        if (rating != that.rating) return false;
        return name != null ? name.equals(that.name) : that.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + rating;
        return result;
    }

    @Override
    public String toString() {
        return "Restaurant{name='" + name + "', rating=" + rating + '}';
    }
}



