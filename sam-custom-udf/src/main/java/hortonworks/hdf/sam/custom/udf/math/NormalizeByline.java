package hortonworks.hdf.sam.custom.udf.math;
import com.hortonworks.streamline.streams.rule.UDF;
import org.apache.commons.lang.WordUtils;

public class NormalizeByline implements UDF<String, String> {

    public String evaluate(String value) {
        String result = WordUtils.capitalize(value.replaceAll("By ", ""));
        return result;
    }

}
