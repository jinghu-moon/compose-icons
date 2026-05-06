package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TableShare: ImageVector
    get() {
        if (_tableShare != null) return _tableShare!!
        _tableShare = tablerOutlineIcon(
            name = "TableShare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 21h-7C3.895 21 3 20.105 3 19v-14C3 3.895 3.895 3 5 3h14c1.105 0 2 .895 2 2v8")
            addPathData("M3 10h18")
            addPathData("M10 3v18")
            addPathData("M16 22l5-5")
            addPathData("M21 21.5v-4.5h-4.5")
        }
        return _tableShare!!
    }

private var _tableShare: ImageVector? = null
