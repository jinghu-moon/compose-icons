package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ImageInPicture: ImageVector
    get() {
        if (_imageInPicture != null) return _imageInPicture!!
        _imageInPicture = tablerOutlineIcon(
            name = "ImageInPicture",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13 15c-2 0-5 1-5 5")
            addPathData("M4 13c0-1.105 .895-2 2-2h5c1.105 0 2 .895 2 2v5c0 1.105-.895 2-2 2h-5C4.895 20 4 19.105 4 18v-5")
            addPathData("M4 7v-2C4 4.448 4.448 4 5 4h2")
            addPathData("M11 4h2")
            addPathData("M17 4h2c.552 0 1 .448 1 1v2")
            addPathData("M20 11v2")
            addPathData("M20 17v2c0 .552-.448 1-1 1h-2")
        }
        return _imageInPicture!!
    }

private var _imageInPicture: ImageVector? = null
