package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BlendMode: ImageVector
    get() {
        if (_blendMode != null) return _blendMode!!
        _blendMode = tablerOutlineIcon(
            name = "BlendMode",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 9.5C8 13.09 10.91 16 14.5 16 18.09 16 21 13.09 21 9.5 21 5.91 18.09 3 14.5 3 10.91 3 8 5.91 8 9.5")
            addPathData("M3 14.5C3 18.09 5.91 21 9.5 21 13.09 21 16 18.09 16 14.5 16 10.91 13.09 8 9.5 8 5.91 8 3 10.91 3 14.5")
        }
        return _blendMode!!
    }

private var _blendMode: ImageVector? = null
