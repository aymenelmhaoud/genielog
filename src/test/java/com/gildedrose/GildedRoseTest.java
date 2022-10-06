package com.gildedrose;







import org.junit.jupiter.api.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


class GildedRoseTest {

  /**
   * 
   */
  @Test
  @DisplayName("Test that the name is unchanged")
  void testName() {
    Item element = new Item("foo", 0, 0);
    GildedRose app = new GildedRose(new Item[] {element});
    app.updateQuality();
    assertThat(element.name, is("foo"));
    assertThat(element.name, is(not(("Backstage passes to a TAFKAL80ETC concert"))));
    assertThat(element.name, is(not(("Aged Brie"))));

  }

  /**
   * 
   */
  @Test
  @DisplayName("Test that the quality will decrement")
  void testdecrementation() {
    Item[] items = new Item[] {new Item("boo", 2, 0),
    new Item("foo", 2, 6)};
    GildedRose app = new GildedRose(items);
    app.updateQuality();
  
    assertThat(app.items[0].quality, is(0));
    assertThat(app.items[1].quality, is(5));
  

    
    
   
   


}
/**
 * 
 */
@Test
@DisplayName("Test that Aged Brie quality increases as time goes by")
void aged_brie_quality_increases_in_time() {
  Item[] items = new Item[] {new Item("Aged Brie", 2, 0),
   new Item("Aged Brie", 2, 50),
   new Item("Backstage passes to a TAFKAL80ETC concert", 4, 44),
   new Item("Sulfuras, Hand of Ragnaros", 0, 50),
   new Item("Backstage passes to a TAFKAL80ETC concert", 6, 44)};
    GildedRose app = new GildedRose(items);
    app.updateQuality();
  
    assertThat(app.items[0].quality, is(1));
    assertThat(app.items[1].quality, is(50));
    assertThat(app.items[2].quality, is(47));
    assertThat(app.items[3].quality, is(50));
    assertThat(app.items[4].quality, is(46));
}
@Test
@DisplayName("Test that if quality less than 50 the quality increase")
void quality_increase() {
  Item[] items = new Item[] {new Item("Aged Brie", 2, 0),
   new Item("Aged Brie", 2, 40),
   new Item("Backstage passes to a TAFKAL80ETC concert", 8, 49),
   new Item("Sulfuras, Hand of Ragnaros", 0, 40),
   new Item("Backstage passes to a TAFKAL80ETC concert", 11, 17),
   new Item("Backstage passes to a TAFKAL80ETC concert", 4, 48)
  };
    GildedRose app = new GildedRose(items);
    app.updateQuality();
  
    assertThat(app.items[0].quality, is(1));
    assertThat(app.items[1].quality, is(41));
    assertThat(app.items[2].quality, is(50));
    assertThat(app.items[3].quality, is(40));
    assertThat(app.items[4].quality, is(18));
    assertThat(app.items[5].quality, is(50));
}
   
@Test
  @DisplayName("Test that the quality will decrement")
  void testdecrementation2() {
    Item[] items = new Item[] {new Item("Aged Brie", 0, 2),
    new Item("Aged Brie", 0, 40),
    new Item("Backstage passes to a TAFKAL80ETC concert", 0, 49),
    new Item("Sulfuras, Hand of Ragnaros", 0, 40),
    new Item("Backstage passes to a TAFKAL80ETC concert", 0, 17),
     new Item("boo", 0, 80),
     new Item("Aged Brie", 1, 40),
     new Item("boo", -1, 0),
     new Item("Sulfuras, Hand of Ragnaros", -1, 80), 
     new Item("Sulfuras, Hand of Ragnaros", -1, 49),
     new Item("Aged Brie", -1, 49)};
     GildedRose app = new GildedRose(items);
    app.updateQuality();
    assertThat(app.items[0].quality, is(4));
    assertThat(app.items[1].quality, is(42));
    assertThat(app.items[2].quality, is(0));
    assertThat(app.items[3].quality, is(40));
    assertThat(app.items[4].quality, is(0));
    assertThat(app.items[5].quality, is(78));
    assertThat(app.items[5].sellIn, is(-1));
    assertThat(app.items[6].quality, is(41));
    assertThat(app.items[7].quality, is(0));
    assertThat(app.items[8].quality, is(80));
    
    assertThat(app.items[9].quality, is(49));
    assertThat(app.items[10].quality, is(50));
}
@Test
  @DisplayName("Test tostring")
  void testtostring() 
  {
    
    
    Item element =  new Item ("Aged Brie",0,40  );
 
  
    assertThat(element.toString(), is("Aged Brie, 0, 40"));
   
   
    
  

  }
 
  


}
 





