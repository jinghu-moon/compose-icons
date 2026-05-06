package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Award: ImageVector
    get() {
        if (_award != null) return _award!!
        _award = tablerOutlineIcon(
            name = "Award",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 9c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6C18 5.686 15.314 3 12 3 8.686 3 6 5.686 6 9")
            addPathData("M12 15l3.4 5.89 1.598-3.233 3.598 .232L17.196 12")
            addPathData("M6.802 12 3.402 17.89 7 17.657l1.598 3.232L11.998 15")
        }
        return _award!!
    }

private var _award: ImageVector? = null
