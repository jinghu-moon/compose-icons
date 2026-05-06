package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.GitFork: ImageVector
    get() {
        if (_gitFork != null) return _gitFork!!
        _gitFork = lucideOutlineIcon(
            name = "GitFork",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 18c0 1.657-1.343 3-3 3C10.343 21 9 19.657 9 18c0-1.657 1.343-3 3-3 1.657 0 3 1.343 3 3Z")
            addPathData("M9 6C9 7.657 7.657 9 6 9 4.343 9 3 7.657 3 6 3 4.343 4.343 3 6 3 7.657 3 9 4.343 9 6Z")
            addPathData("M21 6c0 1.657-1.343 3-3 3C16.343 9 15 7.657 15 6 15 4.343 16.343 3 18 3c1.657 0 3 1.343 3 3Z")
            addPathData("M18 9v2c0 .6-.4 1-1 1h-10C6.4 12 6 11.6 6 11v-2")
            addPathData("M12 12v3")
        }
        return _gitFork!!
    }

private var _gitFork: ImageVector? = null
