package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CakeRoll: ImageVector
    get() {
        if (_cakeRoll != null) return _cakeRoll!!
        _cakeRoll = tablerOutlineIcon(
            name = "CakeRoll",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 15C7.03 15 3 12.538 3 9.5 3 6.462 7.03 4 12 4c4.97 0 9 2.462 9 5.5C21 12.538 16.97 15 12 15")
            addPathData("M12 6.97c3 0 4 1.036 4 1.979 0 2.805-8 2.969-8-.99C8 5.849 9.5 4 12 4")
            addPathData("M21 9.333v5.334C21 17.612 16.97 20 12 20 7.03 20 3 17.612 3 14.667v-5.334")
        }
        return _cakeRoll!!
    }

private var _cakeRoll: ImageVector? = null
