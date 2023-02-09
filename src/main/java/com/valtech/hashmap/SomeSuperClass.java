package com.valtech.hashmap;


import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Slf4j
public class SomeSuperClass {

  ClassADepend classADepend;
  ClassBDepend classBDepend;

  AtomicReference<ClassBDepend> reference=new AtomicReference<>();


  SomeSuperClass(ClassADepend a)
  {
    this.reference.set(classBDepend);
    this.classADepend=a;
    classADepend.apple="appleapple";
  }

  @Autowired
  public void setClassBDepend(ClassBDepend classBDepend)
  {
    System.out.println("setter");
     this.classBDepend=classBDepend;
  }
  public void some()
  {
    classADepend.apple="apple";
    classADepend.classamethod();
    classBDepend.classbmethod();
    System.out.println("this is atomic ref"+reference);
  }
  @PostConstruct
  public void pop()
  {
    System.out.println("postcontruct for SomeSuperClass");
  }
}

