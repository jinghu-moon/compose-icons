package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MapShield: ImageVector
    get() {
        if (_mapShield != null) return _mapShield!!
        _mapShield = tablerOutlineIcon(
            name = "MapShield",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 11C15 9.343 13.657 8 12 8 10.343 8 9 9.343 9 11c0 1.657 1.343 3 3 3")
            addPathData("M12.249 21.47c-.612 .077-1.226-.134-1.662-.57L6.343 16.657C3.798 14.112 3.266 10.18 5.043 7.05 6.821 3.919 10.47 2.362 13.96 3.244c3.49 .882 5.961 3.986 6.038 7.585")
            addPathData("M22 16c0 4-2.5 6-3.5 6C17.5 22 15 20 15 16c1 0 2.5-.5 3.5-1.5C19.5 15.5 21 16 22 16")
        }
        return _mapShield!!
    }

private var _mapShield: ImageVector? = null
