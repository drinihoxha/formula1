package com.example.formula1.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table
public class Driver implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(nullable = false, updatable = false)
  private Long id;
  private String fullName;

  private String team;
  private Integer gpEntered;
  private Integer numberOfWins;
  private Integer podiums;
  private Integer poles;
  private Integer age;
  private String driverPhoto;
  private String teamPhoto;
  private Integer points;

  public Driver() {}

  public Driver(String fullName,
                String team,
                Integer gpEntered,
                Integer numberOfWins,
                Integer podiums,
                Integer poles,
                Integer age,
                String driverPhoto,
                String teamPhoto,
                Integer points) {
    this.fullName = fullName;
    this.team = team;
    this.gpEntered = gpEntered;
    this.numberOfWins = numberOfWins;
    this.podiums = podiums;
    this.poles = poles;
    this.age = age;
    this.driverPhoto = driverPhoto;
    this.teamPhoto = teamPhoto;
    this.points = points;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public String getTeam() {
    return team;
  }

  public void setTeam(String team) {
    this.team = team;
  }

  public Integer getGpEntered() {
    return gpEntered;
  }

  public void setGpEntered(Integer gpEntered) {
    this.gpEntered = gpEntered;
  }

  public Integer getNumberOfWins() {
    return numberOfWins;
  }

  public void setNumberOfWins(Integer numberOfWins) {
    this.numberOfWins = numberOfWins;
  }

  public Integer getPodiums() {
    return podiums;
  }

  public void setPodiums(Integer podiums) {
    this.podiums = podiums;
  }

  public Integer getPoles() {
    return poles;
  }

  public void setPoles(Integer poles) {
    this.poles = poles;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public String getDriverPhoto() {
    return driverPhoto;
  }

  public void setDriverPhoto(String driverPhoto) {
    this.driverPhoto = driverPhoto;
  }

  public String getTeamPhoto() {
    return teamPhoto;
  }

  public void setTeamPhoto(String teamPhoto) {
    this.teamPhoto = teamPhoto;
  }

  public Integer getPoints() {
    return points;
  }

  public void setPoints(Integer points) {
    this.points = points;
  }

  @Override
  public String toString() {
    return "Driver{" +
            "id=" + id +
            ", fullName='" + fullName + '\'' +
            ", team='" + team + '\'' +
            ", gpEntered=" + gpEntered +
            ", numberOfWins=" + numberOfWins +
            ", podiums=" + podiums +
            ", poles=" + poles +
            ", age=" + age +
            ", driverPhoto='" + driverPhoto + '\'' +
            ", teamPhoto='" + teamPhoto + '\'' +
            ", points=" + points +
            '}';
  }
}























