package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.AlertSmall: ImageVector
    get() {
        if (_alertSmall != null) return _alertSmall!!
        _alertSmall = tablerOutlineIcon(
            name = "AlertSmall",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 8v4")
            addPathData("M12 16h.01")
        }
        return _alertSmall!!
    }

private var _alertSmall: ImageVector? = null
