package juheAPI;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
/**
 * �������༰��ʶ�б�ӿڵ���JAVAʾ��
 * @author silk
 */
public class GetWeatherSignAndTypeList {
    //�ӿڵ�ַ,��Ϊֻ��Ҫ����һ���̶���keyΪ����,������Ϊ����
    private static final String URL= "http://v.juhe.cn/weather/uni?key=***a7558b2e0bedaa19673f74a6809ce";
    /**
     * ͨ���������ȡ����
     * @return
     */
    public static String excute(){
        return PureNetUtil.get(URL);//���ù������ȡ�ӿ�����
    }
    /**
     * ���ñ�������ķ�ʽ��ȡ
     * @param wid������Ӧid
     * @return ��������
     */
    public static String getWeatherByWid(String wid) {
        String result=excute();//��ȡ�ӿ�����
        if(result!=null){
            JSONObject obj=JSONObject.fromObject(result);
            result=obj.getString("resultcode");
            /*��ȡ����״̬��*/
            if(result!=null&&result.equals("200")){
                /*��ȡ��������*/
                result=obj.getString("result");
                JSONArray arr=JSONArray.fromObject(result);
                for(Object o:arr){//��������
                    obj=JSONObject.fromObject(o.toString());
                    //�����������Ҫ�����ݺ�ֱ�ӷ��ؽ��,����key(wid)�õ�value�ж��Ƿ���ڴ������
                    if(obj.getString("wid").equals(wid)){
                        result=obj.getString("weather");
                        return result;
                    }
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(getWeatherByWid("10"));
    }
}
