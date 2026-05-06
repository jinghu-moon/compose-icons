package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CashOff: ImageVector
    get() {
        if (_cashOff != null) return _cashOff!!
        _cashOff = tablerOutlineIcon(
            name = "CashOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13 9h6c1.105 0 2 .895 2 2v6M19 19h-10C7.895 19 7 18.105 7 17v-6C7 9.895 7.895 9 9 9")
            addPathData("M12.582 12.59c-.757 .785-.746 2.033 .026 2.804 .772 .771 2.019 .781 2.804 .022")
            addPathData("M17 9v-2C17 5.895 16.105 5 15 5h-6M5 5C3.895 5 3 5.895 3 7v6c0 1.105 .895 2 2 2h2")
            addPathData("M3 3 21 21")
        }
        return _cashOff!!
    }

private var _cashOff: ImageVector? = null
