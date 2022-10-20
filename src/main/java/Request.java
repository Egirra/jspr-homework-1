import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.util.List;

import org.apache.commons.collections.MultiMap;
import org.apache.commons.collections.map.MultiValueMap;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.NameValuePair;

public class Request {

    public static MultiMap getQueryParam(String url) {
        MultiMap parameter = new MultiValueMap();
        try {
            List<NameValuePair> queryParams = URLEncodedUtils.parse(new URI(url), StandardCharsets.UTF_8);
            for (NameValuePair param : queryParams) {
                if (param.getName() != null && param.getValue() != null) {
                    parameter.put(param.getName(), param.getValue());
                }
            }
        } catch (URISyntaxException ex) {
            ex.printStackTrace();
        }
        return parameter;
    }

    public static String getQueryPath(String url) {
        int i = url.indexOf("?");
        if (i == -1) return url;
        String path = url.substring(0, i);
        return path;
    }
}
