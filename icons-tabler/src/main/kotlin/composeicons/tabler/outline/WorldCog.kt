package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.WorldCog: ImageVector
    get() {
        if (_worldCog != null) return _worldCog!!
        _worldCog = tablerOutlineIcon(
            name = "WorldCog",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21 12C21 8.358 18.805 5.075 15.439 3.683 12.074 2.291 8.201 3.065 5.629 5.644 3.056 8.222 2.291 12.096 3.691 15.459c1.4 3.362 4.688 5.55 8.33 5.541")
            addPathData("M3.6 9h16.8")
            addPathData("M3.6 15h8.9")
            addPathData("M11.5 3c-3.437 5.508-3.437 12.492 0 18")
            addPathData("M12.5 3c1.934 3.098 2.818 6.736 2.522 10.376")
            addPathData("M17.001 19c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
            addPathData("M19.001 15.5v1.5")
            addPathData("M19.001 21v1.5")
            addPathData("M22.032 17.25 20.733 18")
            addPathData("M17.27 20l-1.3 .75")
            addPathData("M15.97 17.25 17.27 18")
            addPathData("M20.733 20l1.3 .75")
        }
        return _worldCog!!
    }

private var _worldCog: ImageVector? = null
