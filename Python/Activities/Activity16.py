class Cars:
    'This class represents a car with various attributes and methods'

    def __init__(self, manifacturer, model, make, transmission, color):
        self.manifacturer = manifacturer
        self.model = model
        self.make = make
        self.transmission = transmission
        self.color = color
    def accelerate(self):
        print(self.manifacturer+" "+ self.model+" "+ "is moving")
    def stop(self):
        print(self.manifacturer +" "+ self.model+" "+ "has stopped")

c1=Cars("Toyota", "Corolla", 2020, "Automatic", "Blue")
c2=Cars("Honda", "Civic", 2019, "Manual", "Red")
c3=Cars("Ford", "Focus", 2021, "Automatic", "Black")

c1.accelerate()
c2.stop()
c3.accelerate()