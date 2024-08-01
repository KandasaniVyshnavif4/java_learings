import pygame
import level_level3


pygame.init()
pygame.mixer.init()
screen_width = 1110
screen_height = 800
gameWindow = pygame.display.set_mode((screen_width,screen_height))

pygame.display.set_caption("Cultivate Equality")
pygame.display.update()

background_music = pygame.mixer.Sound("gamesound.wav")
background_music.play(-1)
background_image = pygame.image.load("background.jpeg")
background_surface = pygame.Surface(gameWindow.get_size())
background_surface.blit(background_image, (0,0))

quit_image = pygame.image.load("quit.jpeg")

quit_rect = pygame.Rect(480, 550, quit_image.get_width(), quit_image.get_height())

button_image1 = pygame.image.load("1.jpeg")
button_image2 = pygame.image.load("2.jpeg")
button_image3 = pygame.image.load("3.jpeg")
button_image4 = pygame.image.load("4.jpeg")
button_image5 = pygame.image.load("5.jpeg")
button_image6 = pygame.image.load("6.jpeg")
button_image7 = pygame.image.load("7.jpeg")
button_image8 = pygame.image.load("8.jpeg")
button_image9 = pygame.image.load("9.jpeg")
button_image10 = pygame.image.load("10.jpeg")


button_rect1 = pygame.Rect(100, 150, button_image1.get_width(), button_image1.get_height())
button_rect2 = pygame.Rect(300, 150, button_image2.get_width(), button_image2.get_height())
button_rect3 = pygame.Rect(500, 150, button_image3.get_width(), button_image3.get_height())
button_rect4 = pygame.Rect(700, 150, button_image4.get_width(), button_image4.get_height())
button_rect5 = pygame.Rect(900, 150, button_image5.get_width(), button_image5.get_height())
button_rect6 = pygame.Rect(100, 350, button_image6.get_width(), button_image6.get_height())
button_rect7 = pygame.Rect(100, 350, button_image7.get_width(), button_image7.get_height())
button_rect8 = pygame.Rect(300, 350, button_image8.get_width(), button_image8.get_height())
button_rect9 = pygame.Rect(500, 350, button_image9.get_width(), button_image9.get_height())
button_rect10 = pygame.Rect(900, 350, button_image10.get_width(), button_image10.get_height())

button_click_sound = pygame.mixer.Sound("levelsound.wav")

exit_game = False
game_over = False

while not exit_game:
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            exit_game = True
        if event.type == pygame.MOUSEBUTTONDOWN and quit_rect.collidepoint(event.pos):
            exit_game = True
        if event.type == pygame.MOUSEBUTTONDOWN and button_rect3.collidepoint(event.pos):
            button_click_sound.play()
            print("Button clicked! Starting Level 3...")
            level_level3.start_level_3(gameWindow)



    gameWindow.blit(background_surface, (0,0))

    gameWindow.blit(button_image1, (100, 150))
    gameWindow.blit(button_image2, (300, 150))
    gameWindow.blit(button_image3, (500, 150))
    gameWindow.blit(button_image4, (700, 150))
    gameWindow.blit(button_image5, (900, 150))
    gameWindow.blit(button_image6, (100, 350))
    gameWindow.blit(button_image7, (300, 350))
    gameWindow.blit(button_image8, (500, 350))
    gameWindow.blit(button_image9, (700, 350))
    gameWindow.blit(button_image10, (900, 350))

    gameWindow.blit(quit_image,(480, 550))

    pygame.display.update()



pygame.quit()
quit()


