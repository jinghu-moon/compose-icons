package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CubeUnfolded: ImageVector
    get() {
        if (_cubeUnfolded != null) return _cubeUnfolded!!
        _cubeUnfolded = tablerOutlineIcon(
            name = "CubeUnfolded",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2 15h10v5h5v-5h5v-5h-10v-5h-5v5h-5v5")
            addPathData("M7 15v-5h5v5h5v-5")
        }
        return _cubeUnfolded!!
    }

private var _cubeUnfolded: ImageVector? = null
