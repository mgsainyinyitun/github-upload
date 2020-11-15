from django.db import models

# Create your models here.
class calculator(models.Model):
    height = models.FloatField ()
    weight = models.FloatField ()
    result = models.FloatField ()
    status = models.CharField (max_length=30)