package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.GitPullRequestCreateArrow: ImageVector
    get() {
        if (_gitPullRequestCreateArrow != null) return _gitPullRequestCreateArrow!!
        _gitPullRequestCreateArrow = lucideOutlineIcon(
            name = "GitPullRequestCreateArrow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 6C8 7.657 6.657 9 5 9 3.343 9 2 7.657 2 6 2 4.343 3.343 3 5 3 6.657 3 8 4.343 8 6Z")
            addPathData("M5 9v12")
            addPathData("M15 9 12 6 15 3")
            addPathData("M12 6h5c1.105 0 2 .895 2 2v3")
            addPathData("M19 15v6")
            addPathData("M22 18h-6")
        }
        return _gitPullRequestCreateArrow!!
    }

private var _gitPullRequestCreateArrow: ImageVector? = null
