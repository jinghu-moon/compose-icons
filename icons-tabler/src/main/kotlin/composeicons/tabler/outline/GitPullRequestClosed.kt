package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.GitPullRequestClosed: ImageVector
    get() {
        if (_gitPullRequestClosed != null) return _gitPullRequestClosed!!
        _gitPullRequestClosed = tablerOutlineIcon(
            name = "GitPullRequestClosed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 18c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C8 16.895 7.105 16 6 16c-1.105 0-2 .895-2 2")
            addPathData("M4 6c0 1.105 .895 2 2 2C7.105 8 8 7.105 8 6 8 4.895 7.105 4 6 4 4.895 4 4 4.895 4 6")
            addPathData("M16 18c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
            addPathData("M6 8v8")
            addPathData("M18 11v5")
            addPathData("M16 4l4 4M20 4 16 8")
        }
        return _gitPullRequestClosed!!
    }

private var _gitPullRequestClosed: ImageVector? = null
