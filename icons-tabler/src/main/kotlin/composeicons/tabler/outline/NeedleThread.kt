package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.NeedleThread: ImageVector
    get() {
        if (_needleThread != null) return _needleThread!!
        _needleThread = tablerOutlineIcon(
            name = "NeedleThread",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 21C2.333 20.333 6.262 14.764 14.785 4.291c.828-1.017 2.155-1.486 3.438-1.214 1.283 .271 2.307 1.237 2.652 2.502 .345 1.265-.045 2.617-1.012 3.503C9.288 17.694 3.667 21.667 3 21")
            addPathData("M17.5 6.5l-1 1")
            addPathData("M17 7C14.667 4.333 13.5 3 12 3 10.5 3 10 4 10 5c0 4 8.161 8.406 6 11-1.056 1.268-3.363 1.285-5.75 .808")
            addPathData("M5.739 15.425C4.346 14.86 2 13.5 2 12")
            addPathData("M19.5 9.5 21 11")
        }
        return _needleThread!!
    }

private var _needleThread: ImageVector? = null
