package com.valtech.hashmap;

import org.springframework.stereotype.Service;

@Service
public class ClassBDepend {

  ClassBDepend()
  {
    System.out.println("ClassBDepend");
  }
 public void classbmethod()
 {
   System.out.println("class b method");
 }
}
