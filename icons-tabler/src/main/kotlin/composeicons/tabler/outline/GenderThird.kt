package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.GenderThird: ImageVector
    get() {
        if (_genderThird != null) return _genderThird!!
        _genderThird = tablerOutlineIcon(
            name = "GenderThird",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 12c0 2.761 2.239 5 5 5 2.761 0 5-2.239 5-5C21 9.239 18.761 7 16 7c-2.761 0-5 2.239-5 5")
            addPathData("M11 12h-3")
            addPathData("M8 12 3 8v8L8 12")
        }
        return _genderThird!!
    }

private var _genderThird: ImageVector? = null
