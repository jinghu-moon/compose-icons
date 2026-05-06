package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HexagonNumber7: ImageVector
    get() {
        if (_hexagonNumber7 != null) return _hexagonNumber7!!
        _hexagonNumber7 = tablerOutlineIcon(
            name = "HexagonNumber7",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19.02 6.858c.625 .361 1.007 1.03 1 1.752v6.555c0 .728-.395 1.4-1.032 1.753l-6.017 3.844c-.605 .338-1.343 .338-1.948 0L5.007 16.918C4.37 16.565 3.974 15.894 3.975 15.166v-6.556c0-.728 .395-1.4 1.032-1.753L11.024 3.275c.622-.345 1.378-.345 2 0l6.017 3.583h-.029 .008")
            addPathData("M10 8h4l-2 8")
        }
        return _hexagonNumber7!!
    }

private var _hexagonNumber7: ImageVector? = null
