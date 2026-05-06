package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Rewind: ImageVector
    get() {
        if (_rewind != null) return _rewind!!
        _rewind = lucideOutlineIcon(
            name = "Rewind",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 6C12 5.191 11.513 4.462 10.765 4.153 10.018 3.843 9.158 4.014 8.586 4.586L2.586 10.586c-.781 .781-.781 2.047 0 2.828l6 6c.572 .572 1.432 .743 2.179 .433C11.513 19.538 12 18.809 12 18Z")
            addPathData("M22 6C22 5.191 21.513 4.462 20.765 4.153c-.747-.309-1.607-.138-2.179 .433l-6 6c-.781 .781-.781 2.047 0 2.828l6 6c.572 .572 1.432 .743 2.179 .433C21.513 19.538 22 18.809 22 18Z")
        }
        return _rewind!!
    }

private var _rewind: ImageVector? = null
