package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CirclePlus2: ImageVector
    get() {
        if (_circlePlus2 != null) return _circlePlus2!!
        _circlePlus2 = tablerOutlineIcon(
            name = "CirclePlus2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20.985 12.522C21.201 8.794 19.093 5.32 15.687 3.79 12.28 2.261 8.283 2.994 5.64 5.632 2.998 8.271 2.26 12.268 3.785 15.676c1.525 3.409 4.997 5.521 8.725 5.31")
            addPathData("M16 19h6")
            addPathData("M19 16v6")
        }
        return _circlePlus2!!
    }

private var _circlePlus2: ImageVector? = null
