package day15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Word_선생님정답 implements Comparable{
	
	private String word;
	private String mean;
	
	public Word_선생님정답() {}
	public Word_선생님정답(String word, String mean) {
		super();
		this.word = word;
		this.mean = mean;
	}
	
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public String getMean() {
		return mean;
	}
	public void setMean(String mean) {
		this.mean = mean;
	}
	@Override
	public String toString() {
		return word + " : " + mean;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(mean, word);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Word_선생님정답 other = (Word_선생님정답) obj;
		if(word == null) {
			if(other.word != null) {
				return false;
			}
		}else if(!word.equals(other.word)) {
			return false;
		}
		return true;
	}
	
	@Override
	public int compareTo(Object o) {
		Word_선생님정답 word = (Word_선생님정답)o;
		//오름차순
		return this.word.compareTo(word.word);
		//내림차순
		//return -this.word.compareTo(word.word);
	}
	
	
	
}