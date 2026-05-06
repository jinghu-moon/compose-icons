package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.School: ImageVector
    get() {
        if (_school != null) return _school!!
        _school = tablerOutlineIcon(
            name = "School",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M22 9 12 5 2 9l10 4L22 9v6")
            addPathData("M6 10.6v5.4c0 1.657 2.686 3 6 3 3.314 0 6-1.343 6-3v-5.4")
        }
        return _school!!
    }

private var _school: ImageVector? = null
