package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BubblePlus: ImageVector
    get() {
        if (_bubblePlus != null) return _bubblePlus!!
        _bubblePlus = tablerOutlineIcon(
            name = "BubblePlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12.4 19c-.538 .002-1.071-.099-1.57-.298L7 21v-3.134C6.207 17.683 5.541 17.148 5.192 16.413c-.35-.735-.345-1.589 .013-2.32C3.237 12.961 2.332 10.605 3.034 8.447 3.737 6.288 5.856 4.917 8.113 5.16 9.251 3.623 11.123 2.813 13.022 3.035c1.899 .223 3.534 1.444 4.285 3.203 1.574 .19 2.981 1.07 3.841 2.401 .86 1.331 1.083 2.976 .609 4.489")
            addPathData("M16 19h6")
            addPathData("M19 16v6")
        }
        return _bubblePlus!!
    }

private var _bubblePlus: ImageVector? = null
