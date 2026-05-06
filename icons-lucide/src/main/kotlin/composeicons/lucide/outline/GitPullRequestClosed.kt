package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.GitPullRequestClosed: ImageVector
    get() {
        if (_gitPullRequestClosed != null) return _gitPullRequestClosed!!
        _gitPullRequestClosed = lucideOutlineIcon(
            name = "GitPullRequestClosed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 6C9 7.657 7.657 9 6 9 4.343 9 3 7.657 3 6 3 4.343 4.343 3 6 3 7.657 3 9 4.343 9 6Z")
            addPathData("M6 9v12")
            addPathData("M21 3 15 9")
            addPathData("M21 9 15 3")
            addPathData("M18 11.5v3.5")
            addPathData("M21 18c0 1.657-1.343 3-3 3-1.657 0-3-1.343-3-3 0-1.657 1.343-3 3-3 1.657 0 3 1.343 3 3Z")
        }
        return _gitPullRequestClosed!!
    }

private var _gitPullRequestClosed: ImageVector? = null
