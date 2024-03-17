package br.com.dani.layout.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Task {

  public Task(Long id, String name, String priority) {
    this.id = id;
    this.name = name;
    this.priority = priority;
  }

  public Task() {
  }

  private Long id;
  private String name;
  private String priority;

  public void setId(Long id) {
    this.id = id;
  }

  public Long getId() {
    return id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
  
  public String getPriority() {
    return this.priority;
  }

  public void setPriority(String priority) {
    this.priority = priority;
  }
 
}
