package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.HardDriveDownload: ImageVector
    get() {
        if (_hardDriveDownload != null) return _hardDriveDownload!!
        _hardDriveDownload = lucideOutlineIcon(
            name = "HardDriveDownload",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 2v8")
            addPathData("M16 6l-4 4L8 6")
            addPathData("M4 14h16c1.105 0 2 .895 2 2v4c0 1.105-.895 2-2 2h-16C2.895 22 2 21.105 2 20v-4c0-1.105 .895-2 2-2Z")
            addPathData("M6 18h.01")
            addPathData("M10 18h.01")
        }
        return _hardDriveDownload!!
    }

private var _hardDriveDownload: ImageVector? = null
