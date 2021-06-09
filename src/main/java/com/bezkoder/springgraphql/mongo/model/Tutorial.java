package com.bezkoder.springgraphql.mongo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "tutorials")
public class Tutorial {
  @Id
  private String id;
  private String title;
  private String description;
  private String author_id;
  
  public Tutorial() {
  }

  public Tutorial(String title, String description, String author_id) {
    this.title = title;
    this.description = description;
    this.author_id = author_id;
  }

  public String getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getAuthorId() {
    return author_id;
  }

  public void setAuthorId(String author_id) {
    this.author_id = author_id;
  }

  public String getAuthor_id() {
	return author_id;
}

public void setAuthor_id(String author_id) {
	this.author_id = author_id;
}

@Override
  public String toString() {
    return "Tutorial [id=" + id + ", title=" + title + ", description=" + description + ", author_id=" + author_id + "]";
  }
}