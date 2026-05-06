package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Keyframes: ImageVector
    get() {
        if (_keyframes != null) return _keyframes!!
        _keyframes = tablerOutlineIcon(
            name = "Keyframes",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9.225 18.412C8.925 18.781 8.476 18.996 8 19c-.468 0-.914-.214-1.225-.588L2.414 13.164c-.552-.678-.552-1.65 0-2.328L6.775 5.588C7.075 5.219 7.524 5.004 8 5c.468 0 .914 .214 1.225 .588l4.361 5.248c.552 .678 .552 1.65 0 2.328L9.225 18.412")
            addPathData("M17 5l4.586 5.836c.552 .678 .552 1.65 0 2.328L17 19")
            addPathData("M13 5l4.586 5.836c.552 .678 .552 1.65 0 2.328L13 19")
        }
        return _keyframes!!
    }

private var _keyframes: ImageVector? = null
