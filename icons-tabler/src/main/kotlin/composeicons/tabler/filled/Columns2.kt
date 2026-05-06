package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Columns2: ImageVector
    get() {
        if (_columns2 != null) return _columns2!!
        _columns2 = tablerFilledIcon(
            name = "Columns2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 2h6c.552 0 1 .448 1 1v18c0 .552-.448 1-1 1h-6C2.895 22 2 21.105 2 20v-16C2 2.895 2.895 2 4 2")
            addPathData("M14 2h6c1.105 0 2 .895 2 2v16c0 1.105-.895 2-2 2h-6c-.552 0-1-.448-1-1v-18c0-.552 .448-1 1-1")
        }
        return _columns2!!
    }

private var _columns2: ImageVector? = null
