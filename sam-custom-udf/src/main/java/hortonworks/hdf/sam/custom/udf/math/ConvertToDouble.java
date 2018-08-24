package hortonworks.hdf.sam.custom.udf.math;
import com.hortonworks.streamline.streams.rule.UDF;

public class ConvertToDouble implements UDF<Double, String> {

    public Double evaluate(String value) {
        return Double.valueOf(value);
    }

}
