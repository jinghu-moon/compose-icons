package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SunMoon: ImageVector
    get() {
        if (_sunMoon != null) return _sunMoon!!
        _sunMoon = tablerOutlineIcon(
            name = "SunMoon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9.173 14.83C7.611 13.268 7.611 10.735 9.173 9.173c1.562-1.562 4.095-1.562 5.657 0")
            addPathData("M11.294 12.707l.174 .247c2.035 2.751 5.673 3.776 8.845 2.492-1.152 2.773-3.612 4.789-6.558 5.374-2.945 .585-5.989-.338-8.113-2.46")
            addPathData("M3 12h1")
            addPathData("M12 3v1")
            addPathData("M5.6 5.6l.7 .7")
            addPathData("M3 21 21 3")
        }
        return _sunMoon!!
    }

private var _sunMoon: ImageVector? = null
