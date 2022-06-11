package com.map;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Question1 {
	@Id
private int question_id;
private String question;
@OneToMany(mappedBy = "question")
private List<Answer1> answers;
public Question1() {
	super();

}
public Question1(int question_id, String question, List<Answer1> answers) {
	super();
	this.question_id = question_id;
	this.question = question;
	this.answers = answers;
}
public int getQuestion_id() {
	return question_id;
}
public void setQuestion_id(int question_id) {
	this.question_id = question_id;
}
public String getQuestion() {
	return question;
}
public void setQuestion(String question) {
	this.question = question;
}
public List<Answer1> getAnswers() {
	return answers;
}
public void setAnswers(List<Answer1> answers) {
	this.answers = answers;
}
@Override
public String toString() {
	return "Question1 [question_id=" + question_id + ", question=" + question + ", answers=" + answers + "]";
}


}
