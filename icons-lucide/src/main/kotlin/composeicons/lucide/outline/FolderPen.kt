package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FolderPen: ImageVector
    get() {
        if (_folderPen != null) return _folderPen!!
        _folderPen = lucideOutlineIcon(
            name = "FolderPen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2 11.5v-6.5C2 3.895 2.895 3 4 3h3.9c.7 0 1.3 .3 1.7 .9l.8 1.2c.4 .6 1 .9 1.7 .9h7.9c1.105 0 2 .895 2 2v10c0 1.105-.895 2-2 2h-9.5")
            addPathData("M11.378 13.626c.83-.83 .83-2.174 0-3.004-.83-.83-2.174-.83-3.004 0L3.364 15.634c-.238 .238-.412 .531-.506 .854l-.837 2.87c-.051 .175-.003 .364 .126 .494 .129 .129 .318 .178 .494 .126l2.87-.837c.323-.094 .616-.268 .854-.506Z")
        }
        return _folderPen!!
    }

private var _folderPen: ImageVector? = null
