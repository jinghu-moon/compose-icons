package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Windmill: ImageVector
    get() {
        if (_windmill != null) return _windmill!!
        _windmill = tablerOutlineIcon(
            name = "Windmill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 12c2.76 0 5-2.01 5-4.5C17 5.01 14.76 3 12 3v9")
            addPathData("M12 12c0 2.76 2.01 5 4.5 5C18.99 17 21 14.76 21 12h-9")
            addPathData("M12 12C9.24 12 7 14.01 7 16.5 7 18.99 9.24 21 12 21v-9")
            addPathData("M12 12C12 9.24 9.99 7 7.5 7 5.01 7 3 9.24 3 12h9")
        }
        return _windmill!!
    }

private var _windmill: ImageVector? = null
