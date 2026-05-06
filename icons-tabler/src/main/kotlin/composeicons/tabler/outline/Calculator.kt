package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Calculator: ImageVector
    get() {
        if (_calculator != null) return _calculator!!
        _calculator = tablerOutlineIcon(
            name = "Calculator",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 5C4 3.895 4.895 3 6 3h12c1.105 0 2 .895 2 2v14c0 1.105-.895 2-2 2h-12C4.895 21 4 20.105 4 19v-14")
            addPathData("M8 8C8 7.448 8.448 7 9 7h6c.552 0 1 .448 1 1v1c0 .552-.448 1-1 1h-6C8.448 10 8 9.552 8 9v-1")
            addPathData("M8 14v.01")
            addPathData("M12 14v.01")
            addPathData("M16 14v.01")
            addPathData("M8 17v.01")
            addPathData("M12 17v.01")
            addPathData("M16 17v.01")
        }
        return _calculator!!
    }

private var _calculator: ImageVector? = null
