package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PentagonMinus: ImageVector
    get() {
        if (_pentagonMinus != null) return _pentagonMinus!!
        _pentagonMinus = tablerOutlineIcon(
            name = "PentagonMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12.5 21q-1.82 0-5.458 .005C6.185 21.004 5.426 20.453 5.161 19.638L2.097 10.208C1.833 9.393 2.123 8.5 2.816 7.996L10.837 2.168c.694-.503 1.632-.503 2.326 0l8.021 5.828c.694 .504 .984 1.397 .719 2.212L20.344 15")
            addPathData("M16 19h6")
        }
        return _pentagonMinus!!
    }

private var _pentagonMinus: ImageVector? = null
