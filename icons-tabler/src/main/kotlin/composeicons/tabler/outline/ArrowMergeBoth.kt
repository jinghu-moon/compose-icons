package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowMergeBoth: ImageVector
    get() {
        if (_arrowMergeBoth != null) return _arrowMergeBoth!!
        _arrowMergeBoth = tablerOutlineIcon(
            name = "ArrowMergeBoth",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 8 12 4 8 8")
            addPathData("M12 20v-16")
            addPathData("M18 18C14 16.667 12 13.333 12 8")
            addPathData("M6 18c4-1.333 6-4.667 6-10")
        }
        return _arrowMergeBoth!!
    }

private var _arrowMergeBoth: ImageVector? = null
