import com.alibaba.fastjson.JSONObject;

public class Test {
    @org.junit.Test
    public void test1(){
        String str ="{\"TOTAL\":\"1\",\"MSG\":\"上传失败\"}";
        if(str.indexOf("上传失败")>-1){
            System.out.println(str);
            return;
        }
        JSONObject obj=JSONObject.parseObject(str);
        System.out.println(obj.get("MSG"));
    }
}
