package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.View360Number: ImageVector
    get() {
        if (_view360Number != null) return _view360Number!!
        _view360Number = tablerOutlineIcon(
            name = "View360Number",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 6C14 5.448 13.552 5 13 5h-2c-.552 0-1 .448-1 1v6c0 .552 .448 1 1 1h2c.552 0 1-.448 1-1v-2C14 9.448 13.552 9 13 9h-3")
            addPathData("M3 5h2.5C6.328 5 7 5.672 7 6.5v1C7 8.328 6.328 9 5.5 9h-1.5 1.5C6.328 9 7 9.672 7 10.5v1C7 12.328 6.328 13 5.5 13h-2.5")
            addPathData("M17 7v4c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2v-4C21 5.895 20.105 5 19 5c-1.105 0-2 .895-2 2")
            addPathData("M3 16c0 1.657 4.03 3 9 3 4.97 0 9-1.343 9-3")
        }
        return _view360Number!!
    }

private var _view360Number: ImageVector? = null
