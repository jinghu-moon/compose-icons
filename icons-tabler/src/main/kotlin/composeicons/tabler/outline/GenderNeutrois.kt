package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.GenderNeutrois: ImageVector
    get() {
        if (_genderNeutrois != null) return _genderNeutrois!!
        _genderNeutrois = tablerOutlineIcon(
            name = "GenderNeutrois",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 10c2.761 0 5 2.239 5 5 0 2.761-2.239 5-5 5C9.239 20 7 17.761 7 15c0-2.761 2.239-5 5-5")
            addPathData("M12 10v-7")
        }
        return _genderNeutrois!!
    }

private var _genderNeutrois: ImageVector? = null
