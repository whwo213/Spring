package com.springapp.mvc.dao;

import com.springapp.mvc.vo.MemberVo;

import java.util.List;

/**
 * Created by young on 2015-08-08.
 */
public interface MemberDao {
    public int register(MemberVo memberVo);
    public List<MemberVo> memberList();
}
