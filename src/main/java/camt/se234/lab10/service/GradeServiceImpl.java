package camt.se234.lab10.service;

import camt.se234.lab10.entity.Grade;
import org.springframework.stereotype.Service;

@Service
public class GradeServiceImpl implements GradeService {
    @Override
    public String getGrade(double score) {
        if(score>=80&&score<=100){
            return "A";
        }
        else if(score>=75){
            return "B";
        }
        else if(score>=60){
            return "C";
        }
        else if(score>=33){
            return "D";
        }
        else {
            return "F";
        }
    }
    @Override
    public String getGrade(double midtermScore, double finalScore) {
//        double score=(midtermScore+finalScore)/2;
//        if(score>=80&&score<=100){
//            return "A";
//        }
//        else if(score>=75){
//            return "B";
//        }
//        else if(score>=60){
//            return "C";
//        }
//        else if(score>=33){
//            return "D";
//        }
//        else {
//            return "F";
//        }
        return null;

    }
}
