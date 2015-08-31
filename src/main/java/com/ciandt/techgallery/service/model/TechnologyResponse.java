package com.ciandt.techgallery.service.model;

/**
 * Response with a technology entity.
 * 
 * @author felipers
 *
 */
public class TechnologyResponse implements Response {

  /** technology id. */
  private Long id;
  /** technology name. */
  private String name;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}