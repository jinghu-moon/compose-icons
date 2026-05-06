package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PhoneOff: ImageVector
    get() {
        if (_phoneOff != null) return _phoneOff!!
        _phoneOff = tablerOutlineIcon(
            name = "PhoneOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 21 21 3")
            addPathData("M5.831 14.161C4.154 11.753 3.175 8.929 3 6 3 4.895 3.895 4 5 4h4l2 5L8.5 10.5c.108 .22 .223 .435 .345 .645M10.596 13.422c.843 .84 1.822 1.544 2.904 2.078L15 13l5 2v4c0 1.105-.895 2-2 2C14.098 20.766 10.418 19.109 7.656 16.343")
        }
        return _phoneOff!!
    }

private var _phoneOff: ImageVector? = null
