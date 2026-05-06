package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.GenderGenderfluid: ImageVector
    get() {
        if (_genderGenderfluid != null) return _genderGenderfluid!!
        _genderGenderfluid = tablerOutlineIcon(
            name = "GenderGenderfluid",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 15.464c1.238 .726 2.771 .733 4.015 .018 1.245-.715 2.011-2.042 2.008-3.477C16.02 10.569 15.248 9.245 14 8.536 12.089 7.449 9.658 8.109 8.559 10.013 7.459 11.917 8.103 14.352 10 15.464")
            addPathData("M15.464 14 18.464 8.804")
            addPathData("M5.536 15.195 8.536 9.999")
            addPathData("M12 12h.01")
            addPathData("M9 9 3 3")
            addPathData("M5.5 8.5l3-3")
            addPathData("M21 21 15 15")
            addPathData("M17 20l3-3")
            addPathData("M3 7v-4h4")
        }
        return _genderGenderfluid!!
    }

private var _genderGenderfluid: ImageVector? = null
