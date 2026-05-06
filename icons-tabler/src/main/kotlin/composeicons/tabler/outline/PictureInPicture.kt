package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PictureInPicture: ImageVector
    get() {
        if (_pictureInPicture != null) return _pictureInPicture!!
        _pictureInPicture = tablerOutlineIcon(
            name = "PictureInPicture",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 19h-6C3.895 19 3 18.105 3 17v-10C3 5.895 3.895 5 5 5h14c1.105 0 2 .895 2 2v4")
            addPathData("M14 15c0-.552 .448-1 1-1h5c.552 0 1 .448 1 1v3c0 .552-.448 1-1 1h-5c-.552 0-1-.448-1-1v-3")
        }
        return _pictureInPicture!!
    }

private var _pictureInPicture: ImageVector? = null
