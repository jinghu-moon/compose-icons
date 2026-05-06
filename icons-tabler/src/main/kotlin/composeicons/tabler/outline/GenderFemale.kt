package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.GenderFemale: ImageVector
    get() {
        if (_genderFemale != null) return _genderFemale!!
        _genderFemale = tablerOutlineIcon(
            name = "GenderFemale",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 9c0 2.761 2.239 5 5 5 2.761 0 5-2.239 5-5C17 6.239 14.761 4 12 4 9.239 4 7 6.239 7 9")
            addPathData("M12 14v7")
            addPathData("M9 18h6")
        }
        return _genderFemale!!
    }

private var _genderFemale: ImageVector? = null
