package edu.cnm.deepdive;

import static edu.cnm.deepdive.CodingBatModThree.modThree;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CodingBatModThreeTest {

  private int[][] modParams = {
      {2, 1, 3, 5},
      {2, 1, 2, 5},
      {2, 4, 2, 5},
      {1, 2, 1, 2, 1},
      {9, 9, 9},
      {1, 2, 1},
      {1, 2},
      {1},
      {},
      {9, 7, 2, 9},
      {9, 7, 2, 9, 2, 2},
      {9, 7, 2, 9, 2, 2, 6}
  };

  private boolean[] modExpected = {true, false, true, false, true, false, false, false, false, false,
  false, true};

  @Test
  void modTest() {
    for (int i = 0; i < modParams.length; i++) {
      boolean actual = modThree(modParams[i]);
      Assertions.assertEquals(actual, modExpected[i]);
    }
  }

}