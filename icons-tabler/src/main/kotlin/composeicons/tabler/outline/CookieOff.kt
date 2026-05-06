package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CookieOff: ImageVector
    get() {
        if (_cookieOff != null) return _cookieOff!!
        _cookieOff = tablerOutlineIcon(
            name = "CookieOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 13v.01")
            addPathData("M12 17v.01")
            addPathData("M12 12v.01")
            addPathData("M18.192 18.187c-.279 .279-.611 .501-.976 .652-1.048 .263-1.787 .483-2.216 .661-.475 .197-1.092 .538-1.852 1.024-.735 .304-1.561 .304-2.296 0C10.05 20.021 9.433 19.68 9 19.5c-.471-.195-1.21-.415-2.216-.66C6.049 18.535 5.465 17.951 5.161 17.216 4.896 16.164 4.676 15.426 4.5 15 4.302 14.521 3.96 13.904 3.476 13.148c-.304-.735-.304-1.561 0-2.296C3.956 10.108 4.296 9.491 4.5 9c.171-.413 .391-1.152 .66-2.216 .151-.363 .371-.693 .649-.971M8.63 4.639C8.77 4.59 8.893 4.544 9 4.5c.458-.19 1.075-.531 1.852-1.024 .735-.304 1.561-.304 2.296 0l2.667 1.104c-1.086 1.429-1.087 3.407-.003 4.837 1.085 1.43 2.989 1.963 4.659 1.303l.053 .132c.304 .735 .304 1.561 0 2.296-.497 .786-.838 1.404-1.024 1.852-.048 .119-.094 .239-.135 .36")
            addPathData("M3 3 21 21")
        }
        return _cookieOff!!
    }

private var _cookieOff: ImageVector? = null
