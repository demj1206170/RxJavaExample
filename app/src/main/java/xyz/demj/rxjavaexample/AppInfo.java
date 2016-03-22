package xyz.demj.rxjavaexample;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * Created by demj on 2016/3/22 0022.
 */
@Data
@Accessors(prefix = "m")
@AllArgsConstructor
@NoArgsConstructor
public class AppInfo implements Comparable<AppInfo>{
    long mLastUpdateTime;
    String mName;
    String mIcon;


    @Override
    public int compareTo(AppInfo o) {
        return getName().compareTo(o.getName());
    }
}
