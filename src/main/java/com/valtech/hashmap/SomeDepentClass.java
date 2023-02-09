package com.valtech.hashmap;


import java.util.Optional;
import javax.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class SomeDepentClass extends SomeSuperClass{


  SomeDepentClass(Optional<ClassADepend> classADepend)
  {
    super(classADepend.orElse(new ClassADepend()));
  }

}

