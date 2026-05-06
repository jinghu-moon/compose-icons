package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Barbell: ImageVector
    get() {
        if (_barbell != null) return _barbell!!
        _barbell = tablerFilledIcon(
            name = "Barbell",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 7c.552 0 1 .448 1 1v8c0 .552-.448 1-1 1C3.448 17 3 16.552 3 16v-3h-1C1.448 13 1 12.552 1 12c0-.552 .448-1 1-1h1v-3C3 7.448 3.448 7 4 7")
            addPathData("M20 7c.552 0 1 .448 1 1v3h1c.552 0 1 .448 1 1 0 .552-.448 1-1 1h-1v3c0 .552-.448 1-1 1-.552 0-1-.448-1-1v-8c0-.552 .448-1 1-1")
            addPathData("M16 5c1.105 0 2 .895 2 2v10c0 1.105-.895 2-2 2-1.105 0-2-.895-2-2v-4h-4v4c0 1.105-.895 2-2 2C6.895 19 6 18.105 6 17v-10C6 5.895 6.895 5 8 5c1.105 0 2 .895 2 2v4h4v-4c0-1.105 .895-2 2-2")
        }
        return _barbell!!
    }

private var _barbell: ImageVector? = null
