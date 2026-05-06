package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ArchiveX: ImageVector
    get() {
        if (_archiveX != null) return _archiveX!!
        _archiveX = lucideOutlineIcon(
            name = "ArchiveX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 3h18c.552 0 1 .448 1 1v3c0 .552-.448 1-1 1h-18C2.448 8 2 7.552 2 7v-3C2 3.448 2.448 3 3 3Z")
            addPathData("M4 8v11c0 1.105 .895 2 2 2h12c1.105 0 2-.895 2-2v-11")
            addPathData("M9.5 17l5-5")
            addPathData("M9.5 12l5 5")
        }
        return _archiveX!!
    }

private var _archiveX: ImageVector? = null
