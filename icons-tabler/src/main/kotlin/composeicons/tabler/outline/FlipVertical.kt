package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FlipVertical: ImageVector
    get() {
        if (_flipVertical != null) return _flipVertical!!
        _flipVertical = tablerOutlineIcon(
            name = "FlipVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 3v18")
            addPathData("M16 7v10h5L16 7")
            addPathData("M8 7v10h-5L8 7")
        }
        return _flipVertical!!
    }

private var _flipVertical: ImageVector? = null
