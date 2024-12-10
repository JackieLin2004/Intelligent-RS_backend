package ynu.intelligentrs.intelligentrs_backend.service;

import com.baomidou.mybatisplus.extension.service.IService;
import ynu.intelligentrs.intelligentrs_backend.entity.dto.Account;
import ynu.intelligentrs.intelligentrs_backend.entity.vo.request.ConfirmResetVO;
import ynu.intelligentrs.intelligentrs_backend.entity.vo.request.EmailRegisterVO;
import ynu.intelligentrs.intelligentrs_backend.entity.vo.request.EmailResetVO;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface AccountService extends IService<Account>, UserDetailsService {
    Account findAccountByUsernameOrEmail(String text);

    String registerEmailVerifyCode(String type, String email, String ip);

    String registerEmailAccount(EmailRegisterVO info);

    String resetConfirm(ConfirmResetVO vo);

    String resetEmailAccountPassword(EmailResetVO vo);
}
