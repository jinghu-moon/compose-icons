package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Binary: ImageVector
    get() {
        if (_binary != null) return _binary!!
        _binary = tablerOutlineIcon(
            name = "Binary",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 10v-5h-1M18 19v-5h-1")
            addPathData("M15 5.5C15 5.224 15.224 5 15.5 5h2c.276 0 .5 .224 .5 .5v4c0 .276-.224 .5-.5 .5h-2C15.224 10 15 9.776 15 9.5v-4")
            addPathData("M10 14.5c0-.276 .224-.5 .5-.5h2c.276 0 .5 .224 .5 .5v4c0 .276-.224 .5-.5 .5h-2C10.224 19 10 18.776 10 18.5v-4")
            addPathData("M6 10h.01M6 19h.01")
        }
        return _binary!!
    }

private var _binary: ImageVector? = null
