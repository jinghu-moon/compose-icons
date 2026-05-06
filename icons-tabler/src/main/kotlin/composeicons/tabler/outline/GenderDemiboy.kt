package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.GenderDemiboy: ImageVector
    get() {
        if (_genderDemiboy != null) return _genderDemiboy!!
        _genderDemiboy = tablerOutlineIcon(
            name = "GenderDemiboy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 14c0 2.761 2.239 5 5 5 2.761 0 5-2.239 5-5C15 11.239 12.761 9 10 9 7.239 9 5 11.239 5 14")
            addPathData("M19 5l-5.4 5.4")
            addPathData("M19 5h-5")
        }
        return _genderDemiboy!!
    }

private var _genderDemiboy: ImageVector? = null
