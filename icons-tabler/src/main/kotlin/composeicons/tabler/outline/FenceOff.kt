package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FenceOff: ImageVector
    get() {
        if (_fenceOff != null) return _fenceOff!!
        _fenceOff = tablerOutlineIcon(
            name = "FenceOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 12h-8v4h12M20 16v-4h-4")
            addPathData("M6 16v4h4v-4")
            addPathData("M10 12v-2M10 6 8 4 6 6v6")
            addPathData("M14 16v4h4v-2")
            addPathData("M18 12v-6L16 4 14 6v4")
            addPathData("M3 3 21 21")
        }
        return _fenceOff!!
    }

private var _fenceOff: ImageVector? = null
