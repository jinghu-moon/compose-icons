package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.GenderTransgender: ImageVector
    get() {
        if (_genderTransgender != null) return _genderTransgender!!
        _genderTransgender = tablerOutlineIcon(
            name = "GenderTransgender",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 12c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4C16 9.791 14.209 8 12 8 9.791 8 8 9.791 8 12")
            addPathData("M15 9 21 3")
            addPathData("M21 7v-4h-4")
            addPathData("M9 9 3 3")
            addPathData("M3 7v-4h4")
            addPathData("M5.5 8.5l3-3")
            addPathData("M12 16v5")
            addPathData("M9.5 19h5")
        }
        return _genderTransgender!!
    }

private var _genderTransgender: ImageVector? = null
