package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.AerialLift: ImageVector
    get() {
        if (_aerialLift != null) return _aerialLift!!
        _aerialLift = tablerOutlineIcon(
            name = "AerialLift",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 5 20 3")
            addPathData("M12 4v10")
            addPathData("M6.894 8h10.306c2.45 3 2.45 9-.2 12h-10.106C4.35 17 4.35 11 6.894 8")
            addPathData("M5 14h14")
        }
        return _aerialLift!!
    }

private var _aerialLift: ImageVector? = null
