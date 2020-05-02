package school.portal.kothlinrecyclerviewex.models

import com.google.firebase.firestore.FirebaseFirestore
import school.portal.kothlinrecyclerviewex.models.subjectInfo.*
import school.portal.kothlinrecyclerviewex.models.subjectInfo.sub.name
import school.portal.kothlinrecyclerviewex.models.subjectInfo.sub.school
import school.portal.kothlinrecyclerviewex.models.subjectInfo.sub.subdesc
import school.portal.kothlinrecyclerviewex.models.subjectInfo.sub.subjectName

class DataSource {

    companion object {
        var db = FirebaseFirestore.getInstance()


        fun createDataSet(): ArrayList<Subjects> {
            var db = FirebaseFirestore.getInstance()


            // [START get_document]
            var docRef = db.collection("subjects").document("sub1")
            docRef.get()
                .addOnSuccessListener { document ->
                    if (document.getString("name").equals("")){

                    }else{
                        document.data
                    }
                }.addOnFailureListener { exception ->
                }
            sub.numberOfSubject = "12"

            // [END get_document]

            val list = ArrayList<Subjects>()

            while (list.size != sub.numberOfSubject.toInt()) {
//                getSchedule()
                // [START get_document]


                list.add(
                    Subjects(
                        sub.subjectName,
                        sub.subjectEnd,
                        sub.subjectName,
                        sub.subjectName
                    )
                )


            }
            return list
        }

        private fun getDocument() {

        }

//         private fun getSchedule() {
//
//            // var docRef = db.document("/Schools/$school/student/$name")
//            docRef.get()
//                .addOnSuccessListener { document->
//                    if (document.data != null) {
//                        document.getString("Department").toString()
//                        sub.subjectEnd = document.getString("First name").toString()
//                        sub.subjectStart = document.getString("sub-start").toString()
//                    }else{
//
//                    }
//                }.addOnFailureListener { exception ->
//            }
//        }


    }}