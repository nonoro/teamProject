package src.domain;

import java.util.Objects;

public class BoxOfficeInfo {
    private String id;
    private int audiAcc;

    public BoxOfficeInfo(String id, int audiAcc) {
        this.id = id;
        this.audiAcc = audiAcc;
    }

    public String getId() {
        return id;
    }

    public int getAudiAcc() {
        return audiAcc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BoxOfficeInfo that = (BoxOfficeInfo) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
