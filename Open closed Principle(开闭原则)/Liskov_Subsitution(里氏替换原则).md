1.里氏替换原则的作用：
  里氏替换原则是实现开闭原则的重要方式之一
  它克服了继承中重写父类造成的可复用性变差的缺点
  它是动作正确的保证，即类的扩展不会给已有的系统引入新的错误，降低了代码出错的可能性

2.里氏替换原则的实现方法：
  里氏替换原则通俗来讲就是：子类可以扩展父类的功能，但是不能改变父类原有的功能。也就是说：子类继承父类时，除添加新的方法完成新增功能外，尽量不要重写父类的方法。
