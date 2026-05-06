package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.MemoryStick: ImageVector
    get() {
        if (_memoryStick != null) return _memoryStick!!
        _memoryStick = lucideOutlineIcon(
            name = "MemoryStick",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 12v-2")
            addPathData("M12 18v-2")
            addPathData("M16 12v-2")
            addPathData("M16 18v-2")
            addPathData("M2 11h1.5")
            addPathData("M20 18v-2")
            addPathData("M20.5 11h1.5")
            addPathData("M4 18v-2")
            addPathData("M8 12v-2")
            addPathData("M8 18v-2")
            addPathData("M4 6h16c1.105 0 2 .895 2 2v6c0 1.105-.895 2-2 2h-16C2.895 16 2 15.105 2 14v-6C2 6.895 2.895 6 4 6Z")
        }
        return _memoryStick!!
    }

private var _memoryStick: ImageVector? = null
