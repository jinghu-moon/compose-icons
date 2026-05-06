package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Cash: ImageVector
    get() {
        if (_cash != null) return _cash!!
        _cash = tablerOutlineIcon(
            name = "Cash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 15h-3C3.448 15 3 14.552 3 14v-8C3 5.448 3.448 5 4 5h12c.552 0 1 .448 1 1v3")
            addPathData("M7 10C7 9.448 7.448 9 8 9h12c.552 0 1 .448 1 1v8c0 .552-.448 1-1 1h-12C7.448 19 7 18.552 7 18v-8")
            addPathData("M12 14c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
        }
        return _cash!!
    }

private var _cash: ImageVector? = null
