package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FastForward: ImageVector
    get() {
        if (_fastForward != null) return _fastForward!!
        _fastForward = lucideOutlineIcon(
            name = "FastForward",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 6c0-.809 .487-1.538 1.235-1.847 .747-.309 1.607-.138 2.179 .433l6 6c.781 .781 .781 2.047 0 2.828l-6 6c-.572 .572-1.432 .743-2.179 .433C12.487 19.538 12 18.809 12 18Z")
            addPathData("M2 6C2 5.191 2.487 4.462 3.235 4.153c.747-.309 1.607-.138 2.179 .433l6 6c.781 .781 .781 2.047 0 2.828l-6 6c-.572 .572-1.432 .743-2.179 .433C2.487 19.538 2 18.809 2 18Z")
        }
        return _fastForward!!
    }

private var _fastForward: ImageVector? = null
