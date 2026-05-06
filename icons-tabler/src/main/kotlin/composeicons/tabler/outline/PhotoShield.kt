package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PhotoShield: ImageVector
    get() {
        if (_photoShield != null) return _photoShield!!
        _photoShield = tablerOutlineIcon(
            name = "PhotoShield",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 8h.01")
            addPathData("M11.5 20h-4.5C5.343 20 4 18.657 4 17v-10C4 5.343 5.343 4 7 4h10c1.657 0 3 1.343 3 3v4")
            addPathData("M4 15 8 11c.928-.893 2.072-.893 3 0l1.5 1.5")
            addPathData("M22 16c0 4-2.5 6-3.5 6C17.5 22 15 20 15 16c1 0 2.5-.5 3.5-1.5C19.5 15.5 21 16 22 16")
        }
        return _photoShield!!
    }

private var _photoShield: ImageVector? = null
