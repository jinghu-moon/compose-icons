package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.UserLock: ImageVector
    get() {
        if (_userLock != null) return _userLock!!
        _userLock = lucideOutlineIcon(
            name = "UserLock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19 16v-2c0-1.105-.895-2-2-2-1.105 0-2 .895-2 2v2")
            addPathData("M9.5 15h-2.5C4.791 15 3 16.791 3 19v2")
            addPathData("M14 7c0 2.209-1.791 4-4 4C7.791 11 6 9.209 6 7 6 4.791 7.791 3 10 3c2.209 0 4 1.791 4 4Z")
            addPathData("M13.899 16h6.202c.238 0 .467 .095 .636 .263 .169 .169 .263 .397 .263 .636v3.202c0 .238-.095 .467-.263 .636-.169 .169-.397 .263-.636 .263h-6.202c-.238 0-.467-.095-.636-.263C13.095 20.568 13 20.339 13 20.101v-3.202c0-.238 .095-.467 .263-.636 .169-.169 .397-.263 .636-.263Z")
        }
        return _userLock!!
    }

private var _userLock: ImageVector? = null
