package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.UsersRound: ImageVector
    get() {
        if (_usersRound != null) return _usersRound!!
        _usersRound = lucideOutlineIcon(
            name = "UsersRound",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18 21c0-4.418-3.582-8-8-8C5.582 13 2 16.582 2 21")
            addPathData("M15 8c0 2.761-2.239 5-5 5C7.239 13 5 10.761 5 8 5 5.239 7.239 3 10 3c2.761 0 5 2.239 5 5Z")
            addPathData("M22 20c0-3.37-2-6.5-4-8 1.335-1.002 2.082-2.604 1.992-4.27C19.902 6.063 18.986 4.551 17.55 3.7")
        }
        return _usersRound!!
    }

private var _usersRound: ImageVector? = null
