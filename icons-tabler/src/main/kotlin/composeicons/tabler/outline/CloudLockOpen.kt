package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CloudLockOpen: ImageVector
    get() {
        if (_cloudLockOpen != null) return _cloudLockOpen!!
        _cloudLockOpen = tablerOutlineIcon(
            name = "CloudLockOpen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19 18c1.933 0 3.5-1.567 3.5-3.5C22.5 12.567 20.933 11 19 11h-1C18.397 9.232 17.715 7.407 16.212 6.213 14.709 5.02 12.612 4.638 10.712 5.213 8.812 5.788 7.397 7.232 7 9 4.801 8.912 2.845 10.326 2.334 12.373c-.512 2.047 .564 4.154 2.566 5.027")
            addPathData("M8 16c0-.552 .448-1 1-1h6c.552 0 1 .448 1 1v3c0 .552-.448 1-1 1h-6C8.448 20 8 19.552 8 19v-3")
            addPathData("M10 15v-2c-.003-.908 .606-1.704 1.483-1.939 .877-.235 1.802 .151 2.253 .939")
        }
        return _cloudLockOpen!!
    }

private var _cloudLockOpen: ImageVector? = null
