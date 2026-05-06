package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Ufo: ImageVector
    get() {
        if (_ufo != null) return _ufo!!
        _ufo = tablerOutlineIcon(
            name = "Ufo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16.95 9.01C19.97 9.749 22 11.133 22 12.724 22 15.091 17.52 17 12 17 6.48 17 2 15.091 2 12.724 2 11.134 4.04 9.739 7.07 9")
            addPathData("M7 9c0 1.105 2.239 2 5 2 2.761 0 5-.895 5-2v-.035C17 6.223 14.761 4 12 4 9.239 4 7 6.223 7 8.965v.035")
            addPathData("M15 17l2 3")
            addPathData("M8.5 17 7 20")
            addPathData("M12 14h.01")
            addPathData("M7 13h.01")
            addPathData("M17 13h.01")
        }
        return _ufo!!
    }

private var _ufo: ImageVector? = null
