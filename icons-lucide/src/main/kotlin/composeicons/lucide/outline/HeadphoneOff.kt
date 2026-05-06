package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.HeadphoneOff: ImageVector
    get() {
        if (_headphoneOff != null) return _headphoneOff!!
        _headphoneOff = lucideOutlineIcon(
            name = "HeadphoneOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21 14h-1.343")
            addPathData("M9.128 3.47c2.746-.925 5.77-.47 8.124 1.22C19.605 6.381 21 9.102 21 12v3.343")
            addPathData("M2 2 22 22")
            addPathData("M20.414 20.414c-.375 .375-.884 .586-1.414 .586h-1c-1.105 0-2-.895-2-2v-3")
            addPathData("M3 14h3c1.105 0 2 .895 2 2v3c0 1.105-.895 2-2 2h-1C3.895 21 3 20.105 3 19v-7C3 9.613 3.948 7.324 5.636 5.636")
        }
        return _headphoneOff!!
    }

private var _headphoneOff: ImageVector? = null
