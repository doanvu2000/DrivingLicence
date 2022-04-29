package com.example.drivinglicence.app.viewmodel

import com.example.drivinglicence.R
import com.example.drivinglicence.app.entity.ItemRoadTraffic
import com.example.drivinglicence.component.viewmodel.BaseViewModel

class RoadTrafficViewModel : BaseViewModel() {

    fun getRoadTrafficBan(): MutableList<ItemRoadTraffic> {
        return mutableListOf(
            ItemRoadTraffic(
                "Biển số P.124a \"Cấm quay đầu xe\"",
                "Để báo cấm các loại xe quay đầu theo kiểu chữ U. Chiều mũi tên phù hợp với chiều cấm quay đầu xe. Biển số P.124a có hiệu lực cấm các laoij xe (cơ giới và thô sơ) trừ các xe dược ưu tiên theo quy định. Biển không cso giá trị cấm rẽ trái để đi sang hướng đường khác",
                R.drawable.bien_bao_p_124a
            ),
            ItemRoadTraffic(
                "Biển số P.105 \"Cấm xe ôtô và xe máy\"",
                "Để báo đường cấm các loại xe cơ giới và xe máy đi qua trừ các xe được ưu tiên theo quy định.",
                R.drawable.bien_bao_p105
            ),
            ItemRoadTraffic(
                "Biển số P.101 \"Cấm đi ngược chiều\"",
                "Để báo đường cấm các loại phương tiện đi lại cả hai hướng, trừ các xe được ưu tiên theo quy định.",
                R.drawable.bien_bao_p101
            ),
            ItemRoadTraffic(
                "Biển số P.102 \"Đường cấm\"",
                "Để báo đường cấm các loại xe (cơ giới và thô sơ) đi vào theo chiều đặt biển, trừ các xe được ưu tiên theo quy định, đặt biển số P.102 “Cấm đi ngược chiều”. Người đi bộ được phép đi trên vỉa hè hoặc lề đường.",
                R.drawable.bien_bao_p102
            ),
            ItemRoadTraffic(
                "Biển số P.103a \"Cấm xe ô tô\"",
                "Để báo đường cấm các loại xe cơ giới kể cả xe máy 3 bánh có thùng đi qua, trừ xe máy 2 bánh, xe gắn máy và các xe được ưu tiên theo quy định.",
                R.drawable.bien_bao_p103a
            ),
            ItemRoadTraffic(
                "Biển số P.103b \"Cấm xe ô tô rẽ phải\"",
                "Để báo đường cấm các loại xe cơ giới kể cả xe máy 3 bánh có thùng rẽ phải, trừ xe máy 2 bánh, xe gắn máy và các xe được ưu tiên theo quy định.",
                R.drawable.bien_bao_p103b
            ),
            ItemRoadTraffic(
                "Biển số P.103c \"Cấm xe ô tô rẽ trái\"",
                "Để báo đường cấm các loại xe cơ giới kể cả xe máy 3 bánh có thùng rẽ trái, trừ xe máy 2 bánh, xe gắn máy và các xe được ưu tiên theo quy định.",
                R.drawable.bien_bao_p103c
            ),
            ItemRoadTraffic(
                "Biển số P.104 \"Cấm xe máy\"",
                "Để báo đường cấm các loại xe máy trừ các xe được ưu tiên theo quy định, đặt biển số P.104 “Cấm xe máy”. Biển không có giá trị cấm những người dắt xe máy.",
                R.drawable.bien_bao_p104c
            ),
            ItemRoadTraffic(
                "Biển số P.106a \"Cấm xe ô tô tải\"",
                "Để báo đường cấm các loại xe ô tô tải trừ các xe được ưu tiên theo quy định. Biển có hiệu lực cấm đối với cả máy kéo và các loại xe máy chuyên dùng đi vào đoạn đường đặ biển số P.106a.",
                R.drawable.bien_bao_p106a
            ),
            ItemRoadTraffic(
                "Biển số P.106b \"Cấm xe ô tô tải\"",
                "Để báo đường cấm các loại xe ô tô tải có khối lượng chuyên chở lớn hơn một giá trị nhất định. Biển có hiệu lực cấm các xe ô tô tải có khối lượng chuyên chở lớn hơn giá trị chữ số ghi trong biển. Biển có hiệu lực cấm đối với cả máy kéo và các xe máy chuyên dùng đi vào đoạn đường đặt biển.",
                R.drawable.bien_bao_p106b
            ),
            ItemRoadTraffic(
                "Biển số P.106c \"Cấm xe chở hàng nguy hiểm\"",
                "Để báo đường cấm các loại xe hàng nguy hiểm.",
                R.drawable.bien_bao_p106c
            ),
            ItemRoadTraffic(
                "Biển số P.107 \"Cấm xe ô tô khách và xe ô tô tải\"",
                "Để báo đường cấm các xe ô tô chở khách và các loại xe ô tô tải kể cả các loại máy kéo và xe máy thi công chuyên dùng đi qua trừ các xe được ưu tiên theo quy định.",
                R.drawable.bien_bao_p107
            ),
            ItemRoadTraffic(
                "Biển số P.107a \"Cấm xe ô tô khách\"",
                "Để báo đường cấm ô tô chở khác đi qua trừ các xe ưu tiên theo quy định. Biển này không cấm xe buýt.",
                R.drawable.bien_bao_p107a
            ),
            ItemRoadTraffic(
                "Biển số P.107b \"Cấm xe ô tô taxi\"",
                "Để báo đường cấm ô tô taxi đi lại. Trường hợp cấm xe ô tô taxi theo giờ thì đặt biển phụ ghi giờ cấm.",
                R.drawable.bien_bao_p107b
            ),
            ItemRoadTraffic(
                "Biển số P.108 \"Cấm xe kéo rơ-moóc\"",
                "Để báo đường cấm các loại xe cơ giới kéo theo rơ-moóc kể cả xe máy, máy kéo, ô tô khách kéo theo rơ-moóc đi lại, trừ loại ô tô sơ-mi-rơ-moóc và các xe được ưu tiên (có kéo theo rơ-moóc) theo quy định.",
                R.drawable.bien_bao_p108
            ),
            ItemRoadTraffic(
                "Biển số P.109 \"Cấm máy kéo\"",
                "Để báo đường cấm các loại máy kéo kể cả máy kéo bánh hơi và bánh xích đi qua.",
                R.drawable.bien_bao_p109
            )
        )
    }

    fun getRoadTrafficCommand(): MutableList<ItemRoadTraffic> {
        return mutableListOf(
            ItemRoadTraffic(
                "Biển số R.122 \"Dừng lại\"",
                "Để báo các xe (cơ giới và thô sơ) dừng lại.",
                R.drawable.b_r122
            ),
            ItemRoadTraffic(
                "Biển số R.301a \"Hướng đi phải theo\"",
                "Khi đặt biển R.301a ở trước nơi đường giao nhau thì hiệu lực tác dụng của biển là ở phạm vi khu vực nơi đường giao nhau phía sau biển tức là cấm xe rẽ phải hay rẽ trái. Nếu biển này đặt ở sau nơi đường giao nhau (bắt đầu vào đoạn đường phố) thì hiệu lực tác dụng của biển là từ vị trí đặt biển đến nơi đường giao nhau. Trong trường hợp này cấm rẽ trái và quay đầu trong vùng tác dụng của biển, chỉ cho phép rẽ phải vào cổng nhà hoặc ngõ phố có trên đoạn đường từ nơi giao nhau đặt biển đến nơi đường giao nhau tiếp theo.",
                R.drawable.b_r301a
            ),
            ItemRoadTraffic(
                "Biển số R.301b \"Hướng đi phải theo\"",
                "Nhằm chỉ hướng cho phép xe đi ngang qua nơi đường giao nhau và ngăn chặn hướng đi ngược chiều trên đường phố với đường một chiều. Biển bắt buộc người tham gia giao thông chỉ được phép rẽ phải hoặc rẽ trái ở phạm vị nơi đường giao nhau trước mặt biển.",
                R.drawable.b_r301b
            ),
            ItemRoadTraffic(
                "Biển số R.301c \"Hướng đi phải theo\"",
                "Nhằm chỉ hướng cho phép xe đi ngang qua nơi đường giao nhau và ngăn chặn hướng đi ngược chiều trên đường phố với đường một chiều. Biển bắt buộc người tham gia giao thông chỉ được phép rẽ phải hoặc rẽ trái ở phạm vị nơi đường giao nhau trước mặt biển.",
                R.drawable.b_r301c
            ),
            ItemRoadTraffic(
                "Biển số R.301d \"Hướng đi phải theo\"",
                "Biển bắt buộc người tham gia giao thông chỉ được phép rẽ phải hoặc rẽ trái ở phạm vi nơi đường giao nhau đằng sau mặt biển.",
                R.drawable.b_r301d
            ),
            ItemRoadTraffic(
                "Biển số R.301e \"Hướng đi phải theo\"",
                "Biển bắt buộc người tham gia giao thông chỉ được phép rẽ phải hoặc rẽ trái ở phạm vi nơi đường giao nhau đằng sau mặt biển.",
                R.drawable.b_r301e
            ),
            ItemRoadTraffic(
                "Biển số R.301h \"Hướng đi phải theo\"",
                "Người tham gia giao thông chỉ được phép đi thẳng hay rẽ trái và được phép quay đầu xe để đi theo hướng ngược lại.",
                R.drawable.b_r301h
            ),
            ItemRoadTraffic(
                "Biển số R.301f \"Hướng đi phải theo\"",
                "Người tham gia giao thông chỉ được phép đi thẳng hay rẽ trái và được phép quay đầu xe để đi theo hướng ngược lại.",
                R.drawable.b_r301f
            ),
            ItemRoadTraffic(
                "Biển số R.303 \"Nơi giao nhau chạy theo vòng xuyến\"",
                "Để báo cho các loại xe ( thô sơ và cơ giới) phải chạy vòng theo đảo an toàn ở nơi đường giao nhau. Biển có hiệu lực bắt buộc các loại xe muốn chuyển hướng phải chạy vòng theo đảm an toàn theo hướng mũi tên.",
                R.drawable.b_r303
            ),
            ItemRoadTraffic(
                "Biển số R.305 \"Đường dành cho người đi bộ\"",
                "Để báo đường dành cho người đi bộ. Biển có hiệu lực bắt buộc người đi bộ phải dùng đường dành riêng này để đi. Các loại xe cơ giới và thô sơ (trừ xe đạp và xe lăn dành cho người tàn tật), kể cả các xe được ưu tiên theo quy định không được phép đi vào trên đường đã đặt biển này, trừ trường hợp đi cắt ngang qua nhưng phải đảm bảo tuyệt đối an toàn cho người đi bộ.",
                R.drawable.b_r305
            ),
            ItemRoadTraffic(
                "Biển số R.306 \"Tốc độ tối thiểu cho phép\"",
                "Để báo tốc độ tối thiểu cho phép các xe cơ giới chạy. Biển có hiệu lực bắt buộ các loại xe cơ giới vận hành với tốc độ không nhỏ hơn trị số ghi trên biển trong điều kiện giao thông thuận lợi và an toàn. Các loại xe có tốc độ tối đa theo quy định của nhà sản xuất không đạt tốc độ tối thiểu đã ghi trên biển thì không được phép đi vào đường này. Trị số ghi trên biển được tính bằng km/h và được quy định tùy theo tiêu chuẩn kỹ thuật của cầu đường và tổ chức giao thông, không được quy định trị số lớn hơn trị số tốc độ an toàn.",
                R.drawable.b_r306
            ),
            ItemRoadTraffic(
                "Biển số R.307 \"Hết hạn chế tốc độ tối thiểu\"",
                "Biển có giá trị báo cho người tham gia giao thông biết hiệu lực của biển số R.306 hết tác dụng, kể từ biển này các xe được phép chạy chậm hơn trị số ghi trên biển nhưng không được gây cản trở các xe khác.",
                R.drawable.b_r307
            ),
        )
    }
}