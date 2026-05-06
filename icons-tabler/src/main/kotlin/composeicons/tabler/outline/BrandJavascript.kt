package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandJavascript: ImageVector
    get() {
        if (_brandJavascript != null) return _brandJavascript!!
        _brandJavascript = tablerOutlineIcon(
            name = "BrandJavascript",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20 4 18 18.5l-6 2-6-2L4 4h16")
            addPathData("M7.5 8h3v8l-2-1")
            addPathData("M16.5 8h-2.5c-.276 0-.5 .224-.5 .5v3c0 .276 .224 .5 .5 .5h1.423c.145 0 .282 .063 .377 .172 .095 .109 .138 .254 .118 .398l-.418 2.93-2 .5")
        }
        return _brandJavascript!!
    }

private var _brandJavascript: ImageVector? = null
