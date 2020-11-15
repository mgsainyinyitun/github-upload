from django.contrib import admin
from django.urls import path
from .import views

urlpatterns = [
    path('admin/', admin.site.urls),
    path('bmi',views.calbmi,name='calbmi'),
    path('upload', views.bmidata, name ='bmidata'),
]
