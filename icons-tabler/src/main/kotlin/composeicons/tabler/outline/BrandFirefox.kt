package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandFirefox: ImageVector
    get() {
        if (_brandFirefox != null) return _brandFirefox!!
        _brandFirefox = tablerOutlineIcon(
            name = "BrandFirefox",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4.028 7.82c-2.262 4.313-.683 9.642 3.563 12.027 4.246 2.385 9.618 .96 12.124-3.215C22.221 12.457 20.952 7.045 16.851 4.42 15.215 3.4 13.787 3.4 12 3.4h-1.647")
            addPathData("M4.914 9.485C3.158 7.916 4.109 4.105 5.023 3.315 5.109 4.211 5.608 4.523 6.134 5c.88-.275 1.313-.282 1.867 0C8.821 4.09 9.695 2.646 10.629 2.907 9.547 4.648 10.559 6.64 12 7.08c-.17 .975-1.484 1.913-2.76 2.686-1.296 .938-.722 1.85 0 2.234 .949 .506 3.611-1 4.545 .354-1.698 .102-1.536 3.107-3.983 2.727 2.523 .957 4.345 .462 5.458-.34 1.965-1.52 2.879-3.542 2.879-5.557C18.125 7.786 18.333 6.489 16.879 4.434")
        }
        return _brandFirefox!!
    }

private var _brandFirefox: ImageVector? = null
