package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.PictureInPicture: ImageVector
    get() {
        if (_pictureInPicture != null) return _pictureInPicture!!
        _pictureInPicture = tablerFilledIcon(
            name = "PictureInPicture",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19 4c1.657 0 3 1.343 3 3v4c0 .552-.448 1-1 1-.552 0-1-.448-1-1v-4C20 6.448 19.552 6 19 6h-14C4.448 6 4 6.448 4 7v10c0 .552 .448 1 1 1h6c.552 0 1 .448 1 1 0 .552-.448 1-1 1h-6C3.343 20 2 18.657 2 17v-10C2 5.343 3.343 4 5 4Z")
            addPathData("M20 13c1.105 0 2 .895 2 2v3c0 1.105-.895 2-2 2h-5c-1.105 0-2-.895-2-2v-3c0-1.105 .895-2 2-2Z")
        }
        return _pictureInPicture!!
    }

private var _pictureInPicture: ImageVector? = null
