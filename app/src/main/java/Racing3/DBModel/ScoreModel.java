package Racing3.DBModel;

import lombok.*;


@Getter
@Setter
public class ScoreModel {
    private int Id;
    private int Score;
    private String name;

    ScoreModel(int score, String name){
        this.Score = score;
        this.name = name;
    }

}