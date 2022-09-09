package kotlin_language


fun main() {

    val abilityUiModel0 = AbilityUiModel("test0")
    val abilityUiModel1 = AbilityUiModel("test00")
    val abilityUiModel2 = AbilityUiModel("test000")
    val abilityUiModel3 = AbilityUiModel("test0000")
    val abilityUiModel4 = AbilityUiModel("test00000")

    var mModelList = listOf(abilityUiModel3, abilityUiModel0, abilityUiModel4, abilityUiModel2, abilityUiModel1)
    println("Before Sorted")
    println(mModelList)


    val comparator = object : Comparator<AbilityUiModel> {
        override fun compare(p0: AbilityUiModel?, p1: AbilityUiModel?): Int {
            return (p0?.content?.length ?: 0) - (p1?.content?.length ?: 0)
        }
    }

    val comparatorV2 = object : Comparator<AbilityUiModel> {
        override fun compare(p0: AbilityUiModel?, p1: AbilityUiModel?): Int {
            return (p0?.content?.length ?: 0) - (p1?.content?.length ?: 0)
        }
    }

//    println("After Sorted V1")
//    val afterSortModelList = mModelList.sortedWith(compareBy({it.content.length},{it.content.length}))
//    println(afterSortModelList)

    println("After Sorted V2")
    val afterSortModelListV2 = mModelList.sortedWith(comparator)
    println(afterSortModelListV2)

    val test: String = StringBuilder().also {
        it.append("test 0")
        it.append("test 1")
        it.append("test 2")
    }.toString()
    println("Test = " + test)

}

data class AbilityUiModel(val content: String)

//class AbilitiesInteractor(
//    private val abilitiesRepository: AbilitiesRepository,
//) {
//
//    fun execute(): List<AbilityUiModel> { //LinkedList убираем, вместо него ворзвращаем абстракцию
//        return abilitiesRepository.get()
//    }
//
//    //@Synchronized
//    fun addAbility(newAbility: String) {
//        abilitiesRepository.add(newAbility)
//    }
//
//}
//
//object Const {
//    var RES_ID = R.string.prefix_ability
//}
//
//
////Вынести в отдельный утилитарный файл
//fun String.toUiModel(prefix: String): AbilityUiModel {
//    val content = prefix + //this//Что это такое, не понятно?
//            return AbilityUiModel(content)
//}
//
//fun Context.getPrefix(): String = this.getString(Const.RES_ID)
//
////Если доменная модель, то должно быть корректное название
//class AbilityUiModel(val content: String)
//
//interface AbilitiesRepository {
//    fun get(): LinkedList<String>
//    fun add(ability: String)
//}
//
//
//class AbilitiesRepositoryImpl(
//    //
//    private val mContext: Context,
//) : AbilitiesRepository {
//
//    val prefix = mContext.getPrefix()
//
//    @Synchronized
//    fun get(): LinkedList<String>{
//
//        var abilities: LinkedList<String> = getDataFromDb()
//
//
//        for (i in 0 until abilities.size) {
//            val model = abilities[i].toUiModel(prefix)
//            mModelList.add(model)
//        }
//
//        val comparator = object : Comparator<AbilityUiModel> {
//            override fun compare(p0: AbilityUiModel?, p1: AbilityUiModel?): Int {
//                return //?  (p0?.content?.length ?: 0) - (p1?.content?.length ?: 0)
//            }
//        }
//        return mModelList.sortWith(comparator)
//    }
//
//    @Synchronized
//    fun add(ability: String){
//
//    }
//
//    fun getDataFromDb(): Link kedList<String>{}
//}