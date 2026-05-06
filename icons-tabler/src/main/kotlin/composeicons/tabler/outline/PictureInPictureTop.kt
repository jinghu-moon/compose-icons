package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PictureInPictureTop: ImageVector
    get() {
        if (_pictureInPictureTop != null) return _pictureInPictureTop!!
        _pictureInPictureTop = tablerOutlineIcon(
            name = "PictureInPictureTop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 5h-6C3.895 5 3 5.895 3 7v10c0 1.105 .895 2 2 2h14c1.105 0 2-.895 2-2v-4")
            addPathData("M15 10h5c.552 0 1-.448 1-1v-3C21 5.448 20.552 5 20 5h-5c-.552 0-1 .448-1 1v3c0 .552 .448 1 1 1")
        }
        return _pictureInPictureTop!!
    }

private var _pictureInPictureTop: ImageVector? = null
