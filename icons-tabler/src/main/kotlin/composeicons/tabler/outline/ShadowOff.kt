package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ShadowOff: ImageVector
    get() {
        if (_shadowOff != null) return _shadowOff!!
        _shadowOff = tablerOutlineIcon(
            name = "ShadowOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5.634 5.638C2.168 9.161 2.191 14.82 5.686 18.314c3.495 3.494 9.153 3.517 12.676 .051M20.042 16.045C21.79 12.577 21.115 8.378 18.369 5.631 15.623 2.885 11.425 2.21 7.956 3.957")
            addPathData("M16 12h2")
            addPathData("M13 15h2")
            addPathData("M13 18h1")
            addPathData("M13 9h4")
            addPathData("M13 6h1")
            addPathData("M3 3 21 21")
        }
        return _shadowOff!!
    }

private var _shadowOff: ImageVector? = null
