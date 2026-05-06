package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.WorldCancel: ImageVector
    get() {
        if (_worldCancel != null) return _worldCancel!!
        _worldCancel = tablerOutlineIcon(
            name = "WorldCancel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21 12C21 8.358 18.806 5.076 15.441 3.684 12.076 2.292 8.204 3.064 5.631 5.641 3.058 8.218 2.292 12.092 3.689 15.455c1.398 3.363 4.684 5.552 8.326 5.545")
            addPathData("M3.6 9h16.8")
            addPathData("M3.6 15h9.9")
            addPathData("M11.5 3c-3.437 5.508-3.437 12.492 0 18")
            addPathData("M12.5 3c1.916 3.068 2.802 6.668 2.53 10.275")
            addPathData("M16 19c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3 0-1.657-1.343-3-3-3-1.657 0-3 1.343-3 3")
            addPathData("M17 21l4-4")
        }
        return _worldCancel!!
    }

private var _worldCancel: ImageVector? = null
