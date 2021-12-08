#Paulo Henrique Rodrigues Pradella
import machine
import time
import dht
import network
import urequests

sensor = dht.DHT11(machine.Pin(4))
rele = machine.Pin (2, machine.Pin.OUT)

def conectar(ssid, senha):
    station = network.WLAN(network.STA_IF)
    station.active(True)
    station.connect(ssid,senha)
    for t in range(50):
        if station.isconnected():
            break
    time.sleep(0.1)
    return station

print ('Conectando a rede informada...')
station = conectar('rede','senha')
if not station.isconnected():
    print('Não possível conectar a rede informada...')
else:
    print('Estamos conectatos, a partir de agora os dados serão coletados e encaminhados ao serviço Thingspeak...')
    while True:
        sensor.measure()
        if sensor.temperature() > 31 or sensor.humidity() > 70:
            rele.value(1)
        else:
            rele.value(0)
        dadosenvio = urequests.get('https://api.thingspeak.com/update?api_key=PMJ9JPTHMVE1DPGM&field1={}&field2={}'
                                 .format(sensor.temperature(),sensor.humidity()))
        print("Temp={}°C  Umid={}%".format(sensor.temperature(), sensor.humidity()))
        dadosenvio.close()
        time.sleep(15)
