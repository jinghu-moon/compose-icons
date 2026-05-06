package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Columns3: ImageVector
    get() {
        if (_columns3 != null) return _columns3!!
        _columns3 = tablerFilledIcon(
            name = "Columns3",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 2h2c.552 0 1 .448 1 1v18c0 .552-.448 1-1 1h-2C2.895 22 2 21.105 2 20v-16C2 2.895 2.895 2 4 2")
            addPathData("M9 3C9 2.448 9.448 2 10 2h4c.552 0 1 .448 1 1v18c0 .552-.448 1-1 1h-4C9.448 22 9 21.552 9 21Z")
            addPathData("M18 2h2c1.105 0 2 .895 2 2v16c0 1.105-.895 2-2 2h-2c-.552 0-1-.448-1-1v-18c0-.552 .448-1 1-1")
        }
        return _columns3!!
    }

private var _columns3: ImageVector? = null
