package me.danielmoulton;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Test class for Card.
 *
 * @author Daniel Moulton
 * @author James Pilcher
 */
public class CardTest {
  private static Card card;

  @Before
  public void setUp() {
    card = new Card(5);
  }

  @Test
  public void testCardValue() {
    assertEquals("Card values incorrect", 5, card.getCardValue());
  }

  @After
  public void tearDown() {
    card = null;
  }
}
