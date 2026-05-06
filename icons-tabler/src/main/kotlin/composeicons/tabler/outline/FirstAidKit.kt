package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FirstAidKit: ImageVector
    get() {
        if (_firstAidKit != null) return _firstAidKit!!
        _firstAidKit = tablerOutlineIcon(
            name = "FirstAidKit",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 8v-2C8 4.895 8.895 4 10 4h4c1.105 0 2 .895 2 2v2")
            addPathData("M4 10C4 8.895 4.895 8 6 8h12c1.105 0 2 .895 2 2v8c0 1.105-.895 2-2 2h-12C4.895 20 4 19.105 4 18v-8")
            addPathData("M10 14h4")
            addPathData("M12 12v4")
        }
        return _firstAidKit!!
    }

private var _firstAidKit: ImageVector? = null
