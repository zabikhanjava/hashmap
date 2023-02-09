package com.valtech.hashmap;

import org.springframework.stereotype.Service;

@Service
public class ClassADepend {

  String apple;
  ClassADepend()
  {
    System.out.println("ClassADepend");
  }
  public void classamethod()
  {
    System.out.println("class a method"+apple);
  }
}
