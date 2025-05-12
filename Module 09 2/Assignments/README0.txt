Project Title: 9.02 2D Class Hierarchies
Purpose of Project: to create and test a terrain class hierarchy
Date: 03/02/2025
Author: William Van Uitert


Post-Mortem Review:

What went Right:
    I was able to easily create the constructors for the methods by calling super().

What went Wrong:
    I was confused at what system would be best for getting the info about the
    terrain. Eventually, I settled on overiding the subclass method and within it
    calling the super's method.


In the Future:
    I would like to use more inheritance between classes.