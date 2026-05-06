package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CodePlus: ImageVector
    get() {
        if (_codePlus != null) return _codePlus!!
        _codePlus = tablerOutlineIcon(
            name = "CodePlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 12h6")
            addPathData("M12 9v6")
            addPathData("M6 19C4.895 19 4 18.105 4 17v-4L3 12 4 11v-4C4 5.895 4.895 5 6 5")
            addPathData("M18 19c1.105 0 2-.895 2-2v-4l1-1L20 11v-4C20 5.895 19.105 5 18 5")
        }
        return _codePlus!!
    }

private var _codePlus: ImageVector? = null
