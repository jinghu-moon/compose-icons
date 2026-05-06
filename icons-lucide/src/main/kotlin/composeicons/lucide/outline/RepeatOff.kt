package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.RepeatOff: ImageVector
    get() {
        if (_repeatOff != null) return _repeatOff!!
        _repeatOff = lucideOutlineIcon(
            name = "RepeatOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11.656 6h9.344L17 2")
            addPathData("M17.898 17.898c-.295 .068-.596 .102-.898 .102h-14L7 14")
            addPathData("M2 2 22 22")
            addPathData("M21 13v1c0 .393-.057 .783-.171 1.159")
            addPathData("M21 6l-4 4")
            addPathData("M3 11v-1C3 8.137 4.286 6.52 6.102 6.102")
            addPathData("M7 22 3 18")
        }
        return _repeatOff!!
    }

private var _repeatOff: ImageVector? = null
