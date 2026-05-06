package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandGit: ImageVector
    get() {
        if (_brandGit != null) return _brandGit!!
        _brandGit = tablerOutlineIcon(
            name = "BrandGit",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 12c0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1-.552 0-1 .448-1 1")
            addPathData("M11 8c0 .552 .448 1 1 1 .552 0 1-.448 1-1C13 7.448 12.552 7 12 7c-.552 0-1 .448-1 1")
            addPathData("M11 16c0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1-.552 0-1 .448-1 1")
            addPathData("M12 15v-6")
            addPathData("M15 11 13 9")
            addPathData("M11 7 9.1 5.1")
            addPathData("M13.446 2.6l7.955 7.954c.799 .799 .799 2.093 0 2.892l-7.955 7.955c-.799 .799-2.093 .799-2.892 0L2.599 13.446c-.799-.799-.799-2.093 0-2.892L10.554 2.599c.799-.799 2.093-.799 2.892 0")
        }
        return _brandGit!!
    }

private var _brandGit: ImageVector? = null
