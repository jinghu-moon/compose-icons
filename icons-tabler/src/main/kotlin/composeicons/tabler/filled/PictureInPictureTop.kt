package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.PictureInPictureTop: ImageVector
    get() {
        if (_pictureInPictureTop != null) return _pictureInPictureTop!!
        _pictureInPictureTop = tablerFilledIcon(
            name = "PictureInPictureTop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 4c.552 0 1 .448 1 1 0 .552-.448 1-1 1h-6C4.448 6 4 6.448 4 7v10c0 .552 .448 1 1 1h14c.552 0 1-.448 1-1v-4c0-.552 .448-1 1-1 .552 0 1 .448 1 1v4c0 1.657-1.343 3-3 3h-14C3.343 20 2 18.657 2 17v-10C2 5.343 3.343 4 5 4Z")
            addPathData("M20 4c1.105 0 2 .895 2 2v3c0 1.105-.895 2-2 2h-5c-1.105 0-2-.895-2-2v-3c0-1.105 .895-2 2-2Z")
        }
        return _pictureInPictureTop!!
    }

private var _pictureInPictureTop: ImageVector? = null
