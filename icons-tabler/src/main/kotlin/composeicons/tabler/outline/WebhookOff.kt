package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.WebhookOff: ImageVector
    get() {
        if (_webhookOff != null) return _webhookOff!!
        _webhookOff = tablerOutlineIcon(
            name = "WebhookOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4.876 13.61C3.247 14.631 2.574 16.667 3.275 18.458c.701 1.791 2.577 2.829 4.466 2.472C9.631 20.574 11 18.923 11 17h6")
            addPathData("M15.066 20.502c1.561 .862 3.503 .586 4.763-.675M21 17c0-2.209-1.791-4-4-4")
            addPathData("M16 8C16 6.383 15.027 4.925 13.534 4.306 12.041 3.686 10.321 4.026 9.176 5.167M8 8c0 1.506 .77 2.818 2 3.5L7 17")
            addPathData("M3 3 21 21")
        }
        return _webhookOff!!
    }

private var _webhookOff: ImageVector? = null
