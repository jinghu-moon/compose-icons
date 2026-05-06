package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PentagonPlus: ImageVector
    get() {
        if (_pentagonPlus != null) return _pentagonPlus!!
        _pentagonPlus = tablerOutlineIcon(
            name = "PentagonPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12.5 21.005h-5.458C6.185 21.005 5.426 20.453 5.161 19.638L2.097 10.208C1.832 9.393 2.122 8.5 2.816 7.996L10.837 2.168c.693-.504 1.633-.504 2.326 0l8.021 5.828c.694 .504 .984 1.397 .719 2.212l-.78 2.401")
            addPathData("M16 19h6")
            addPathData("M19 16v6")
        }
        return _pentagonPlus!!
    }

private var _pentagonPlus: ImageVector? = null
