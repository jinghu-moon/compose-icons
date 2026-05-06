package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Trident: ImageVector
    get() {
        if (_trident != null) return _trident!!
        _trident = tablerOutlineIcon(
            name = "Trident",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 6 5 4v3c0 3.866 3.134 7 7 7 3.866 0 7-3.134 7-7v-3l2 2")
            addPathData("M12 21v-18L10 5M14 5 12 3")
        }
        return _trident!!
    }

private var _trident: ImageVector? = null
