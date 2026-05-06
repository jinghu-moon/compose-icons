package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HandSanitizer: ImageVector
    get() {
        if (_handSanitizer != null) return _handSanitizer!!
        _handSanitizer = tablerOutlineIcon(
            name = "HandSanitizer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 21h10v-10C17 9.343 15.657 8 14 8h-4C8.343 8 7 9.343 7 11v10")
            addPathData("M15 3h-6C7.895 3 7 3.895 7 5")
            addPathData("M12 3v5")
            addPathData("M12 11v4")
            addPathData("M10 13h4")
        }
        return _handSanitizer!!
    }

private var _handSanitizer: ImageVector? = null
