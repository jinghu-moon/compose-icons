package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Trademark: ImageVector
    get() {
        if (_trademark != null) return _trademark!!
        _trademark = tablerOutlineIcon(
            name = "Trademark",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4.5 9h5M7 9v6")
            addPathData("M13 15v-6l3 4L19 9v6")
        }
        return _trademark!!
    }

private var _trademark: ImageVector? = null
