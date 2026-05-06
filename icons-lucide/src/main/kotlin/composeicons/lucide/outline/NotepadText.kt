package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.NotepadText: ImageVector
    get() {
        if (_notepadText != null) return _notepadText!!
        _notepadText = lucideOutlineIcon(
            name = "NotepadText",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 2v4")
            addPathData("M12 2v4")
            addPathData("M16 2v4")
            addPathData("M6 4h12c1.105 0 2 .895 2 2v14c0 1.105-.895 2-2 2h-12C4.895 22 4 21.105 4 20v-14C4 4.895 4.895 4 6 4Z")
            addPathData("M8 10h6")
            addPathData("M8 14h8")
            addPathData("M8 18h5")
        }
        return _notepadText!!
    }

private var _notepadText: ImageVector? = null
