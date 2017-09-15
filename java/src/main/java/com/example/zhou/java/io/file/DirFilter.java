package com.example.zhou.java.io.file;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/**
 * @author :周广亚
 * @version :
 * @Date : 2017/8/9  11:01
 * @Desc :
 */


class DirFilter implements FilenameFilter
{
    private Pattern pattern ;

    public DirFilter(String regex)
    {
        this.pattern = Pattern.compile(regex);
    }

    @Override
    public boolean accept(File dir, String name)
    {
        return pattern.matcher(name).matches();
    }
}




