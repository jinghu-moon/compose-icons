package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TagPlus: ImageVector
    get() {
        if (_tagPlus != null) return _tagPlus!!
        _tagPlus = tablerOutlineIcon(
            name = "TagPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6.5 7.5c0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1-.552 0-1 .448-1 1")
            addPathData("M21.002 13c0-.617-.235-1.233-.706-1.704L12.586 3.586C12.211 3.211 11.702 3 11.172 3h-5.172C4.343 3 3 4.343 3 6v5.172c0 .53 .211 1.039 .586 1.414l7.71 7.71c.471 .47 1.087 .706 1.704 .706")
            addPathData("M16 19h6")
            addPathData("M19 16v6")
        }
        return _tagPlus!!
    }

private var _tagPlus: ImageVector? = null
