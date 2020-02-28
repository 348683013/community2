package life.xiaonong.community.community.dto;

import lombok.Data;

import java.util.List;

/**
 * Created by zhouzhongzhong on 2020/2/27
 */
@Data
public class TagDTO {
    private String categoryName;
    private List<String> tags;
}
