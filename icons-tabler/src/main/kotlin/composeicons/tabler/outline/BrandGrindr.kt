package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandGrindr: ImageVector
    get() {
        if (_brandGrindr != null) return _brandGrindr!!
        _brandGrindr = tablerOutlineIcon(
            name = "BrandGrindr",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13 13.282c0 .492 .784 1.718 2.102 1.718C16.42 15 18 14.034 18 12.938 18 12.121 17.068 12 16.591 12 16.363 12 13 12.111 13 13.282")
            addPathData("M12 21C9.016 21 5.529 18.279 5.37 18.018 3.24 14.528 3 4.315 3 4.315L4.446 3c2.499 .39 5.023 .617 7.554 .68C14.53 3.617 17.053 3.389 19.554 3L21 4.315c0 0-.24 10.213-2.37 13.704C18.47 18.279 14.984 21 12 21")
            addPathData("M11 13.282C11 13.774 10.216 15 8.898 15 7.58 15 6 14.034 6 12.938 6 12.121 6.932 12 7.409 12c.228 0 3.591 .111 3.591 1.282")
        }
        return _brandGrindr!!
    }

private var _brandGrindr: ImageVector? = null
