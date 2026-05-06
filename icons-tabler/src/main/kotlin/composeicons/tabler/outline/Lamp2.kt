package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Lamp2: ImageVector
    get() {
        if (_lamp2 != null) return _lamp2!!
        _lamp2 = tablerOutlineIcon(
            name = "Lamp2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 21h9")
            addPathData("M10 21 3 13 11.5 7.5")
            addPathData("M13 14C10.852 11.852 10.852 8.148 13 6c2.088-2.088 5.842-1.972 8 0l-8 8")
            addPathData("M11.742 7.574 10.586 6.418C9.805 5.637 9.805 4.371 10.585 3.589c.781-.781 2.047-.781 2.828-0l1.144 1.144")
            addPathData("M15.5 12l.208 .274c.985 .975 2.571 .975 3.556 0 .939-.933 .98-2.42 .122-3.4l-.366-.369")
        }
        return _lamp2!!
    }

private var _lamp2: ImageVector? = null
