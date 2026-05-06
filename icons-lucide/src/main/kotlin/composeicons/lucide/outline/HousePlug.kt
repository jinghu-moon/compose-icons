package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.HousePlug: ImageVector
    get() {
        if (_housePlug != null) return _housePlug!!
        _housePlug = lucideOutlineIcon(
            name = "HousePlug",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 12v-3.036")
            addPathData("M14 12v-3.036")
            addPathData("M15 12c.552 0 1 .448 1 1v2c0 1.105-.895 2-2 2h-4C8.895 17 8 16.105 8 15v-2c0-.552 .448-1 1-1Z")
            addPathData("M8.5 21h-3.5C3.895 21 3 20.105 3 19v-9C3 9.411 3.259 8.852 3.709 8.472L10.709 2.472c.745-.63 1.837-.63 2.582 0l7 6c.45 .38 .709 .939 .709 1.528v9c0 1.105-.895 2-2 2h-5c-1.105 0-2-.895-2-2v-2")
        }
        return _housePlug!!
    }

private var _housePlug: ImageVector? = null
