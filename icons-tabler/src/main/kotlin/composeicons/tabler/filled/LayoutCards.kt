package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.LayoutCards: ImageVector
    get() {
        if (_layoutCards != null) return _layoutCards!!
        _layoutCards = tablerFilledIcon(
            name = "LayoutCards",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 3c1.657 0 3 1.343 3 3v12c0 1.657-1.343 3-3 3h-2C4.343 21 3 19.657 3 18v-12C3 4.343 4.343 3 6 3Z")
            addPathData("M18 3c1.657 0 3 1.343 3 3v6c0 1.657-1.343 3-3 3h-2c-1.657 0-3-1.343-3-3v-6C13 4.343 14.343 3 16 3Z")
        }
        return _layoutCards!!
    }

private var _layoutCards: ImageVector? = null
