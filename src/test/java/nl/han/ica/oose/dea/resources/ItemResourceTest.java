package nl.han.ica.oose.dea.resources;

import nl.han.ica.oose.dea.services.ItemService;
import nl.han.ica.oose.dea.services.dto.ItemDTO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;

class ItemResourceTest {

    private ItemService mockedItemService;
    private ItemResource sut;

    @BeforeEach
    void setup() {
        this.sut = new ItemResource();

        // Gebruik Mockito om een instantie te maken
        this.mockedItemService = Mockito.mock(ItemService.class);

        // Gebruik de setter om de mockedItemService te zetten
        this.sut.setItemService(mockedItemService);
    }
    @Test
    void getTextItems() {
        //Arrange
        var ItemResource = new ItemResource();
        //Act
        var result = ItemResource.getTextItems();
        //Assert
        Assertions.assertEquals(result,"bread, butter");
    }

    //getJsonItem
    @Test
    void getJsonItemsCallsGetAll() {
        //Arrange

        //Act
        sut.getJsonItems();
        //Assert
        Mockito.verify(mockedItemService).getAll();

    }

    @Test
    void getJsonReturnsObjectFromServiceAsEntity() {
        //Arrange
        var itemsToReturn = new ArrayList<ItemDTO>();
        Mockito.when(mockedItemService.getAll()).thenReturn(itemsToReturn);
        //Act
        sut.getJsonItems();
        //Assert
        //TODO ? idk wat je met response moet doen
    }








    @Test
    void addItem() {
        //Arrange
        //Act
        //Assert
    }

    @Test
    void getItem() {
        //Arrange
        //Act
        //Assert
    }

    @Test
    void deleteItem() {
        //Arrange
        //Act
        //Assert
    }

}