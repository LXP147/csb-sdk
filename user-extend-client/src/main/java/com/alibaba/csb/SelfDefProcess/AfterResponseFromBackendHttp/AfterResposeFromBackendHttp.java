package com.alibaba.csb.SelfDefProcess.AfterResponseFromBackendHttp;

import com.alibaba.csb.BaseSelfDefProcess;
import com.alibaba.csb.SelfDefProcess.SelfDefProcessException;

import java.util.Map;

/**
 * csb broker接收后端http业务服务响应后，执行此逻辑。
 * Created by tingbin.ctb
 * 2019/9/25-18:03.
 */
public interface AfterResposeFromBackendHttp extends BaseSelfDefProcess {
    /**
     * 自定义处理逻辑，用户可以：
     * <ul>
     * <li>  增加、修改、删除：响应头</li>
     * <li>  修改：响应body</li>
     * <li>  抛出异常，以中止服务处理，异常消息将直接返回给CSB客户端</li>
     * </ul>
     *
     * @param contextMap 服务响应上下文信息map，各信息的key见 BaseSelfDefProcess 常量定义:
     *                   <ul>
     *                   <li> _inner_ecsb_trace_id {@link BaseSelfDefProcess#TRACE_ID}</li>
     *                   <li> _csb_internal_name_  {@link BaseSelfDefProcess#CSB_INTERNAL_NAME}</li>
     *                   <li>_csb_broker_ip  {@link BaseSelfDefProcess#CSB_BROKER_IP}</li>
     *                   <li>_api_name  {@link BaseSelfDefProcess#API_NAME}</li>
     *                   <li>_api_version  {@link BaseSelfDefProcess#API_VERION}</li>
     *                   <li>_api_group  {@link BaseSelfDefProcess#API_GROUP}</li>
     *                   <li>userId  {@link BaseSelfDefProcess#USER_ID}</li>
     *                   <li>credentail_name  {@link BaseSelfDefProcess#CREDENTIAL_NAME}</li>
     *                   <li>_api_access_key  {@link BaseSelfDefProcess#ACCESS_KEY}</li>
     *                   <li>_remote_peer_ip  {@link BaseSelfDefProcess#REMOTE_PEER_IP}</li>
     *                   <li>_remote_real_ip  {@link com.alibaba.csb.BaseSelfDefProcess#BACKEND_REAL_IP}</li>
     *                   <li>backend_url  {@link BaseSelfDefProcess#BACKEND_URL}</li>
     *                   <li>backend_method  {@link BaseSelfDefProcess#BACKEND_METHOD}</li>
     *                   <li>request_http_querys {@link com.alibaba.csb.BaseSelfDefProcess#REQUEST_HTTP_QUERYS}</li>
     *                   <li>request_headers  {@link BaseSelfDefProcess#REQUEST_HEADERS}</li>
     *                   <li>response_headers  {@link BaseSelfDefProcess#RESPONSE_HEADERS}</li>
     *                   <li>request_body  {@link BaseSelfDefProcess#REQUEST_BODY}</li>
     *                   <li>response_body  {@link BaseSelfDefProcess#RESPONSE_BODY}</li>
     *                   </ul>
     * @throws SelfDefProcessException
     */
    void process(final Map<String, Object> contextMap) throws SelfDefProcessException;
}
