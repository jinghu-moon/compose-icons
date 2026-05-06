package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Webhook: ImageVector
    get() {
        if (_webhook != null) return _webhook!!
        _webhook = tablerOutlineIcon(
            name = "Webhook",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4.876 13.61C3.247 14.631 2.574 16.667 3.275 18.458c.701 1.791 2.577 2.829 4.466 2.472C9.631 20.574 11 18.923 11 17h6")
            addPathData("M15.066 20.502c1.464 .808 3.276 .62 4.543-.471 1.267-1.091 1.722-2.855 1.14-4.423C20.167 14.041 18.672 13 17 13c-.706 0-1.424 .179-2 .5L12 8")
            addPathData("M16 8C16 5.791 14.209 4 12 4 9.791 4 8 5.791 8 8c0 1.506 .77 2.818 2 3.5L7 17")
        }
        return _webhook!!
    }

private var _webhook: ImageVector? = null
