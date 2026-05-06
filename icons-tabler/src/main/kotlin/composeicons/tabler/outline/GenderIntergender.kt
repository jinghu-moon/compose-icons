package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.GenderIntergender: ImageVector
    get() {
        if (_genderIntergender != null) return _genderIntergender!!
        _genderIntergender = tablerOutlineIcon(
            name = "GenderIntergender",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13.5 11.5 20 18v-4")
            addPathData("M11.5 13.5 18 20")
            addPathData("M9 4c2.761 0 5 2.239 5 5 0 2.761-2.239 5-5 5C6.239 14 4 11.761 4 9 4 6.239 6.239 4 9 4")
            addPathData("M14 20l2-2")
        }
        return _genderIntergender!!
    }

private var _genderIntergender: ImageVector? = null
