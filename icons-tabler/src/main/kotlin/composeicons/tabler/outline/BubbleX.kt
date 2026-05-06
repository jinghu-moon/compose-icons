package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BubbleX: ImageVector
    get() {
        if (_bubbleX != null) return _bubbleX!!
        _bubbleX = tablerOutlineIcon(
            name = "BubbleX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13.5 18.75c-.345 .09-.727 .25-1.1 .25-.537-0-1.07-.101-1.57-.298L7 21v-3.134C6.207 17.683 5.541 17.148 5.192 16.413c-.35-.735-.345-1.589 .013-2.32C3.237 12.961 2.332 10.605 3.034 8.447 3.737 6.288 5.856 4.917 8.113 5.16 9.251 3.623 11.123 2.813 13.022 3.035c1.899 .223 3.534 1.444 4.285 3.203 1.553 .187 2.946 1.047 3.809 2.352 .863 1.305 1.11 2.923 .675 4.426")
            addPathData("M22 22 17 17")
            addPathData("M17 22l5-5")
        }
        return _bubbleX!!
    }

private var _bubbleX: ImageVector? = null
