package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandDisqus: ImageVector
    get() {
        if (_brandDisqus != null) return _brandDisqus!!
        _brandDisqus = tablerOutlineIcon(
            name = "BrandDisqus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11.847 21C9.588 21 7.524 20.333 5.928 19h-3.928L3.708 15.734C3.163 14.56 2.949 13.288 2.95 12c0-4.97 3.84-9 8.898-9C16.9 3 21 7.03 21 12c0 4.972-4.098 9-9.153 9")
            addPathData("M11.485 15h-1.485v-6h1.485C13.597 9 15 9.823 15 11.981v.035C15 14.196 13.597 15 11.485 15")
        }
        return _brandDisqus!!
    }

private var _brandDisqus: ImageVector? = null
