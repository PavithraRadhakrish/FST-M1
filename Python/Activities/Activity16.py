class Car:
    def __init__(self, manufacturer, model, make, transmission, color):
        self.manufacturer = manufacturer
        self.model = model
        self.make = make
        self.transmission = transmission
        self.color = color

    def accelerate(self):
        print(self.manufacturer + " " + self.model + " is moving")

    def stop(self):
        print(self.manufacturer + " " + self.model + " has stopped")
car1 = Car("Toyota", "Innova", "2019", "Automatic", "White")
car2 = Car("Renault", "Duster", "2020", "Automatic", "Red")
car3 = Car("Nissan", "Datson GO", "2021", "Manual", "Navy Blue")
car1.accelerate()
car1.stop()
car2.accelerate()
car2.stop()
car3.accelerate()
car3.stop()
