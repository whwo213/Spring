package com.springapp.mvc.service;

import com.springapp.mvc.dao.MemberDao;
import com.springapp.mvc.vo.MemberVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Member;
import java.util.List;

/**
 * Created by young on 2015-08-08.
 */
@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    public MemberDao memberDao;

    public void setMemberDao(MemberDao memberDao){
        this.memberDao = memberDao;
    }

    @Override
    public int register(MemberVo memberVo) {
        return this.memberDao.register(memberVo);
    }

    @Override
    public List<MemberVo> memberList() {
        return this.memberDao.memberList();
    }
}
