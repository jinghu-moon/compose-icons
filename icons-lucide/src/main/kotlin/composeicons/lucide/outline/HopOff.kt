package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.HopOff: ImageVector
    get() {
        if (_hopOff != null) return _hopOff!!
        _hopOff = lucideOutlineIcon(
            name = "HopOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10.82 16.12c1.69 .6 3.91 .79 5.18 .85 .28 .01 .53-.09 .7-.27")
            addPathData("M11.14 20.57c.52 .24 2.44 1.12 4.08 1.37 .46 .06 .86-.25 .9-.71 .12-1.52-.3-3.43-.5-4.28")
            addPathData("M16.13 21.05c1.65 .63 3.68 .84 4.87 .91 .26 .019 .515-.076 .7-.26")
            addPathData("M17.99 5.52c1.244 1.354 2.303 2.868 3.15 4.5 .109 .24 .093 .518-.043 .744-.136 .226-.374 .37-.637 .386-1.17 .1-2.5 .02-3.9-.25")
            addPathData("M20.57 11.14c.24 .52 1.12 2.44 1.37 4.08 .04 .3-.08 .59-.31 .75")
            addPathData("M4.93 4.93C1.299 8.562 1.009 14.354 4.26 18.33c.35 .43 .96 .4 1.17-.12 .69-1.71 1.07-5.07 1.07-6.71 1.34 .45 3.1 .9 4.88 .62 .182-.026 .35-.11 .48-.24")
            addPathData("M5.52 17.99c1.05 .95 2.91 2.42 4.5 3.15 .24 .109 .518 .093 .744-.043 .226-.136 .37-.374 .386-.637 .2-2.34-.33-5.3-1.57-8.28")
            addPathData("M8.35 2.68c3.368-1.316 7.184-.712 9.98 1.58 .43 .35 .4 .96-.12 1.17-1.5 .6-4.3 .98-6.07 1.05")
            addPathData("M2 2 22 22")
        }
        return _hopOff!!
    }

private var _hopOff: ImageVector? = null
