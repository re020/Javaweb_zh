package cn.itcast.test.util;


import cn.itcast.domain.Entity;
import com.alibaba.fastjson.JSON;


import java.util.ArrayList;
import java.util.List;

/**
 * JSON工具类
 * 处理和JSON相关的所有内容
 */
public class JSONUtil {
    public static void main(String[] args) {
        Entity entity =new Entity();
        entity.setId("100");
        entity.setCreatTime("20:24");
        String json = entity2JSON(entity);
        System.out.println(json);//{"creatTime":"20:24","id":"100","idDel":"1"}

        System.out.println("----------------------------------------------");
        List<Entity> entityList = new ArrayList<>();
        entityList.add(entity);
        String jsonList = entityList2JSON(entityList);
        System.out.println(jsonList);//[{"creatTime":"20:24","id":"100","idDel":"1"}]

        System.out.println("----------------------------------------------");
    //    String jsonstr = "{\"creatTime\":\"20:33\",\"id\":\"100\",\"idDel\":\"1\"}";

        Object obj = JSON2entity(json, Entity.class/*反射*/);
            //直接调用json

        //Object obj = JSON2entity(jsonstr, Entity.class/*反射*/);
                //Entity ent = JSON2entity(jsonstr, Entity.class/*反射*/);

        //System.out.println(obj);
        //Entity e = (Entity) obj;

        //获取json中的数据
                //System.out.println(ent.getCreatTime());


        Entity e = JSON2entity(json, Entity.class/*反射*/);;

        //Entity e = JSON2entity(jsonstr, Entity.class/*反射*/);;
        System.out.println(e.getCreatTime());

        System.out.println("---------------------------------------");
        String jsonArr = "[{\"creatTime\":\"20:35\",\"id\":\"100\",\"idDel\":\"1\"},{\"creatTime\":\"20:40\",\"id\":\"100\",\"idDel\":\"1\"}]";
        /*List<Entity> e1 = JSONARRAY2List(jsonArr, Entity.class);
        System.out.println(e1.get(0).getCreatTime());
        System.out.println(e1.get(1).getCreatTime());*/
        List<Entity> e1 = JSONARRAY2List(jsonList, Entity.class);
        System.out.println(e1.get(0).getCreatTime());

    }

    /**
     * 把对象转化成JSON格式的字符串
     * @param entity 指定对象
     * @return 返回JSON格式的字符串
     */
    public static String entity2JSON(Object entity){

        return JSON.toJSONString(entity);

    }

    /**
     *把对象列表转化成JSON格式的列表
     *
     * @param entityList 指定对象列表
     * @return 返回JSON格式的字符串
     */
    public static String entityList2JSON(List<?> entityList){
        return entity2JSON(entityList);
    }

    /**
     * 把JSON字符串转化成指定类型对象
     *
     * ?泛型的通配符 代表未知的任意类型 或者说是object
     * @param json 要转化的数据
     * @param clazz 指定的类型
     * @return 返回object类对象
     */
    /*public static Object JSON2entity(String json,Class<?> clazz){
        Object obj = JSON.parseObject(json, clazz);
        return obj;
    }*/

    /*public static Entity JSON2entity(String json,Class<Entity> clazz) {
       return JSON.parseObject(json, clazz);

    }*/

    /**把JSON字符串转化成指定类型对象
     *
     *
     * @param json 要转化的数据
     * @param clazz 指定的类型
     * @param <T>
     * @return
     */
    //貌似任意字符都行
    public static <T> T JSON2entity(String json,Class<T> clazz) {
        return JSON.parseObject(json, clazz);
    }

    /**
     *将JSON数组装换成指定类型的对象列表
     *
     * @param json 数据(String)
     * @param clazz 指定的类型(class)对象
     * @param <T> 指定的类型
     * @return 对象列表
     */
    public static <T> List<T> JSONARRAY2List(String json,Class<T> clazz){
       return JSON.parseArray(json,clazz);
    }
    public static <T> List<T> JSONARRAY3List(String json){
        return (List<T>) JSON.parseArray(json);
    }
}
