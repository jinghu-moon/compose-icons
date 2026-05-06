package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.GenderBigender: ImageVector
    get() {
        if (_genderBigender != null) return _genderBigender!!
        _genderBigender = tablerOutlineIcon(
            name = "GenderBigender",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 11c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4C15 8.791 13.209 7 11 7 8.791 7 7 8.791 7 11")
            addPathData("M19 3 14 8")
            addPathData("M15 3h4v4")
            addPathData("M11 16v6")
            addPathData("M8 19h6")
        }
        return _genderBigender!!
    }

private var _genderBigender: ImageVector? = null
