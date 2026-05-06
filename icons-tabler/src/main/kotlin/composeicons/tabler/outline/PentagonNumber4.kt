package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PentagonNumber4: ImageVector
    get() {
        if (_pentagonNumber4 != null) return _pentagonNumber4!!
        _pentagonNumber4 = tablerOutlineIcon(
            name = "PentagonNumber4",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13.163 2.168l8.021 5.828c.694 .504 .984 1.397 .719 2.212l-3.064 9.43c-.265 .815-1.024 1.367-1.881 1.367h-9.916C6.185 21.005 5.426 20.453 5.161 19.638L2.097 10.208C1.832 9.393 2.122 8.5 2.816 7.996L10.837 2.168c.693-.504 1.633-.504 2.326 0")
            addPathData("M10 8v3c0 .552 .448 1 1 1h3")
            addPathData("M14 8v8")
        }
        return _pentagonNumber4!!
    }

private var _pentagonNumber4: ImageVector? = null
