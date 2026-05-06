package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ApiBook: ImageVector
    get() {
        if (_apiBook != null) return _apiBook!!
        _apiBook = tablerOutlineIcon(
            name = "ApiBook",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 19c2.785-1.608 6.215-1.608 9 0 .325-.187 .661-.354 1.006-.5")
            addPathData("M3 6C5.785 4.392 9.215 4.392 12 6c2.785-1.608 6.215-1.608 9 0")
            addPathData("M3 6v13")
            addPathData("M12 6v13")
            addPathData("M21 6v6")
            addPathData("M17.001 19c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
            addPathData("M19.001 15.5v1.5")
            addPathData("M19.001 21v1.5")
            addPathData("M22.032 17.25 20.733 18")
            addPathData("M17.27 20l-1.3 .75")
            addPathData("M15.97 17.25 17.27 18")
            addPathData("M20.733 20l1.3 .75")
        }
        return _apiBook!!
    }

private var _apiBook: ImageVector? = null
