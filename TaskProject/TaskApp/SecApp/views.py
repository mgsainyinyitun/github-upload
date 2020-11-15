from django.shortcuts import render
from .models import calculator


context = {"result" : 0, 
         "status" : "",
          }
def calbmi(request):
    return render(request,'SecApp/bmi.html', context)

def bmidata(request):
    height = float(request.POST.get('height'))
    print(height);

    height = height * 12

    weight = float(request.POST.get('weight'))

    result = 730 * (weight/height**2)
    result = round(result,2)
    
    status = check(result)
    context = {"result" : result, 
                 "status" : status,
           }

    BMI = calculator( height = height, weight = weight, result = result, status =status )
    BMI.save()
    return render(request, 'SecApp/bmi.html',context)

def check(result):
    
    if result < 18.5:
        return "Underweight"

    elif result > 18.5 and result < 25:
        return "Normal"

    elif result > 25 and result < 30:
        return "Overweight"

    else:
        return "Obese"
