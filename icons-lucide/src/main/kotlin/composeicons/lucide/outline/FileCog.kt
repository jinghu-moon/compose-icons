package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FileCog: ImageVector
    get() {
        if (_fileCog != null) return _fileCog!!
        _fileCog = lucideOutlineIcon(
            name = "FileCog",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 8C14.448 8 14 7.552 14 7v-5c.639-.001 1.253 .253 1.704 .706l3.588 3.588c.454 .451 .709 1.066 .708 1.706Z")
            addPathData("M20 8v12c0 1.105-.895 2-2 2h-4.182")
            addPathData("M3.305 19.53l.923-.382")
            addPathData("M4 10.592v-6.592C4 2.895 4.895 2 6 2h8")
            addPathData("M4.228 16.852l-.924-.383")
            addPathData("M5.852 15.228l-.383-.923")
            addPathData("M5.852 20.772l-.383 .924")
            addPathData("M8.148 15.228l.383-.923")
            addPathData("M8.53 21.696l-.382-.924")
            addPathData("M9.773 16.852l.922-.383")
            addPathData("M9.773 19.148l.922 .383")
            addPathData("M10 18c0 1.657-1.343 3-3 3C5.343 21 4 19.657 4 18 4 16.343 5.343 15 7 15c1.657 0 3 1.343 3 3Z")
        }
        return _fileCog!!
    }

private var _fileCog: ImageVector? = null
