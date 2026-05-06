package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandOauth: ImageVector
    get() {
        if (_brandOauth != null) return _brandOauth!!
        _brandOauth = tablerOutlineIcon(
            name = "BrandOauth",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2 12c0 5.523 4.477 10 10 10 5.523 0 10-4.477 10-10C22 6.477 17.523 2 12 2 6.477 2 2 6.477 2 12")
            addPathData("M12.556 6c.65 0 1.235 .373 1.508 .947l2.839 7.848c.148 .413 .124 .869-.066 1.264-.19 .396-.53 .7-.944 .844-.806 .286-1.697-.081-2.068-.851L13.365 15h-2.73l-.398 .905c-.294 .803-1.148 1.254-1.977 1.045l-.153-.047C7.302 16.623 6.844 15.774 7.051 14.947L9.875 7.095c.22-.604 .769-1.027 1.409-1.087L12.556 6")
        }
        return _brandOauth!!
    }

private var _brandOauth: ImageVector? = null
