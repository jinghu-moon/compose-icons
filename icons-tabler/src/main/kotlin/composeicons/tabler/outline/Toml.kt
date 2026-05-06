package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Toml: ImageVector
    get() {
        if (_toml != null) return _toml!!
        _toml = tablerOutlineIcon(
            name = "Toml",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M1.499 8h3")
            addPathData("M2.999 8v8")
            addPathData("M8.5 8C9.328 8 10 8.672 10 9.5v5C10 15.328 9.328 16 8.5 16 7.672 16 7 15.328 7 14.5v-5C7 8.672 7.672 8 8.5 8")
            addPathData("M13 16v-8l2 5L17 8v8")
            addPathData("M20 8v8h2.5")
        }
        return _toml!!
    }

private var _toml: ImageVector? = null
