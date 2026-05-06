package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ZodiacCancer: ImageVector
    get() {
        if (_zodiacCancer != null) return _zodiacCancer!!
        _zodiacCancer = tablerOutlineIcon(
            name = "ZodiacCancer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 12c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3C9 10.343 7.657 9 6 9 4.343 9 3 10.343 3 12")
            addPathData("M15 12c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3C21 10.343 19.657 9 18 9c-1.657 0-3 1.343-3 3")
            addPathData("M3 12C2.7 9.713 4.277 7.492 7.151 6.158 10.025 4.823 13.769 4.573 17 5.5")
            addPathData("M21 12c.3 2.287-1.277 4.508-4.151 5.842C13.975 19.177 10.231 19.427 7 18.5")
        }
        return _zodiacCancer!!
    }

private var _zodiacCancer: ImageVector? = null
