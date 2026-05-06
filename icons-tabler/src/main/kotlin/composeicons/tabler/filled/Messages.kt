package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Messages: ImageVector
    get() {
        if (_messages != null) return _messages!!
        _messages = tablerFilledIcon(
            name = "Messages",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20.901 14.995l-.044-.006c-.035-.002-.069-.009-.102-.02l-.045-.012-.048-.017-.045-.016-.043-.02-.045-.022-.04-.024-.044-.026-.043-.032-.036-.027c-.025-.021-.05-.043-.073-.066L17.586 12h-6.586C9.895 12 9 11.105 9 10v-6C9 2.895 9.895 2 11 2h9c1.105 0 2 .895 2 2v10c0 .131-.026 .262-.076 .383l-.02 .043-.022 .045-.024 .04-.026 .044-.032 .043-.027 .036c-.147 .179-.351 .302-.578 .347l-.052 .008-.044 .006c-.066 .007-.132 .007-.198 0")
            addPathData("M7 8.999v1.001c0 2.209 1.791 4 4 4h4v3c0 1.105-.895 2-2 2h-6.586L3.707 21.707C3.077 22.337 2 21.891 2 21v-10C2 9.895 2.895 9 4 9Z")
        }
        return _messages!!
    }

private var _messages: ImageVector? = null
