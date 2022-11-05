package com.gildedrose;
//realisé par Aymen EL MHAOUD et Soufiane CHAIEB
class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            item.updateQuality();

         }
         
      }
   }