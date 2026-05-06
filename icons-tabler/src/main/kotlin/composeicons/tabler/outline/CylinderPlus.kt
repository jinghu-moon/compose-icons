package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CylinderPlus: ImageVector
    get() {
        if (_cylinderPlus != null) return _cylinderPlus!!
        _cylinderPlus = tablerOutlineIcon(
            name = "CylinderPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 6c0 1.657 3.134 3 7 3 3.866 0 7-1.343 7-3C19 4.343 15.866 3 12 3 8.134 3 5 4.343 5 6")
            addPathData("M5 6v12c0 1.657 3.134 3 7 3 .173 0 .345-.003 .515-.008M19 12v-6")
            addPathData("M16 19h6")
            addPathData("M19 16v6")
        }
        return _cylinderPlus!!
    }

private var _cylinderPlus: ImageVector? = null
