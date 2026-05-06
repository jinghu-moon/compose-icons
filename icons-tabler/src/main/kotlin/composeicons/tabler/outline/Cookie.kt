package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Cookie: ImageVector
    get() {
        if (_cookie != null) return _cookie!!
        _cookie = tablerOutlineIcon(
            name = "Cookie",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 13v.01")
            addPathData("M12 17v.01")
            addPathData("M12 12v.01")
            addPathData("M16 14v.01")
            addPathData("M11 8v.01")
            addPathData("M13.148 3.476l2.667 1.104c-1.086 1.429-1.087 3.407-.003 4.837 1.085 1.43 2.989 1.963 4.659 1.303l.053 .132c.304 .735 .304 1.561 0 2.296Q19.779 14.328 19.5 15q-.283 .684-.66 2.216c-.305 .735-.889 1.319-1.624 1.623q-1.572 .394-2.216 .661-.712 .295-1.852 1.024c-.735 .304-1.561 .304-2.296 0Q9.649 19.77 9 19.5q-.707-.292-2.216-.66C6.049 18.535 5.465 17.951 5.161 17.216Q4.764 15.639 4.5 15 4.202 14.282 3.476 13.148c-.304-.735-.304-1.561 0-2.296Q4.195 9.736 4.5 9q.257-.62 .66-2.216C5.465 6.049 6.049 5.465 6.784 5.161Q8.331 4.777 9 4.5q.687-.285 1.852-1.024c.735-.304 1.561-.304 2.296 0")
        }
        return _cookie!!
    }

private var _cookie: ImageVector? = null
