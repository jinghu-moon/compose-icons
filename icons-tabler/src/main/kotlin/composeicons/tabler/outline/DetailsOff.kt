package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DetailsOff: ImageVector
    get() {
        if (_detailsOff != null) return _detailsOff!!
        _detailsOff = tablerOutlineIcon(
            name = "DetailsOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 19h14")
            addPathData("M20.986 16.984c-.002-.252-.052-.501-.146-.734L13.74 4C13.388 3.363 12.718 2.968 11.99 2.968c-.728 0-1.398 .395-1.75 1.032L9.419 5.417M7.95 7.951 3.14 16.25c-.244 .6-.182 1.28 .166 1.826 .348 .546 .938 .89 1.584 .924")
            addPathData("M12 3v5M12 12v7")
            addPathData("M3 3 21 21")
        }
        return _detailsOff!!
    }

private var _detailsOff: ImageVector? = null
