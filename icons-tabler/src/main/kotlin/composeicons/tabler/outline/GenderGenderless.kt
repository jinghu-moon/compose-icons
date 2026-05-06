package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.GenderGenderless: ImageVector
    get() {
        if (_genderGenderless != null) return _genderGenderless!!
        _genderGenderless = tablerOutlineIcon(
            name = "GenderGenderless",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 10c2.761 0 5 2.239 5 5 0 2.761-2.239 5-5 5C9.239 20 7 17.761 7 15c0-2.761 2.239-5 5-5")
            addPathData("M12 10v-7")
            addPathData("M7 15h10")
        }
        return _genderGenderless!!
    }

private var _genderGenderless: ImageVector? = null
