package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.InfoSmall: ImageVector
    get() {
        if (_infoSmall != null) return _infoSmall!!
        _infoSmall = tablerOutlineIcon(
            name = "InfoSmall",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 9h.01")
            addPathData("M11 12h1v4h1")
        }
        return _infoSmall!!
    }

private var _infoSmall: ImageVector? = null
