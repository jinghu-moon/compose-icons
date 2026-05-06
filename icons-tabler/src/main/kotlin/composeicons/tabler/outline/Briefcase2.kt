package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Briefcase2: ImageVector
    get() {
        if (_briefcase2 != null) return _briefcase2!!
        _briefcase2 = tablerOutlineIcon(
            name = "Briefcase2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 9C3 7.895 3.895 7 5 7h14c1.105 0 2 .895 2 2v9c0 1.105-.895 2-2 2h-14C3.895 20 3 19.105 3 18v-9")
            addPathData("M8 7v-2C8 3.895 8.895 3 10 3h4c1.105 0 2 .895 2 2v2")
        }
        return _briefcase2!!
    }

private var _briefcase2: ImageVector? = null
