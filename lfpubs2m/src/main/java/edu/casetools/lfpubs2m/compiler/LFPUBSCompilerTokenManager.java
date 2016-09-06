/* Generated By:JavaCC: Do not edit this line. LFPUBSCompilerTokenManager.java */
package edu.casetools.lfpubs2m.compiler;
import java.io.FileReader;
import java.util.Vector;
import edu.casetools.lfpubs2m.lfpubsdata.LFPUBSPattern;
import edu.casetools.lfpubs2m.lfpubsdata.condition.IfContext;
import edu.casetools.lfpubs2m.lfpubsdata.condition.time.TimeOfDay;
import edu.casetools.lfpubs2m.lfpubsdata.action.ThenDo;
import edu.casetools.lfpubs2m.lfpubsdata.events.Occurs;
import edu.casetools.lfpubs2m.lfpubsdata.events.Sensor;

/** Token Manager. */
public class LFPUBSCompilerTokenManager implements LFPUBSCompilerConstants
{

  /** Debug output. */
  public  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x6fb0000000000L) != 0L)
         {
            jjmatchedKind = 26;
            return -1;
         }
         if ((active0 & 0xff900fc00000100L) != 0L)
         {
            jjmatchedKind = 25;
            return -1;
         }
         return -1;
      case 1:
         if ((active0 & 0x6fb0000000000L) != 0L)
         {
            if (jjmatchedPos == 0)
            {
               jjmatchedKind = 26;
               jjmatchedPos = 0;
            }
            return -1;
         }
         if ((active0 & 0xff900fc00000100L) != 0L)
         {
            if (jjmatchedPos == 0)
            {
               jjmatchedKind = 25;
               jjmatchedPos = 0;
            }
            return -1;
         }
         return -1;
      case 2:
         if ((active0 & 0x4fb0000000000L) != 0L)
         {
            if (jjmatchedPos == 0)
            {
               jjmatchedKind = 26;
               jjmatchedPos = 0;
            }
            return -1;
         }
         if ((active0 & 0xff800bc00000100L) != 0L)
         {
            if (jjmatchedPos == 0)
            {
               jjmatchedKind = 25;
               jjmatchedPos = 0;
            }
            return -1;
         }
         return -1;
      case 3:
         if ((active0 & 0xfb0000000000L) != 0L)
         {
            if (jjmatchedPos == 0)
            {
               jjmatchedKind = 26;
               jjmatchedPos = 0;
            }
            return -1;
         }
         if ((active0 & 0xff8001c00000100L) != 0L)
         {
            if (jjmatchedPos == 0)
            {
               jjmatchedKind = 25;
               jjmatchedPos = 0;
            }
            return -1;
         }
         return -1;
      case 4:
         if ((active0 & 0x7b0000000000L) != 0L)
         {
            if (jjmatchedPos == 0)
            {
               jjmatchedKind = 26;
               jjmatchedPos = 0;
            }
            return -1;
         }
         if ((active0 & 0xff0001c00000000L) != 0L)
         {
            if (jjmatchedPos == 0)
            {
               jjmatchedKind = 25;
               jjmatchedPos = 0;
            }
            return -1;
         }
         return -1;
      case 5:
         if ((active0 & 0x7b0000000000L) != 0L)
         {
            if (jjmatchedPos == 0)
            {
               jjmatchedKind = 26;
               jjmatchedPos = 0;
            }
            return -1;
         }
         if ((active0 & 0x7f0001800000000L) != 0L)
         {
            if (jjmatchedPos == 0)
            {
               jjmatchedKind = 25;
               jjmatchedPos = 0;
            }
            return -1;
         }
         return -1;
      case 6:
         if ((active0 & 0x7b0000000000L) != 0L)
         {
            if (jjmatchedPos == 0)
            {
               jjmatchedKind = 26;
               jjmatchedPos = 0;
            }
            return -1;
         }
         if ((active0 & 0x2e0001000000000L) != 0L)
         {
            if (jjmatchedPos == 0)
            {
               jjmatchedKind = 25;
               jjmatchedPos = 0;
            }
            return -1;
         }
         return -1;
      case 7:
         if ((active0 & 0x7b0000000000L) != 0L)
         {
            if (jjmatchedPos == 0)
            {
               jjmatchedKind = 26;
               jjmatchedPos = 0;
            }
            return -1;
         }
         if ((active0 & 0x2c0001000000000L) != 0L)
         {
            if (jjmatchedPos == 0)
            {
               jjmatchedKind = 25;
               jjmatchedPos = 0;
            }
            return -1;
         }
         return -1;
      case 8:
         if ((active0 & 0x7b0000000000L) != 0L)
         {
            if (jjmatchedPos == 0)
            {
               jjmatchedKind = 26;
               jjmatchedPos = 0;
            }
            return -1;
         }
         if ((active0 & 0x40001000000000L) != 0L)
         {
            if (jjmatchedPos == 0)
            {
               jjmatchedKind = 25;
               jjmatchedPos = 0;
            }
            return -1;
         }
         return -1;
      case 9:
         if ((active0 & 0x530000000000L) != 0L)
         {
            if (jjmatchedPos == 0)
            {
               jjmatchedKind = 26;
               jjmatchedPos = 0;
            }
            return -1;
         }
         return -1;
      case 10:
         if ((active0 & 0x20000000000L) != 0L)
         {
            if (jjmatchedPos == 0)
            {
               jjmatchedKind = 26;
               jjmatchedPos = 0;
            }
            return -1;
         }
         return -1;
      case 11:
         if ((active0 & 0x20000000000L) != 0L)
         {
            if (jjmatchedPos == 0)
            {
               jjmatchedKind = 26;
               jjmatchedPos = 0;
            }
            return -1;
         }
         return -1;
      case 12:
         if ((active0 & 0x20000000000L) != 0L)
         {
            if (jjmatchedPos == 0)
            {
               jjmatchedKind = 26;
               jjmatchedPos = 0;
            }
            return -1;
         }
         return -1;
      case 13:
         if ((active0 & 0x20000000000L) != 0L)
         {
            if (jjmatchedPos == 0)
            {
               jjmatchedKind = 26;
               jjmatchedPos = 0;
            }
            return -1;
         }
         return -1;
      case 14:
         if ((active0 & 0x20000000000L) != 0L)
         {
            if (jjmatchedPos == 0)
            {
               jjmatchedKind = 26;
               jjmatchedPos = 0;
            }
            return -1;
         }
         return -1;
      case 15:
         if ((active0 & 0x20000000000L) != 0L)
         {
            if (jjmatchedPos == 0)
            {
               jjmatchedKind = 26;
               jjmatchedPos = 0;
            }
            return -1;
         }
         return -1;
      case 16:
         if ((active0 & 0x20000000000L) != 0L)
         {
            if (jjmatchedPos == 0)
            {
               jjmatchedKind = 26;
               jjmatchedPos = 0;
            }
            return -1;
         }
         return -1;
      default :
         return -1;
   }
}
private final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
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
      case 35:
         return jjStopAtPos(0, 9);
      case 38:
         return jjStopAtPos(0, 22);
      case 40:
         jjmatchedKind = 10;
         return jjMoveStringLiteralDfa1_0(0x40000000000L);
      case 41:
         return jjStopAtPos(0, 11);
      case 43:
         return jjStopAtPos(0, 33);
      case 44:
         return jjStopAtPos(0, 19);
      case 45:
         return jjStopAtPos(0, 21);
      case 46:
         return jjStopAtPos(0, 16);
      case 47:
         jjmatchedKind = 20;
         return jjMoveStringLiteralDfa1_0(0x20L);
      case 58:
         return jjStopAtPos(0, 18);
      case 59:
         return jjStopAtPos(0, 17);
      case 60:
         jjmatchedKind = 29;
         return jjMoveStringLiteralDfa1_0(0x80000000L);
      case 61:
         jjmatchedKind = 28;
         return jjMoveStringLiteralDfa1_0(0x8000000L);
      case 62:
         jjmatchedKind = 30;
         return jjMoveStringLiteralDfa1_0(0x100000000L);
      case 65:
         return jjMoveStringLiteralDfa1_0(0x4010000000000L);
      case 70:
         return jjMoveStringLiteralDfa1_0(0x100000000000L);
      case 71:
         return jjMoveStringLiteralDfa1_0(0x20000000000L);
      case 73:
         return jjMoveStringLiteralDfa1_0(0x400000000000L);
      case 79:
         return jjMoveStringLiteralDfa1_0(0x2080000000000L);
      case 80:
         return jjMoveStringLiteralDfa1_0(0x200000000000L);
      case 84:
         return jjMoveStringLiteralDfa1_0(0x800000000000L);
      case 91:
         return jjStopAtPos(0, 12);
      case 93:
         return jjStopAtPos(0, 13);
      case 97:
         return jjMoveStringLiteralDfa1_0(0x800000000000000L);
      case 100:
         return jjMoveStringLiteralDfa1_0(0x1000000000000L);
      case 101:
         return jjMoveStringLiteralDfa1_0(0x2000000000L);
      case 102:
         return jjMoveStringLiteralDfa1_0(0x100000000000000L);
      case 109:
         return jjMoveStringLiteralDfa1_0(0x10000000000000L);
      case 111:
         return jjMoveStringLiteralDfa1_0(0xc000000000L);
      case 115:
         return jjMoveStringLiteralDfa1_0(0x600000c00000000L);
      case 116:
         return jjMoveStringLiteralDfa1_0(0xa8000000000000L);
      case 117:
         return jjMoveStringLiteralDfa1_0(0x1000000000L);
      case 119:
         return jjMoveStringLiteralDfa1_0(0x40000000000100L);
      case 123:
         return jjStopAtPos(0, 14);
      case 125:
         return jjStopAtPos(0, 15);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 42:
         if ((active0 & 0x20L) != 0L)
            return jjStopAtPos(1, 5);
         break;
      case 61:
         if ((active0 & 0x80000000L) != 0L)
            return jjStopAtPos(1, 31);
         else if ((active0 & 0x100000000L) != 0L)
            return jjStopAtPos(1, 32);
         break;
      case 62:
         if ((active0 & 0x8000000L) != 0L)
            return jjStopAtPos(1, 27);
         break;
      case 65:
         return jjMoveStringLiteralDfa2_0(active0, 0x40000000000L);
      case 70:
         return jjMoveStringLiteralDfa2_0(active0, 0x400000000000L);
      case 72:
         return jjMoveStringLiteralDfa2_0(active0, 0x800000000000L);
      case 78:
         return jjMoveStringLiteralDfa2_0(active0, 0x4080000000000L);
      case 82:
         if ((active0 & 0x2000000000000L) != 0L)
            return jjStopAtPos(1, 49);
         break;
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x200000000000000L);
      case 99:
         return jjMoveStringLiteralDfa2_0(active0, 0x10000000000L);
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x40020000000000L);
      case 102:
         return jjMoveStringLiteralDfa2_0(active0, 0x800008000000000L);
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0x80000000000100L);
      case 105:
         return jjMoveStringLiteralDfa2_0(active0, 0x8000800000000L);
      case 110:
         if ((active0 & 0x4000000000L) != 0L)
            return jjStopAtPos(1, 38);
         return jjMoveStringLiteralDfa2_0(active0, 0x3000000000L);
      case 111:
         if ((active0 & 0x1000000000000L) != 0L)
            return jjStopAtPos(1, 48);
         return jjMoveStringLiteralDfa2_0(active0, 0x10000000000000L);
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0x100300000000000L);
      case 116:
         return jjMoveStringLiteralDfa2_0(active0, 0x400000000L);
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0x420000000000000L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
private int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 32:
         return jjMoveStringLiteralDfa3_0(active0, 0x480000000000L);
      case 68:
         if ((active0 & 0x4000000000000L) != 0L)
            return jjStopAtPos(2, 50);
         break;
      case 69:
         return jjMoveStringLiteralDfa3_0(active0, 0x800000000000L);
      case 97:
         return jjMoveStringLiteralDfa3_0(active0, 0x400000000L);
      case 99:
         return jjMoveStringLiteralDfa3_0(active0, 0x40000000000L);
      case 100:
         if ((active0 & 0x2000000000L) != 0L)
            return jjStopAtPos(2, 37);
         return jjMoveStringLiteralDfa3_0(active0, 0x40000000000000L);
      case 101:
         return jjMoveStringLiteralDfa3_0(active0, 0x20100000000100L);
      case 102:
         if ((active0 & 0x8000000000L) != 0L)
            return jjStopAtPos(2, 39);
         break;
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x100200000000000L);
      case 109:
         return jjMoveStringLiteralDfa3_0(active0, 0x8000800000000L);
      case 110:
         return jjMoveStringLiteralDfa3_0(active0, 0x410020000000000L);
      case 111:
         return jjMoveStringLiteralDfa3_0(active0, 0x1000000000L);
      case 116:
         return jjMoveStringLiteralDfa3_0(active0, 0xa00010000000000L);
      case 117:
         return jjMoveStringLiteralDfa3_0(active0, 0x80000000000000L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 78:
         if ((active0 & 0x800000000000L) != 0L)
            return jjStopAtPos(3, 47);
         break;
      case 99:
         return jjMoveStringLiteralDfa4_0(active0, 0x400000000000L);
      case 100:
         return jjMoveStringLiteralDfa4_0(active0, 0x510000000000000L);
      case 101:
         if ((active0 & 0x8000000000000L) != 0L)
            return jjStopAtPos(3, 51);
         return jjMoveStringLiteralDfa4_0(active0, 0x800020000000000L);
      case 105:
         return jjMoveStringLiteralDfa4_0(active0, 0x10000000000L);
      case 110:
         if ((active0 & 0x100L) != 0L)
            return jjStopAtPos(3, 8);
         return jjMoveStringLiteralDfa4_0(active0, 0x40000000000000L);
      case 111:
         return jjMoveStringLiteralDfa4_0(active0, 0x280000000000L);
      case 112:
         return jjMoveStringLiteralDfa4_0(active0, 0x800000000L);
      case 113:
         return jjMoveStringLiteralDfa4_0(active0, 0x100000000000L);
      case 114:
         return jjMoveStringLiteralDfa4_0(active0, 0x80001400000000L);
      case 115:
         return jjMoveStringLiteralDfa4_0(active0, 0x20000000000000L);
      case 116:
         return jjMoveStringLiteralDfa4_0(active0, 0x40000000000L);
      case 117:
         return jjMoveStringLiteralDfa4_0(active0, 0x200000000000000L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa5_0(active0, 0x510000000000000L);
      case 99:
         return jjMoveStringLiteralDfa5_0(active0, 0x80000000000L);
      case 100:
         return jjMoveStringLiteralDfa5_0(active0, 0x20001000000000L);
      case 101:
         return jjMoveStringLiteralDfa5_0(active0, 0x40000000000000L);
      case 105:
         return jjMoveStringLiteralDfa5_0(active0, 0x40000000000L);
      case 108:
         return jjMoveStringLiteralDfa5_0(active0, 0x800000000L);
      case 111:
         return jjMoveStringLiteralDfa5_0(active0, 0x410000000000L);
      case 114:
         if ((active0 & 0x800000000000000L) != 0L)
            return jjStopAtPos(4, 59);
         return jjMoveStringLiteralDfa5_0(active0, 0x200220000000000L);
      case 115:
         return jjMoveStringLiteralDfa5_0(active0, 0x80000000000000L);
      case 116:
         if ((active0 & 0x400000000L) != 0L)
            return jjStopAtPos(4, 34);
         break;
      case 117:
         return jjMoveStringLiteralDfa5_0(active0, 0x100000000000L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
private int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa6_0(active0, 0x20020000000000L);
      case 99:
         return jjMoveStringLiteralDfa6_0(active0, 0x80000000000L);
      case 100:
         return jjMoveStringLiteralDfa6_0(active0, 0x280000000000000L);
      case 101:
         if ((active0 & 0x800000000L) != 0L)
            return jjStopAtPos(5, 35);
         return jjMoveStringLiteralDfa6_0(active0, 0x101000000000L);
      case 105:
         return jjMoveStringLiteralDfa6_0(active0, 0x200000000000L);
      case 110:
         return jjMoveStringLiteralDfa6_0(active0, 0x410000000000L);
      case 111:
         return jjMoveStringLiteralDfa6_0(active0, 0x40000000000L);
      case 115:
         return jjMoveStringLiteralDfa6_0(active0, 0x40000000000000L);
      case 121:
         if ((active0 & 0x10000000000000L) != 0L)
            return jjStopAtPos(5, 52);
         else if ((active0 & 0x100000000000000L) != 0L)
            return jjStopAtPos(5, 56);
         else if ((active0 & 0x400000000000000L) != 0L)
            return jjStopAtPos(5, 58);
         break;
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
private int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 32:
         return jjMoveStringLiteralDfa7_0(active0, 0x10000000000L);
      case 97:
         return jjMoveStringLiteralDfa7_0(active0, 0x280000000000000L);
      case 100:
         return jjMoveStringLiteralDfa7_0(active0, 0x40000000000000L);
      case 108:
         return jjMoveStringLiteralDfa7_0(active0, 0x20000000000L);
      case 110:
         return jjMoveStringLiteralDfa7_0(active0, 0x140000000000L);
      case 114:
         return jjMoveStringLiteralDfa7_0(active0, 0x1000000000L);
      case 116:
         return jjMoveStringLiteralDfa7_0(active0, 0x600000000000L);
      case 117:
         return jjMoveStringLiteralDfa7_0(active0, 0x80000000000L);
      case 121:
         if ((active0 & 0x20000000000000L) != 0L)
            return jjStopAtPos(6, 53);
         break;
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
private int jjMoveStringLiteralDfa7_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0);
      return 7;
   }
   switch(curChar)
   {
      case 32:
         return jjMoveStringLiteralDfa8_0(active0, 0x60000000000L);
      case 77:
         return jjMoveStringLiteralDfa8_0(active0, 0x10000000000L);
      case 97:
         return jjMoveStringLiteralDfa8_0(active0, 0x40000000000000L);
      case 99:
         return jjMoveStringLiteralDfa8_0(active0, 0x100000000000L);
      case 101:
         return jjMoveStringLiteralDfa8_0(active0, 0x401000000000L);
      case 114:
         return jjMoveStringLiteralDfa8_0(active0, 0x80000000000L);
      case 121:
         if ((active0 & 0x80000000000000L) != 0L)
            return jjStopAtPos(7, 55);
         else if ((active0 & 0x200000000000000L) != 0L)
            return jjStopAtPos(7, 57);
         return jjMoveStringLiteralDfa8_0(active0, 0x200000000000L);
      default :
         break;
   }
   return jjStartNfa_0(6, active0);
}
private int jjMoveStringLiteralDfa8_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(6, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(7, active0);
      return 8;
   }
   switch(curChar)
   {
      case 58:
         if ((active0 & 0x200000000000L) != 0L)
            return jjStopAtPos(8, 45);
         break;
      case 67:
         return jjMoveStringLiteralDfa9_0(active0, 0x20000000000L);
      case 80:
         return jjMoveStringLiteralDfa9_0(active0, 0x40000000000L);
      case 97:
         return jjMoveStringLiteralDfa9_0(active0, 0x10000000000L);
      case 100:
         if ((active0 & 0x1000000000L) != 0L)
            return jjStopAtPos(8, 36);
         break;
      case 115:
         if ((active0 & 0x80000000000L) != 0L)
            return jjStopAtPos(8, 43);
         break;
      case 120:
         return jjMoveStringLiteralDfa9_0(active0, 0x400000000000L);
      case 121:
         if ((active0 & 0x40000000000000L) != 0L)
            return jjStopAtPos(8, 54);
         return jjMoveStringLiteralDfa9_0(active0, 0x100000000000L);
      default :
         break;
   }
   return jjStartNfa_0(7, active0);
}
private int jjMoveStringLiteralDfa9_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(7, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(8, active0);
      return 9;
   }
   switch(curChar)
   {
      case 58:
         if ((active0 & 0x100000000000L) != 0L)
            return jjStopAtPos(9, 44);
         break;
      case 97:
         return jjMoveStringLiteralDfa10_0(active0, 0x40000000000L);
      case 111:
         return jjMoveStringLiteralDfa10_0(active0, 0x20000000000L);
      case 112:
         if ((active0 & 0x10000000000L) != 0L)
            return jjStopAtPos(9, 40);
         break;
      case 116:
         if ((active0 & 0x400000000000L) != 0L)
            return jjStopAtPos(9, 46);
         break;
      default :
         break;
   }
   return jjStartNfa_0(8, active0);
}
private int jjMoveStringLiteralDfa10_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(8, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(9, active0);
      return 10;
   }
   switch(curChar)
   {
      case 110:
         return jjMoveStringLiteralDfa11_0(active0, 0x20000000000L);
      case 116:
         return jjMoveStringLiteralDfa11_0(active0, 0x40000000000L);
      default :
         break;
   }
   return jjStartNfa_0(9, active0);
}
private int jjMoveStringLiteralDfa11_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(9, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(10, active0);
      return 11;
   }
   switch(curChar)
   {
      case 100:
         return jjMoveStringLiteralDfa12_0(active0, 0x20000000000L);
      case 116:
         return jjMoveStringLiteralDfa12_0(active0, 0x40000000000L);
      default :
         break;
   }
   return jjStartNfa_0(10, active0);
}
private int jjMoveStringLiteralDfa12_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(10, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(11, active0);
      return 12;
   }
   switch(curChar)
   {
      case 101:
         return jjMoveStringLiteralDfa13_0(active0, 0x40000000000L);
      case 105:
         return jjMoveStringLiteralDfa13_0(active0, 0x20000000000L);
      default :
         break;
   }
   return jjStartNfa_0(11, active0);
}
private int jjMoveStringLiteralDfa13_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(11, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(12, active0);
      return 13;
   }
   switch(curChar)
   {
      case 114:
         return jjMoveStringLiteralDfa14_0(active0, 0x40000000000L);
      case 116:
         return jjMoveStringLiteralDfa14_0(active0, 0x20000000000L);
      default :
         break;
   }
   return jjStartNfa_0(12, active0);
}
private int jjMoveStringLiteralDfa14_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(12, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(13, active0);
      return 14;
   }
   switch(curChar)
   {
      case 105:
         return jjMoveStringLiteralDfa15_0(active0, 0x20000000000L);
      case 110:
         if ((active0 & 0x40000000000L) != 0L)
            return jjStopAtPos(14, 42);
         break;
      default :
         break;
   }
   return jjStartNfa_0(13, active0);
}
private int jjMoveStringLiteralDfa15_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(13, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(14, active0);
      return 15;
   }
   switch(curChar)
   {
      case 111:
         return jjMoveStringLiteralDfa16_0(active0, 0x20000000000L);
      default :
         break;
   }
   return jjStartNfa_0(14, active0);
}
private int jjMoveStringLiteralDfa16_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(14, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(15, active0);
      return 16;
   }
   switch(curChar)
   {
      case 110:
         return jjMoveStringLiteralDfa17_0(active0, 0x20000000000L);
      default :
         break;
   }
   return jjStartNfa_0(15, active0);
}
private int jjMoveStringLiteralDfa17_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(15, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(16, active0);
      return 17;
   }
   switch(curChar)
   {
      case 115:
         if ((active0 & 0x20000000000L) != 0L)
            return jjStopAtPos(17, 41);
         break;
      default :
         break;
   }
   return jjStartNfa_0(16, active0);
}
private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 4;
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
                  if ((0x3ff000000000000L & l) != 0L)
                     kind = 24;
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
                  if ((0x7fffffeL & l) != 0L)
                  {
                     if (kind > 26)
                        kind = 26;
                  }
                  else if ((0x7fffffe00000000L & l) != 0L)
                  {
                     if (kind > 25)
                        kind = 25;
                  }
                  else if (curChar == 95)
                  {
                     if (kind > 23)
                        kind = 23;
                  }
                  break;
               case 2:
                  if ((0x7fffffe00000000L & l) != 0L)
                     kind = 25;
                  break;
               case 3:
                  if ((0x7fffffeL & l) != 0L)
                     kind = 26;
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
      if ((i = jjnewStateCnt) == (startsAt = 4 - (jjnewStateCnt = startsAt)))
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
         return jjMoveStringLiteralDfa1_1(0x40L);
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
         if ((active0 & 0x40L) != 0L)
            return jjStopAtPos(1, 6);
         break;
      default :
         return 2;
   }
   return 2;
}
static final int[] jjnextStates = {
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, null, "\167\150\145\156", "\43", 
"\50", "\51", "\133", "\135", "\173", "\175", "\56", "\73", "\72", "\54", "\57", 
"\55", "\46", null, null, null, null, "\75\76", "\75", "\74", "\76", "\74\75", 
"\76\75", "\53", "\163\164\141\162\164", "\163\151\155\160\154\145", 
"\165\156\157\162\144\145\162\145\144", "\145\156\144", "\157\156", "\157\146\146", 
"\101\143\164\151\157\156\40\115\141\160", "\107\145\156\145\162\141\154\40\103\157\156\144\151\164\151\157\156\163", 
"\50\101\143\164\151\157\156\40\120\141\164\164\145\162\156", "\117\116\40\157\143\143\165\162\163", 
"\106\162\145\161\165\145\156\143\171\72", "\120\162\151\157\162\151\164\171\72", 
"\111\106\40\143\157\156\164\145\170\164", "\124\110\105\116", "\144\157", "\117\122", "\101\116\104", 
"\164\151\155\145", "\155\157\156\144\141\171", "\164\165\145\163\144\141\171", 
"\167\145\144\156\145\163\144\141\171", "\164\150\165\162\163\144\141\171", "\146\162\151\144\141\171", 
"\163\141\164\165\162\144\141\171", "\163\165\156\144\141\171", "\141\146\164\145\162", };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
   "INSIDE_COMMENT",
};

/** Lex State array. */
public static final int[] jjnewLexState = {
   -1, -1, -1, -1, -1, 1, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
};
static final long[] jjtoToken = {
   0xfffffffffffff01L, 
};
static final long[] jjtoSkip = {
   0xfeL, 
};
protected SimpleCharStream input_stream;
private final int[] jjrounds = new int[4];
private final int[] jjstateSet = new int[8];
protected char curChar;
/** Constructor. */
public LFPUBSCompilerTokenManager(SimpleCharStream stream){
   if (SimpleCharStream.staticFlag)
      throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");
   input_stream = stream;
}

/** Constructor. */
public LFPUBSCompilerTokenManager(SimpleCharStream stream, int lexState){
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
   for (i = 4; i-- > 0;)
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
   if (lexState >= 2 || lexState < 0)
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
      return matchedToken;
   }

   switch(curLexState)
   {
     case 0:
       try { input_stream.backup(0);
          while (curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L)
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
       if (jjmatchedPos == 0 && jjmatchedKind > 7)
       {
          jjmatchedKind = 7;
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
       if (jjnewLexState[jjmatchedKind] != -1)
         curLexState = jjnewLexState[jjmatchedKind];
           return matchedToken;
        }
        else
        {
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

}