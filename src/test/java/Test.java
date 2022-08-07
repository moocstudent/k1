import demo1.ObjKt;

import static org.junit.jupiter.api.Assertions.assertAll;


public class Test {

    /**
     * 如果没有添加相关注解，则选填参数是必填的。编译错误
     */
    @org.junit.jupiter.api.Test
    void testOverloads(){
//        assertAll("overloads called from Java",
//                ()-> System.out.println(ObjKt.addProduct("Name",5.0,"Desc")),
//                ()-> System.out.println(ObjKt.addProduct("Name",5.0)),
//                ()-> System.out.println(ObjKt.addProduct("Name")));
    }

    @org.junit.jupiter.api.Test
    void testOverloadsAnnotation(){
        assertAll("overloads called from Java",
                ()-> System.out.println(ObjKt.addProductSelection("Name",5.0,"Desc")),
                ()-> System.out.println(ObjKt.addProductSelection("Name",5.0)),
                ()-> System.out.println(ObjKt.addProductSelection("Name")));
    }


}
