package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.StereoGlasses: ImageVector
    get() {
        if (_stereoGlasses != null) return _stereoGlasses!!
        _stereoGlasses = tablerOutlineIcon(
            name = "StereoGlasses",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 3h-2L3 12")
            addPathData("M16 3h2l3 9")
            addPathData("M3 12v7c0 .552 .448 1 1 1h4.586c.265-0 .52-.105 .707-.293l2-2c.391-.39 1.023-.39 1.414 0l2 2c.187 .188 .442 .293 .707 .293h4.586c.552 0 1-.448 1-1v-7h-18")
            addPathData("M7 16h1")
            addPathData("M16 16h1")
        }
        return _stereoGlasses!!
    }

private var _stereoGlasses: ImageVector? = null
