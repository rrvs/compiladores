/* Generated By:JavaCC: Do not edit this line. langXTokenManager.java */
package parser;
import java.io.*;
import recovery.*;

/** Token Manager. */
public class langXTokenManager implements langXConstants
{
int countLexError = 0;

public int foundLexError()
{
   return countLexError;
}

  /** Debug output. */
  public  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private final int jjStopStringLiteralDfa_0(int pos, long active0, long active1)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x10000000L) != 0L)
            return 2;
         if ((active0 & 0xc000000L) != 0L)
         {
            jjmatchedKind = 70;
            return 2;
         }
         if ((active0 & 0x9ffc3fff000L) != 0L)
         {
            jjmatchedKind = 46;
            return 1;
         }
         return -1;
      case 1:
         if ((active0 & 0xc000000L) != 0L)
            return 2;
         if ((active0 & 0x40000L) != 0L)
            return 1;
         if ((active0 & 0x9ffc3fbf000L) != 0L)
         {
            jjmatchedKind = 46;
            jjmatchedPos = 1;
            return 1;
         }
         return -1;
      case 2:
         if ((active0 & 0x1a0000L) != 0L)
            return 1;
         if ((active0 & 0x9ffc3e1f000L) != 0L)
         {
            jjmatchedKind = 46;
            jjmatchedPos = 2;
            return 1;
         }
         return -1;
      case 3:
         if ((active0 & 0x80940408000L) != 0L)
            return 1;
         if ((active0 & 0x1f683a17000L) != 0L)
         {
            jjmatchedKind = 46;
            jjmatchedPos = 3;
            return 1;
         }
         return -1;
      case 4:
         if ((active0 & 0x1c401814000L) != 0L)
         {
            jjmatchedKind = 46;
            jjmatchedPos = 4;
            return 1;
         }
         if ((active0 & 0x3282203000L) != 0L)
            return 1;
         return -1;
      case 5:
         if ((active0 & 0x18400014000L) != 0L)
         {
            jjmatchedKind = 46;
            jjmatchedPos = 5;
            return 1;
         }
         if ((active0 & 0x4001800000L) != 0L)
            return 1;
         return -1;
      case 6:
         if ((active0 & 0x10000004000L) != 0L)
         {
            jjmatchedKind = 46;
            jjmatchedPos = 6;
            return 1;
         }
         if ((active0 & 0x8400010000L) != 0L)
            return 1;
         return -1;
      case 7:
         if ((active0 & 0x10000004000L) != 0L)
         {
            jjmatchedKind = 46;
            jjmatchedPos = 7;
            return 1;
         }
         return -1;
      case 8:
         if ((active0 & 0x4000L) != 0L)
         {
            jjmatchedKind = 46;
            jjmatchedPos = 8;
            return 1;
         }
         if ((active0 & 0x10000000000L) != 0L)
            return 1;
         return -1;
      case 9:
         if ((active0 & 0x4000L) != 0L)
         {
            jjmatchedKind = 46;
            jjmatchedPos = 9;
            return 1;
         }
         return -1;
      default :
         return -1;
   }
}
private final int jjStartNfa_0(int pos, long active0, long active1)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0, active1), pos + 1);
}
private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 33:
         jjmatchedKind = 29;
         return jjMoveStringLiteralDfa1_0(0x0L, 0x1L);
      case 37:
         return jjStopAtPos(0, 69);
      case 38:
         return jjMoveStringLiteralDfa1_0(0x4000000L, 0x0L);
      case 40:
         return jjStopAtPos(0, 49);
      case 41:
         return jjStopAtPos(0, 50);
      case 42:
         return jjStopAtPos(0, 67);
      case 43:
         return jjStopAtPos(0, 65);
      case 44:
         return jjStopAtPos(0, 56);
      case 45:
         return jjStopAtPos(0, 66);
      case 46:
         return jjStopAtPos(0, 57);
      case 47:
         jjmatchedKind = 68;
         return jjMoveStringLiteralDfa1_0(0xc0L, 0x0L);
      case 59:
         return jjStopAtPos(0, 55);
      case 60:
         jjmatchedKind = 60;
         return jjMoveStringLiteralDfa1_0(0x4000000000000000L, 0x0L);
      case 61:
         jjmatchedKind = 58;
         return jjMoveStringLiteralDfa1_0(0x2000000000000000L, 0x0L);
      case 62:
         jjmatchedKind = 59;
         return jjMoveStringLiteralDfa1_0(0x8000000000000000L, 0x0L);
      case 91:
         return jjStopAtPos(0, 53);
      case 93:
         return jjStopAtPos(0, 54);
      case 94:
         return jjStartNfaWithStates_0(0, 28, 2);
      case 98:
         return jjMoveStringLiteralDfa1_0(0x440001000L, 0x0L);
      case 99:
         return jjMoveStringLiteralDfa1_0(0x6000L, 0x0L);
      case 101:
         return jjMoveStringLiteralDfa1_0(0x18000L, 0x0L);
      case 102:
         return jjMoveStringLiteralDfa1_0(0x3200020000L, 0x0L);
      case 105:
         return jjMoveStringLiteralDfa1_0(0xc0000L, 0x0L);
      case 108:
         return jjMoveStringLiteralDfa1_0(0x100000000L, 0x0L);
      case 110:
         return jjMoveStringLiteralDfa1_0(0x80000100000L, 0x0L);
      case 112:
         return jjMoveStringLiteralDfa1_0(0x1c000200000L, 0x0L);
      case 114:
         return jjMoveStringLiteralDfa1_0(0xc00000L, 0x0L);
      case 115:
         return jjMoveStringLiteralDfa1_0(0x83000000L, 0x0L);
      case 116:
         return jjMoveStringLiteralDfa1_0(0x800000000L, 0x0L);
      case 123:
         return jjStopAtPos(0, 51);
      case 124:
         return jjMoveStringLiteralDfa1_0(0x8000000L, 0x0L);
      case 125:
         return jjStopAtPos(0, 52);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
private int jjMoveStringLiteralDfa1_0(long active0, long active1)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0, active1);
      return 1;
   }
   switch(curChar)
   {
      case 38:
         if ((active0 & 0x4000000L) != 0L)
            return jjStartNfaWithStates_0(1, 26, 2);
         break;
      case 42:
         if ((active0 & 0x40L) != 0L)
            return jjStopAtPos(1, 6);
         break;
      case 47:
         if ((active0 & 0x80L) != 0L)
            return jjStopAtPos(1, 7);
         break;
      case 61:
         if ((active0 & 0x2000000000000000L) != 0L)
            return jjStopAtPos(1, 61);
         else if ((active0 & 0x4000000000000000L) != 0L)
            return jjStopAtPos(1, 62);
         else if ((active0 & 0x8000000000000000L) != 0L)
            return jjStopAtPos(1, 63);
         else if ((active1 & 0x1L) != 0L)
            return jjStopAtPos(1, 64);
         break;
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x1000000000L, active1, 0L);
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0xd00000L, active1, 0L);
      case 102:
         if ((active0 & 0x40000L) != 0L)
            return jjStartNfaWithStates_0(1, 18, 1);
         break;
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0x80000000L, active1, 0L);
      case 105:
         return jjMoveStringLiteralDfa2_0(active0, 0x2000000000L, active1, 0L);
      case 108:
         return jjMoveStringLiteralDfa2_0(active0, 0x20000a000L, active1, 0L);
      case 110:
         return jjMoveStringLiteralDfa2_0(active0, 0x80000L, active1, 0L);
      case 111:
         return jjMoveStringLiteralDfa2_0(active0, 0x500024000L, active1, 0L);
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0x18800201000L, active1, 0L);
      case 116:
         return jjMoveStringLiteralDfa2_0(active0, 0x1000000L, active1, 0L);
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0x84002000000L, active1, 0L);
      case 120:
         return jjMoveStringLiteralDfa2_0(active0, 0x10000L, active1, 0L);
      case 121:
         return jjMoveStringLiteralDfa2_0(active0, 0x40000000L, active1, 0L);
      case 124:
         if ((active0 & 0x8000000L) != 0L)
            return jjStartNfaWithStates_0(1, 27, 2);
         break;
      default :
         break;
   }
   return jjStartNfa_0(0, active0, active1);
}
private int jjMoveStringLiteralDfa2_0(long old0, long active0, long old1, long active1)
{
   if (((active0 &= old0) | (active1 &= old1)) == 0L)
      return jjStartNfa_0(0, old0, old1);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0, 0L);
      return 2;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa3_0(active0, 0x402000L);
      case 98:
         return jjMoveStringLiteralDfa3_0(active0, 0x4000000000L);
      case 101:
         return jjMoveStringLiteralDfa3_0(active0, 0x1000L);
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x8000200000L);
      case 108:
         return jjMoveStringLiteralDfa3_0(active0, 0x81000000000L);
      case 110:
         return jjMoveStringLiteralDfa3_0(active0, 0x2100004000L);
      case 111:
         return jjMoveStringLiteralDfa3_0(active0, 0x10680000000L);
      case 112:
         return jjMoveStringLiteralDfa3_0(active0, 0x2000000L);
      case 114:
         if ((active0 & 0x20000L) != 0L)
            return jjStartNfaWithStates_0(2, 17, 1);
         return jjMoveStringLiteralDfa3_0(active0, 0x1000000L);
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0x8000L);
      case 116:
         if ((active0 & 0x80000L) != 0L)
            return jjStartNfaWithStates_0(2, 19, 1);
         return jjMoveStringLiteralDfa3_0(active0, 0x40810000L);
      case 117:
         return jjMoveStringLiteralDfa3_0(active0, 0x800000000L);
      case 119:
         if ((active0 & 0x100000L) != 0L)
            return jjStartNfaWithStates_0(2, 20, 1);
         break;
      default :
         break;
   }
   return jjStartNfa_0(1, active0, 0L);
}
private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0, 0L);
      return 3;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa4_0(active0, 0x2200001000L);
      case 100:
         if ((active0 & 0x400000L) != 0L)
            return jjStartNfaWithStates_0(3, 22, 1);
         break;
      case 101:
         if ((active0 & 0x8000L) != 0L)
            return jjStartNfaWithStates_0(3, 15, 1);
         else if ((active0 & 0x40000000L) != 0L)
            return jjStartNfaWithStates_0(3, 30, 1);
         else if ((active0 & 0x800000000L) != 0L)
            return jjStartNfaWithStates_0(3, 35, 1);
         return jjMoveStringLiteralDfa4_0(active0, 0x2010000L);
      case 103:
         if ((active0 & 0x100000000L) != 0L)
            return jjStartNfaWithStates_0(3, 32, 1);
         break;
      case 105:
         return jjMoveStringLiteralDfa4_0(active0, 0x1000000L);
      case 108:
         if ((active0 & 0x80000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 43, 1);
         return jjMoveStringLiteralDfa4_0(active0, 0x4400000000L);
      case 110:
         return jjMoveStringLiteralDfa4_0(active0, 0x200000L);
      case 114:
         return jjMoveStringLiteralDfa4_0(active0, 0x80000000L);
      case 115:
         return jjMoveStringLiteralDfa4_0(active0, 0x1000006000L);
      case 116:
         return jjMoveStringLiteralDfa4_0(active0, 0x10000000000L);
      case 117:
         return jjMoveStringLiteralDfa4_0(active0, 0x800000L);
      case 118:
         return jjMoveStringLiteralDfa4_0(active0, 0x8000000000L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0, 0L);
}
private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0, 0L);
      return 4;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa5_0(active0, 0x8000000000L);
      case 101:
         if ((active0 & 0x1000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 36, 1);
         return jjMoveStringLiteralDfa5_0(active0, 0x10400000000L);
      case 105:
         return jjMoveStringLiteralDfa5_0(active0, 0x4000000000L);
      case 107:
         if ((active0 & 0x1000L) != 0L)
            return jjStartNfaWithStates_0(4, 12, 1);
         break;
      case 108:
         if ((active0 & 0x2000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 37, 1);
         break;
      case 110:
         return jjMoveStringLiteralDfa5_0(active0, 0x1010000L);
      case 114:
         if ((active0 & 0x2000000L) != 0L)
            return jjStartNfaWithStates_0(4, 25, 1);
         return jjMoveStringLiteralDfa5_0(active0, 0x800000L);
      case 115:
         if ((active0 & 0x2000L) != 0L)
            return jjStartNfaWithStates_0(4, 13, 1);
         break;
      case 116:
         if ((active0 & 0x200000L) != 0L)
            return jjStartNfaWithStates_0(4, 21, 1);
         else if ((active0 & 0x80000000L) != 0L)
            return jjStartNfaWithStates_0(4, 31, 1);
         else if ((active0 & 0x200000000L) != 0L)
            return jjStartNfaWithStates_0(4, 33, 1);
         return jjMoveStringLiteralDfa5_0(active0, 0x4000L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0, 0L);
}
private int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0, 0L);
      return 5;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa6_0(active0, 0x400000000L);
      case 99:
         if ((active0 & 0x4000000000L) != 0L)
            return jjStartNfaWithStates_0(5, 38, 1);
         return jjMoveStringLiteralDfa6_0(active0, 0x10000000000L);
      case 100:
         return jjMoveStringLiteralDfa6_0(active0, 0x10000L);
      case 103:
         if ((active0 & 0x1000000L) != 0L)
            return jjStartNfaWithStates_0(5, 24, 1);
         break;
      case 110:
         if ((active0 & 0x800000L) != 0L)
            return jjStartNfaWithStates_0(5, 23, 1);
         break;
      case 114:
         return jjMoveStringLiteralDfa6_0(active0, 0x4000L);
      case 116:
         return jjMoveStringLiteralDfa6_0(active0, 0x8000000000L);
      default :
         break;
   }
   return jjStartNfa_0(4, active0, 0L);
}
private int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0, 0L);
      return 6;
   }
   switch(curChar)
   {
      case 101:
         if ((active0 & 0x8000000000L) != 0L)
            return jjStartNfaWithStates_0(6, 39, 1);
         break;
      case 110:
         if ((active0 & 0x400000000L) != 0L)
            return jjStartNfaWithStates_0(6, 34, 1);
         break;
      case 115:
         if ((active0 & 0x10000L) != 0L)
            return jjStartNfaWithStates_0(6, 16, 1);
         break;
      case 116:
         return jjMoveStringLiteralDfa7_0(active0, 0x10000000000L);
      case 117:
         return jjMoveStringLiteralDfa7_0(active0, 0x4000L);
      default :
         break;
   }
   return jjStartNfa_0(5, active0, 0L);
}
private int jjMoveStringLiteralDfa7_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0, 0L);
      return 7;
   }
   switch(curChar)
   {
      case 99:
         return jjMoveStringLiteralDfa8_0(active0, 0x4000L);
      case 101:
         return jjMoveStringLiteralDfa8_0(active0, 0x10000000000L);
      default :
         break;
   }
   return jjStartNfa_0(6, active0, 0L);
}
private int jjMoveStringLiteralDfa8_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(6, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(7, active0, 0L);
      return 8;
   }
   switch(curChar)
   {
      case 100:
         if ((active0 & 0x10000000000L) != 0L)
            return jjStartNfaWithStates_0(8, 40, 1);
         break;
      case 116:
         return jjMoveStringLiteralDfa9_0(active0, 0x4000L);
      default :
         break;
   }
   return jjStartNfa_0(7, active0, 0L);
}
private int jjMoveStringLiteralDfa9_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(7, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(8, active0, 0L);
      return 9;
   }
   switch(curChar)
   {
      case 111:
         return jjMoveStringLiteralDfa10_0(active0, 0x4000L);
      default :
         break;
   }
   return jjStartNfa_0(8, active0, 0L);
}
private int jjMoveStringLiteralDfa10_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(8, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(9, active0, 0L);
      return 10;
   }
   switch(curChar)
   {
      case 114:
         if ((active0 & 0x4000L) != 0L)
            return jjStartNfaWithStates_0(10, 14, 1);
         break;
      default :
         break;
   }
   return jjStartNfa_0(9, active0, 0L);
}
private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 42;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x840000d8ffffc9ffL & l) != 0L)
                  {
                     if (kind > 70)
                        kind = 70;
                     jjCheckNAdd(2);
                  }
                  else if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 41)
                        kind = 41;
                     jjCheckNAddStates(0, 10);
                  }
                  else if (curChar == 34)
                     jjCheckNAddStates(11, 14);
                  if ((0xff000000000000L & l) != 0L)
                     jjCheckNAddStates(15, 20);
                  if ((0x3000000000000L & l) != 0L)
                     jjCheckNAddStates(21, 26);
                  break;
               case 1:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 46)
                     kind = 46;
                  jjstateSet[jjnewStateCnt++] = 1;
                  break;
               case 2:
                  if ((0x840000d8ffffc9ffL & l) == 0L)
                     break;
                  if (kind > 70)
                     kind = 70;
                  jjCheckNAdd(2);
                  break;
               case 3:
                  if ((0xff000000000000L & l) != 0L)
                     jjCheckNAddStates(15, 20);
                  break;
               case 4:
                  if ((0xff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(4, 5);
                  break;
               case 6:
                  if ((0xff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(6, 7);
                  break;
               case 8:
                  if (curChar == 46)
                     jjCheckNAddStates(27, 29);
                  break;
               case 9:
                  if ((0xff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(9, 10);
                  break;
               case 11:
                  if ((0x3000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(11, 12);
                  break;
               case 13:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 44)
                     kind = 44;
                  jjCheckNAddStates(30, 32);
                  break;
               case 14:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 44)
                     kind = 44;
                  jjCheckNAdd(14);
                  break;
               case 15:
                  if ((0xff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(15, 16);
                  break;
               case 17:
                  if ((0xff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(17, 18);
                  break;
               case 20:
                  if ((0x3000000000000L & l) != 0L)
                     jjCheckNAddStates(21, 26);
                  break;
               case 21:
                  if ((0x3000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(21, 22);
                  break;
               case 23:
                  if ((0x3000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(23, 24);
                  break;
               case 25:
                  if ((0x3000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(25, 26);
                  break;
               case 27:
                  if (curChar == 34)
                     jjCheckNAddStates(11, 14);
                  break;
               case 28:
                  if ((0xfffffffbffffdbffL & l) != 0L)
                     jjCheckNAddTwoStates(28, 29);
                  break;
               case 29:
                  if (curChar == 34 && kind > 42)
                     kind = 42;
                  break;
               case 30:
                  if ((0xfffffffbffffdbffL & l) != 0L)
                     jjCheckNAddTwoStates(30, 31);
                  break;
               case 31:
                  if ((0x2400L & l) != 0L)
                     kind = 71;
                  break;
               case 32:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 41)
                     kind = 41;
                  jjCheckNAddStates(0, 10);
                  break;
               case 33:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 41)
                     kind = 41;
                  jjCheckNAdd(33);
                  break;
               case 34:
                  if ((0xff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(34, 35);
                  break;
               case 36:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(36, 8);
                  break;
               case 37:
                  if ((0xff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(37, 38);
                  break;
               case 39:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(39, 19);
                  break;
               case 40:
                  if ((0xff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(40, 41);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 46)
                        kind = 46;
                     jjCheckNAdd(1);
                  }
                  else if ((0xd0000001d0000001L & l) != 0L)
                  {
                     if (kind > 70)
                        kind = 70;
                     jjCheckNAdd(2);
                  }
                  break;
               case 1:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 46)
                     kind = 46;
                  jjCheckNAdd(1);
                  break;
               case 2:
                  if ((0xd0000001d0000001L & l) == 0L)
                     break;
                  if (kind > 70)
                     kind = 70;
                  jjCheckNAdd(2);
                  break;
               case 5:
                  if ((0x800000008000L & l) != 0L && kind > 41)
                     kind = 41;
                  break;
               case 7:
                  if ((0x800000008000L & l) != 0L)
                     jjCheckNAdd(8);
                  break;
               case 10:
                  if ((0x800000008000L & l) != 0L && kind > 44)
                     kind = 44;
                  break;
               case 12:
                  if ((0x400000004L & l) != 0L && kind > 44)
                     kind = 44;
                  break;
               case 15:
                  if ((0x7e0000007eL & l) != 0L)
                     jjAddStates(33, 34);
                  break;
               case 16:
                  if ((0x10000000100L & l) != 0L && kind > 44)
                     kind = 44;
                  break;
               case 18:
                  if ((0x800000008000L & l) != 0L)
                     jjCheckNAdd(19);
                  break;
               case 19:
                  if (curChar == 76 && kind > 45)
                     kind = 45;
                  break;
               case 22:
                  if ((0x400000004L & l) != 0L && kind > 41)
                     kind = 41;
                  break;
               case 24:
                  if ((0x400000004L & l) != 0L)
                     jjCheckNAdd(8);
                  break;
               case 26:
                  if ((0x400000004L & l) != 0L)
                     jjCheckNAdd(19);
                  break;
               case 28:
                  jjAddStates(35, 36);
                  break;
               case 30:
                  jjAddStates(37, 38);
                  break;
               case 34:
                  if ((0x7e0000007eL & l) != 0L)
                     jjAddStates(39, 40);
                  break;
               case 35:
                  if ((0x10000000100L & l) != 0L && kind > 41)
                     kind = 41;
                  break;
               case 37:
                  if ((0x7e0000007eL & l) != 0L)
                     jjAddStates(41, 42);
                  break;
               case 38:
                  if ((0x10000000100L & l) != 0L)
                     jjCheckNAdd(8);
                  break;
               case 40:
                  if ((0x7e0000007eL & l) != 0L)
                     jjAddStates(43, 44);
                  break;
               case 41:
                  if ((0x10000000100L & l) != 0L)
                     jjCheckNAdd(19);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
               case 2:
                  if ((jjbitVec0[i2] & l2) == 0L)
                     break;
                  if (kind > 70)
                     kind = 70;
                  jjCheckNAdd(2);
                  break;
               case 28:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjAddStates(35, 36);
                  break;
               case 30:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjAddStates(37, 38);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 42 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
private int jjMoveStringLiteralDfa0_2()
{
   return jjMoveNfa_2(0, 0);
}
private int jjMoveNfa_2(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 1;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x2400L & l) != 0L)
                     kind = 10;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 1 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
private int jjMoveStringLiteralDfa0_1()
{
   switch(curChar)
   {
      case 42:
         return jjMoveStringLiteralDfa1_1(0x100L);
      default :
         return 1;
   }
}
private int jjMoveStringLiteralDfa1_1(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 1;
   }
   switch(curChar)
   {
      case 47:
         if ((active0 & 0x100L) != 0L)
            return jjStopAtPos(1, 8);
         break;
      default :
         return 2;
   }
   return 2;
}
static final int[] jjnextStates = {
   33, 34, 35, 36, 37, 38, 8, 39, 40, 41, 19, 28, 29, 30, 31, 4, 
   5, 6, 7, 17, 18, 21, 22, 23, 24, 25, 26, 9, 11, 13, 14, 15, 
   16, 15, 16, 28, 29, 30, 31, 34, 35, 37, 38, 40, 41, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, null, null, null, null, null, 
"\142\162\145\141\153", "\143\154\141\163\163", "\143\157\156\163\164\162\165\143\164\157\162", 
"\145\154\163\145", "\145\170\164\145\156\144\163", "\146\157\162", "\151\146", "\151\156\164", 
"\156\145\167", "\160\162\151\156\164", "\162\145\141\144", "\162\145\164\165\162\156", 
"\163\164\162\151\156\147", "\163\165\160\145\162", "\46\46", "\174\174", "\136", "\41", 
"\142\171\164\145", "\163\150\157\162\164", "\154\157\156\147", "\146\154\157\141\164", 
"\142\157\157\154\145\141\156", "\164\162\165\145", "\146\141\154\163\145", "\146\151\156\141\154", 
"\160\165\142\154\151\143", "\160\162\151\166\141\164\145", "\160\162\157\164\145\143\164\145\144", null, 
null, "\156\165\154\154", null, null, null, null, null, "\50", "\51", "\173", 
"\175", "\133", "\135", "\73", "\54", "\56", "\75", "\76", "\74", "\75\75", "\74\75", 
"\76\75", "\41\75", "\53", "\55", "\52", "\57", "\45", null, null, };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
   "multilinecomment",
   "singlelinecomment",
};

/** Lex State array. */
public static final int[] jjnewLexState = {
   -1, -1, -1, -1, -1, -1, 1, 2, 0, -1, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
};
static final long[] jjtoToken = {
   0xfffe7ffffffff001L, 0x3fL, 
};
static final long[] jjtoSkip = {
   0xffeL, 0xc0L, 
};
static final long[] jjtoSpecial = {
   0x0L, 0xc0L, 
};
protected SimpleCharStream input_stream;
private final int[] jjrounds = new int[42];
private final int[] jjstateSet = new int[84];
private final StringBuilder jjimage = new StringBuilder();
private StringBuilder image = jjimage;
private int jjimageLen;
private int lengthOfMatch;
protected char curChar;
/** Constructor. */
public langXTokenManager(SimpleCharStream stream){
   if (SimpleCharStream.staticFlag)
      throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");
   input_stream = stream;
}

/** Constructor. */
public langXTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 42; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
public void SwitchTo(int lexState)
{
   if (lexState >= 3 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

/** Get the next Token. */
public Token getNextToken() 
{
  Token specialToken = null;
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      matchedToken.specialToken = specialToken;
      return matchedToken;
   }
   image = jjimage;
   image.setLength(0);
   jjimageLen = 0;

   switch(curLexState)
   {
     case 0:
       try { input_stream.backup(0);
          while (curChar <= 32 && (0x100003600L & (1L << curChar)) != 0L)
             curChar = input_stream.BeginToken();
       }
       catch (java.io.IOException e1) { continue EOFLoop; }
       jjmatchedKind = 0x7fffffff;
       jjmatchedPos = 0;
       curPos = jjMoveStringLiteralDfa0_0();
       break;
     case 1:
       jjmatchedKind = 0x7fffffff;
       jjmatchedPos = 0;
       curPos = jjMoveStringLiteralDfa0_1();
       if (jjmatchedPos == 0 && jjmatchedKind > 9)
       {
          jjmatchedKind = 9;
       }
       break;
     case 2:
       jjmatchedKind = 0x7fffffff;
       jjmatchedPos = 0;
       curPos = jjMoveStringLiteralDfa0_2();
       if (jjmatchedPos == 0 && jjmatchedKind > 11)
       {
          jjmatchedKind = 11;
       }
       break;
   }
     if (jjmatchedKind != 0x7fffffff)
     {
        if (jjmatchedPos + 1 < curPos)
           input_stream.backup(curPos - jjmatchedPos - 1);
        if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
        {
           matchedToken = jjFillToken();
           matchedToken.specialToken = specialToken;
       if (jjnewLexState[jjmatchedKind] != -1)
         curLexState = jjnewLexState[jjmatchedKind];
           return matchedToken;
        }
        else
        {
           if ((jjtoSpecial[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
           {
              matchedToken = jjFillToken();
              if (specialToken == null)
                 specialToken = matchedToken;
              else
              {
                 matchedToken.specialToken = specialToken;
                 specialToken = (specialToken.next = matchedToken);
              }
              SkipLexicalActions(matchedToken);
           }
           else
              SkipLexicalActions(null);
         if (jjnewLexState[jjmatchedKind] != -1)
           curLexState = jjnewLexState[jjmatchedKind];
           continue EOFLoop;
        }
     }
     int error_line = input_stream.getEndLine();
     int error_column = input_stream.getEndColumn();
     String error_after = null;
     boolean EOFSeen = false;
     try { input_stream.readChar(); input_stream.backup(1); }
     catch (java.io.IOException e1) {
        EOFSeen = true;
        error_after = curPos <= 1 ? "" : input_stream.GetImage();
        if (curChar == '\n' || curChar == '\r') {
           error_line++;
           error_column = 0;
        }
        else
           error_column++;
     }
     if (!EOFSeen) {
        input_stream.backup(1);
        error_after = curPos <= 1 ? "" : input_stream.GetImage();
     }
     throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

void SkipLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      case 70 :
         image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
    System.err.println("Line " + input_stream.getEndLine() +
                           " - Invalid string found: " + image);
    countLexError++;
         break;
      case 71 :
         image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
    System.err.println("Line " + input_stream.getEndLine() +
                           " - String constant has a \u005c\u005cn: " + image);
    countLexError++;
         break;
      default :
         break;
   }
}
private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

}
