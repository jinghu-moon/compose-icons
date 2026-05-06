package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Share2: ImageVector
    get() {
        if (_share2 != null) return _share2!!
        _share2 = tablerOutlineIcon(
            name = "Share2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 9h-1C5.895 9 5 9.895 5 11v8c0 1.105 .895 2 2 2h10c1.105 0 2-.895 2-2v-8C19 9.895 18.105 9 17 9h-1")
            addPathData("M12 14v-11")
            addPathData("M9 6 12 3l3 3")
        }
        return _share2!!
    }

private var _share2: ImageVector? = null
