package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Balloon: ImageVector
    get() {
        if (_balloon != null) return _balloon!!
        _balloon = tablerOutlineIcon(
            name = "Balloon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 8C14 6.895 13.105 6 12 6")
            addPathData("M6 8C6 4.686 8.686 2 12 2c3.314 0 6 2.686 6 6 0 4.97-2.686 9-6 9C8.686 17 6 12.97 6 8")
            addPathData("M12 17v1c0 1.105-.895 2-2 2h-3c-1.105 0-2 .895-2 2")
        }
        return _balloon!!
    }

private var _balloon: ImageVector? = null
