package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PremiumRights: ImageVector
    get() {
        if (_premiumRights != null) return _premiumRights!!
        _premiumRights = tablerOutlineIcon(
            name = "PremiumRights",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 12c0 4.971 4.029 9 9 9 4.971 0 9-4.029 9-9C21 7.029 16.971 3 12 3 7.029 3 3 7.029 3 12")
            addPathData("M13.867 9.75C13.621 9.27 13.159 8.981 12.667 9h-1.334C10.597 9 10 9.67 10 10.5c0 .827 .597 1.499 1.333 1.499h1.334c.736 0 1.333 .671 1.333 1.5 0 .828-.597 1.499-1.333 1.499h-1.334c-.492 .019-.954-.27-1.2-.75")
            addPathData("M12 7v2")
            addPathData("M12 15v2")
        }
        return _premiumRights!!
    }

private var _premiumRights: ImageVector? = null
