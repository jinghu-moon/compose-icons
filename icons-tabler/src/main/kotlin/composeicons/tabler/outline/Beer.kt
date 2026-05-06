package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Beer: ImageVector
    get() {
        if (_beer != null) return _beer!!
        _beer = tablerOutlineIcon(
            name = "Beer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 21h6c.552 0 1-.448 1-1v-3.625c0-1.397 .29-2.775 .845-4.025l.31-.7C17.711 10.4 18 9.397 18 8v-4C18 3.448 17.552 3 17 3h-10C6.448 3 6 3.448 6 4v4c0 1.397 .29 2.4 .845 3.65l.31 .7c.559 1.268 .847 2.639 .845 4.025v3.625c0 .552 .448 1 1 1")
            addPathData("M6 8h12")
        }
        return _beer!!
    }

private var _beer: ImageVector? = null
