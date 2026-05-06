package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.GitPullRequestCreate: ImageVector
    get() {
        if (_gitPullRequestCreate != null) return _gitPullRequestCreate!!
        _gitPullRequestCreate = lucideOutlineIcon(
            name = "GitPullRequestCreate",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 6C9 7.657 7.657 9 6 9 4.343 9 3 7.657 3 6 3 4.343 4.343 3 6 3 7.657 3 9 4.343 9 6Z")
            addPathData("M6 9v12")
            addPathData("M13 6h3c1.105 0 2 .895 2 2v3")
            addPathData("M18 15v6")
            addPathData("M21 18h-6")
        }
        return _gitPullRequestCreate!!
    }

private var _gitPullRequestCreate: ImageVector? = null
