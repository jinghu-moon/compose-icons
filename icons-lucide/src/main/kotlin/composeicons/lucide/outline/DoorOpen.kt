package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.DoorOpen: ImageVector
    get() {
        if (_doorOpen != null) return _doorOpen!!
        _doorOpen = lucideOutlineIcon(
            name = "DoorOpen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 20h-9")
            addPathData("M11 4.562v16.157c0 .308 .142 .598 .384 .788 .243 .189 .559 .257 .858 .182L19 20v-14.438C19 4.644 18.375 3.845 17.485 3.622l-4-1c-.597-.149-1.23-.015-1.715 .364-.485 .379-.769 .96-.77 1.575Z")
            addPathData("M11 4h-3C6.895 4 6 4.895 6 6v14")
            addPathData("M14 12h.01")
            addPathData("M22 20h-3")
        }
        return _doorOpen!!
    }

private var _doorOpen: ImageVector? = null
