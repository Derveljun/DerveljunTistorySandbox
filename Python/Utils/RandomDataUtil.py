from random import *
import string

def randomKoreanFirstName(size : int):
    nm_idx = ''.join(['가각간갈감갑강개객갱갹거건걸검겁게격견결겸경계고곡곤골공곶과곽관괄광괘괴괵굉교구국군굴궁권궐궤귀규균귤극근글금급긍기긴길김끽나낙난날남납낭내녀녁년념녑녕노농뇌뇨누눈눌뉴뉵능니닉닐다단달담답당대댁덕도독돈돌동두둔둘득등라락란랄람랍랑래랭'
              ,'략량려력련렬렴렵령례로록론롱뢰료룡루류륙륜률륭륵름릉리린림립마막만말망매맥맹멱면멸명몌모목몰몽묘무묵문물미민밀박반발방배백번벌범법벽변별병보복본볼봉부북분불붕비빈빙사삭산살삼삽상새색생서석선설섬섭성세소속손솔송쇄쇠수숙순술숭쉬슬습승시'
              ,'식신실심십쌍씨아악안알암압앙애액앵야약양어억언얼엄업에엔여역연열염엽영예오옥온올옹와완왈왕왜외요욕용우욱운울웅원월위유육윤율융은을음읍응의이익인일임입잉자작잔잠잡장재쟁저적전절점접정제조족존졸종좌죄주죽준줄중즉즐즙증지직진질짐집징차착'
              ,'찬찰참창채책처척천철첨첩청체초촉촌총촬최추축춘출충췌취측층치칙친칠침칩칭쾌타탁탄탈탐탑탕태택탱터토톤통퇴투퉁특틈파판팔패팽퍅편폄평폐포폭표품풍피픽필핍하학한할함합항해핵행향허헌헐험혁현혈혐협형혜호혹혼홀홍화확환활황회획횡효후훈훌훙훤훼휘휴휼흉흑흔흘흠흡흥희히힐'])
    return ''.join(choice(nm_idx) for _ in range(size))

def randomKoreanLastName(size : int):
    lst_nm_idx = '김이박최정강조윤장임한오서신권황안송류전홍고문양손배백허유남심지노하곽성차주우구라민진엄채원천방공현함변염여추도소석선설마길연위표명기반왕금옥육인맹제모탁국어은편용예경봉사부가복태목형계피두감음빈동온호범좌팽승간상시갈단견당화창'
    return ''.join(choice(lst_nm_idx) for _ in range(size))

def randomKoreanFullName(last_name_size = 1, first_name_size = 2):
    return ''.join([randomKoreanLastName(randint(1, last_name_size)), randomKoreanFirstName(first_name_size)])

def randomFromUnicode(size : int):
    chrs = []
    for i in range(size):
        rn = int((random() * 11172) + 0xAC00)
        chrs.append(chr(rn))
        
    return ''.join(chrs)
    
def randomCellPhone():
    return '010' + str(int(random() * 100000000))

def randomEmail():
    srting_pool = string.ascii_letters
    return ''.join(choice(srting_pool) for _ in range(12)) + "@test.com"

def randomCi():
    srting_pool = string.ascii_letters + string.digits + "^_=+\\/"
    return ''.join(choice(srting_pool) for _ in range(88))

def randomNumric(size : int):
    string_pool = string.digits
    return ''.join(choice(string_pool) for _ in range(size))

def randomCarNo():
    return randomFromUnicode(2) + randomNumric(2) + randomFromUnicode(1) + randomNumric(4)

if __name__ == "__main__":
    print(randomFromUnicode(3))
    print(randomKoreanLastName(2) + randomKoreanFirstName(2))
    print(randomCi())
    print(randomCarNo())
    print(randomKoreanFullName())
