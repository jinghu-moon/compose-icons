package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ZodiacCapricorn: ImageVector
    get() {
        if (_zodiacCapricorn != null) return _zodiacCapricorn!!
        _zodiacCapricorn = tablerOutlineIcon(
            name = "ZodiacCapricorn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 4C5.657 4 7 5.343 7 7v9")
            addPathData("M7 7C7 5.343 8.343 4 10 4c1.657 0 3 1.343 3 3v11c0 1.657-1.343 3-3 3")
            addPathData("M13 17c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3 0-1.657-1.343-3-3-3-1.657 0-3 1.343-3 3")
        }
        return _zodiacCapricorn!!
    }

private var _zodiacCapricorn: ImageVector? = null
