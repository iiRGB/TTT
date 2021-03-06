package org.tis.tools.abf.module.ac.service.impl;

import org.springframework.stereotype.Service;
import org.tis.tools.abf.module.ac.entity.AcOperatorShortcut;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.tis.tools.abf.module.ac.dao.AcOperatorShortcutMapper;
import org.springframework.transaction.annotation.Transactional;
import org.tis.tools.abf.module.ac.service.IAcOperatorShortcutService;

/**
 * acOperatorShortcut的Service接口实现类
 * 
 * @author Auto Generate Tools
 * @date 2018/04/23
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class AcOperatorShortcutServiceImpl extends ServiceImpl<AcOperatorShortcutMapper, AcOperatorShortcut> implements IAcOperatorShortcutService {

}

