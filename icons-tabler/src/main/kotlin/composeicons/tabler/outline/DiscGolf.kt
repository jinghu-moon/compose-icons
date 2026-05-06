package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DiscGolf: ImageVector
    get() {
        if (_discGolf != null) return _discGolf!!
        _discGolf = tablerOutlineIcon(
            name = "DiscGolf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 5h14")
            addPathData("M6 5c.32 6.744 2.74 9.246 6 10")
            addPathData("M18 5c-.32 6.744-2.74 9.246-6 10")
            addPathData("M10 5c0 4.915 .552 7.082 2 10")
            addPathData("M14 5c0 4.915-.552 7.082-2 10")
            addPathData("M12 15v6")
            addPathData("M12 3v2")
            addPathData("M7 16c.64 .64 1.509 1 2.414 1h5.172c.905 0 1.774-.36 2.414-1")
            addPathData("M11 21h2")
        }
        return _discGolf!!
    }

private var _discGolf: ImageVector? = null
