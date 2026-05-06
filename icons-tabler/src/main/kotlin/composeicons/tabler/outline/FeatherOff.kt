package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FeatherOff: ImageVector
    get() {
        if (_featherOff != null) return _featherOff!!
        _featherOff = tablerOutlineIcon(
            name = "FeatherOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 20l8-8")
            addPathData("M14 5v5h5")
            addPathData("M9 11v4h4")
            addPathData("M6 13v5h5")
            addPathData("M6 13 9.502 9.498 11.525 7.475 14 5")
            addPathData("M19 10c.638-.636 1-1.515 1-2.486C20 6.582 19.629 5.687 18.969 5.028 18.31 4.369 17.415 3.999 16.483 4 15.513 4 14.636 4.367 14 5")
            addPathData("M11 18l3.499-3.499M16.507 12.493 19 10")
            addPathData("M3 3 21 21")
        }
        return _featherOff!!
    }

private var _featherOff: ImageVector? = null
