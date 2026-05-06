package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.RazorElectric: ImageVector
    get() {
        if (_razorElectric != null) return _razorElectric!!
        _razorElectric = tablerOutlineIcon(
            name = "RazorElectric",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 3v2")
            addPathData("M12 3v2")
            addPathData("M16 3v2")
            addPathData("M9 12v6c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3v-6h-6")
            addPathData("M8 5h8L15 9h-6L8 5")
            addPathData("M12 17v1")
        }
        return _razorElectric!!
    }

private var _razorElectric: ImageVector? = null
