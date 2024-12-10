package ynu.intelligentrs.intelligentrs_backend.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import ynu.intelligentrs.intelligentrs_backend.entity.dto.Account;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AccountMapper extends BaseMapper<Account> {
}
