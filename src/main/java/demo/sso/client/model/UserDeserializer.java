package demo.sso.client.model;

/**
 * 将服务端传来的user数据反序列化
 * 
 * @author Administrator
 *
 */
public interface UserDeserializer {

    /**
     * 反序列化
     * 
     * @param userDate
     * @return
     * @throws Exception
     */
    public SSOUser deserail(String userDate) throws Exception;
}
