package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Fingerprint: ImageVector
    get() {
        if (_fingerprint != null) return _fingerprint!!
        _fingerprint = tablerOutlineIcon(
            name = "Fingerprint",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18.9 7c.904 1.501 1.291 3.258 1.1 5v1c-.001 1.053 .275 2.088 .8 3")
            addPathData("M8 11C8 8.791 9.791 7 12 7c2.209 0 4 1.791 4 4v1c0 2.164 .702 4.269 2 6")
            addPathData("M12 11v2c-.003 2.859 .869 5.651 2.5 8")
            addPathData("M8 15c.245 2.09 .854 4.121 1.8 6")
            addPathData("M4.9 19C4.225 16.73 3.921 14.367 4 12v-1C3.992 8.138 5.514 5.49 7.991 4.055 10.467 2.621 13.521 2.619 16 4.05")
        }
        return _fingerprint!!
    }

private var _fingerprint: ImageVector? = null
