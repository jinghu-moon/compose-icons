package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Disabled: ImageVector
    get() {
        if (_disabled != null) return _disabled!!
        _disabled = tablerOutlineIcon(
            name = "Disabled",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 5c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C13 3.895 12.105 3 11 3 9.895 3 9 3.895 9 5")
            addPathData("M11 7v8h4l4 5")
            addPathData("M11 11h5")
            addPathData("M7 11.5c-1.965 .814-3.2 2.782-3.079 4.905 .121 2.123 1.573 3.938 3.618 4.522C9.584 21.512 11.775 20.738 13 19")
        }
        return _disabled!!
    }

private var _disabled: ImageVector? = null
