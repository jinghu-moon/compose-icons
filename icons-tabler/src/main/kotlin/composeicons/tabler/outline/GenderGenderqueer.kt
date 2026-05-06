package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.GenderGenderqueer: ImageVector
    get() {
        if (_genderGenderqueer != null) return _genderGenderqueer!!
        _genderGenderqueer = tablerOutlineIcon(
            name = "GenderGenderqueer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 11c2.761 0 5 2.239 5 5 0 2.761-2.239 5-5 5C9.239 21 7 18.761 7 16c0-2.761 2.239-5 5-5")
            addPathData("M12 11v-8")
            addPathData("M14.5 4.5l-5 3")
            addPathData("M9.5 4.5l5 3")
        }
        return _genderGenderqueer!!
    }

private var _genderGenderqueer: ImageVector? = null
