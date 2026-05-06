package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandDiscord: ImageVector
    get() {
        if (_brandDiscord != null) return _brandDiscord!!
        _brandDiscord = tablerOutlineIcon(
            name = "BrandDiscord",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 12c0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1-.552 0-1 .448-1 1")
            addPathData("M14 12c0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1-.552 0-1 .448-1 1")
            addPathData("M15.5 17c0 1 1.5 3 2 3C19 20 20.333 18.333 21 17c.667-1.667 .5-5.833-1.5-11.5C18.043 4.485 16.5 4.16 15 4l-.972 1.923c-1.341-.232-2.712-.232-4.053 0L9 4C7.5 4.16 5.957 4.485 4.5 5.5 2.5 11.167 2.333 15.333 3 17c.667 1.333 2 3 3.5 3 .5 0 2-2 2-3")
            addPathData("M7 16.5c3.5 1 6.5 1 10 0")
        }
        return _brandDiscord!!
    }

private var _brandDiscord: ImageVector? = null
