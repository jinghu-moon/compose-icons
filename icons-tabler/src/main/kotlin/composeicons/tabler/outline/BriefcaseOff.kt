package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BriefcaseOff: ImageVector
    get() {
        if (_briefcaseOff != null) return _briefcaseOff!!
        _briefcaseOff = tablerOutlineIcon(
            name = "BriefcaseOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 7h8c1.105 0 2 .895 2 2v8M19.834 19.818c-.262 .12-.546 .182-.834 .182h-14C3.895 20 3 19.105 3 18v-9C3 7.895 3.895 7 5 7h2")
            addPathData("M8.185 4.158C8.513 3.452 9.221 3 10 3h4c1.105 0 2 .895 2 2v2")
            addPathData("M12 12v.01")
            addPathData("M3 13c3.675 1.852 7.833 2.526 11.905 1.928M18.168 14.165C19.14 13.85 20.087 13.46 21 13")
            addPathData("M3 3 21 21")
        }
        return _briefcaseOff!!
    }

private var _briefcaseOff: ImageVector? = null
