package com.zhou.book;

/**
 * @author :周广亚
 * @version :
 * @Date : 2017/5/1  0:12
 * @Desc :
 */

public class Game
{
    private int itsScore = 0;
    private int[] itsThrows = new int[21];
    private int itsCurrentThrow = 0;
    private int itsCurrentFrame = 1;
    private boolean firstThrow = true;

    public void add(int pints)
    {
        itsThrows[itsCurrentThrow++] = pints;
        itsScore += pints;
        adjustCurrentFrame(pints);

    }

    /**
     * @param pints
     */
    private void adjustCurrentFrame(int pints)
    {
        if (firstThrow == true)
        {
            // strike
            if (pints == 10)
            {
                itsCurrentFrame++;
            }
            else
            {
                firstThrow = false;
            }
        }
        else
        {
            firstThrow = true;
            itsCurrentFrame++;
        }
    }


    /**
     * 每一轮的分数
     * @param theFrame
     * @return
     */
    public int scoreForFrame(int theFrame)
    {
        int ball = 0;
        int score = 0;
        for(int currentFrame = 0;currentFrame < theFrame;currentFrame++)
        {
            int firstThrow = itsThrows[ball++];
            if (firstThrow==10)
            {
                score += 10 +itsThrows[ball] +itsThrows[ball++];
            }
            else
            {
                int secondThrow = itsThrows[ball];
                int frameScore = firstThrow + secondThrow;
            }



        }
        return score;

    }


















}
