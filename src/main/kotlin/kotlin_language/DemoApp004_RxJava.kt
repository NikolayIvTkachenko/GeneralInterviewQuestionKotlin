package kotlin_language

import io.reactivex.Observable
import java.util.concurrent.TimeUnit


fun main() {

    //flatMap
    Observable.fromArray("1", "2", "3").flatMap { number ->
            Observable.timer(if (number == "1") 0L else 3000L, TimeUnit.MILLISECONDS)
            .map{number}
        }
        .subscribe{number ->
            println(number)
        }


    //concatMap
//    Observable.just("1", "2", "3").concatMap { number ->
//        Observable.timer(if (number == "1") 0L else 3000L, TimeUnit.MILLISECONDS)
//            .map{number}
//    }
//        .subscribe{number ->
//            println(number)
//        }



    //switchMap
//    Observable.just("1", "2", "3").switchMap { number ->
//        Observable.timer(if (number == "1") 0L else 3000L, TimeUnit.MILLISECONDS)
//            .map{number}
//    }
//        .subscribe{number ->
//            println(number)
//        }


    //Observable.of

    Thread.sleep(10000)

}