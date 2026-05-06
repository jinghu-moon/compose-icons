package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.UserCheck: ImageVector
    get() {
        if (_userCheck != null) return _userCheck!!
        _userCheck = lucideOutlineIcon(
            name = "UserCheck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 11l2 2L22 9")
            addPathData("M16 21v-2c0-2.209-1.791-4-4-4h-6C3.791 15 2 16.791 2 19v2")
            addPathData("M13 7c0 2.209-1.791 4-4 4C6.791 11 5 9.209 5 7 5 4.791 6.791 3 9 3c2.209 0 4 1.791 4 4Z")
        }
        return _userCheck!!
    }

private var _userCheck: ImageVector? = null
