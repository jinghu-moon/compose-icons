package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Zzz: ImageVector
    get() {
        if (_zzz != null) return _zzz!!
        _zzz = tablerOutlineIcon(
            name = "Zzz",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 12h6L4 20h6")
            addPathData("M14 4h6l-6 8h6")
        }
        return _zzz!!
    }

private var _zzz: ImageVector? = null
