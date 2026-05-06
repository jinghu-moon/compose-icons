package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.GitCommitHorizontal: ImageVector
    get() {
        if (_gitCommitHorizontal != null) return _gitCommitHorizontal!!
        _gitCommitHorizontal = lucideOutlineIcon(
            name = "GitCommitHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 12c0 1.657-1.343 3-3 3C10.343 15 9 13.657 9 12 9 10.343 10.343 9 12 9c1.657 0 3 1.343 3 3Z")
            addPathData("M3 12h6")
            addPathData("M15 12h6")
        }
        return _gitCommitHorizontal!!
    }

private var _gitCommitHorizontal: ImageVector? = null
