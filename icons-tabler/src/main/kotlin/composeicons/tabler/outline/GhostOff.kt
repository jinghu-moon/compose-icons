package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.GhostOff: ImageVector
    get() {
        if (_ghostOff != null) return _ghostOff!!
        _ghostOff = tablerOutlineIcon(
            name = "GhostOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8.794 4.776c2.17-1.118 4.766-1.025 6.851 .246C17.729 6.293 19 8.559 19 11v4M18.88 18.898c-.233 .569-.744 .977-1.35 1.079-.606 .102-1.223-.116-1.63-.577-.313-.4-.792-.634-1.3-.634-.508 0-.987 .234-1.3 .634-.313 .4-.792 .634-1.3 .634-.508 0-.987-.234-1.3-.634-.313-.4-.792-.634-1.3-.634-.508 0-.987 .234-1.3 .634-.517 .585-1.355 .765-2.066 .444C5.322 19.522 4.903 18.775 5 18v-7C5 9.317 5.594 7.773 6.583 6.566")
            addPathData("M14 10h.01")
            addPathData("M10 14c1.202 .837 2.798 .837 4 0")
            addPathData("M3 3 21 21")
        }
        return _ghostOff!!
    }

private var _ghostOff: ImageVector? = null
