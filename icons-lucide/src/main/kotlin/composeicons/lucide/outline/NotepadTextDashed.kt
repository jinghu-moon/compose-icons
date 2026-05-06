package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.NotepadTextDashed: ImageVector
    get() {
        if (_notepadTextDashed != null) return _notepadTextDashed!!
        _notepadTextDashed = lucideOutlineIcon(
            name = "NotepadTextDashed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 2v4")
            addPathData("M12 2v4")
            addPathData("M16 2v4")
            addPathData("M16 4h2c1.105 0 2 .895 2 2v2")
            addPathData("M20 12v2")
            addPathData("M20 18v2c0 1.105-.895 2-2 2h-1")
            addPathData("M13 22h-2")
            addPathData("M7 22h-1C4.895 22 4 21.105 4 20v-2")
            addPathData("M4 14v-2")
            addPathData("M4 8v-2C4 4.895 4.895 4 6 4h2")
            addPathData("M8 10h6")
            addPathData("M8 14h8")
            addPathData("M8 18h5")
        }
        return _notepadTextDashed!!
    }

private var _notepadTextDashed: ImageVector? = null
