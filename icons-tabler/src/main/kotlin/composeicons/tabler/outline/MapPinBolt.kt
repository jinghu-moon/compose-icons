package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MapPinBolt: ImageVector
    get() {
        if (_mapPinBolt != null) return _mapPinBolt!!
        _mapPinBolt = tablerOutlineIcon(
            name = "MapPinBolt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 11c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3C15 9.343 13.657 8 12 8 10.343 8 9 9.343 9 11")
            addPathData("M13.414 20.9c-.781 .78-2.046 .78-2.827 0L6.343 16.657C3.692 14.006 3.238 9.87 5.25 6.707 7.263 3.543 11.201 2.202 14.726 3.479c3.525 1.277 5.689 4.831 5.208 8.549")
            addPathData("M19 16l-2 3h4l-2 3")
        }
        return _mapPinBolt!!
    }

private var _mapPinBolt: ImageVector? = null
