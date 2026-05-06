package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.GenderTrasvesti: ImageVector
    get() {
        if (_genderTrasvesti != null) return _genderTrasvesti!!
        _genderTrasvesti = tablerOutlineIcon(
            name = "GenderTrasvesti",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 20c-2.761 0-5-2.239-5-5 0-2.761 2.239-5 5-5 2.761 0 5 2.239 5 5 0 2.761-2.239 5-5 5")
            addPathData("M6 6l5.4 5.4")
            addPathData("M4 8 8 4")
        }
        return _genderTrasvesti!!
    }

private var _genderTrasvesti: ImageVector? = null
