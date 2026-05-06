package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CirclesRelation: ImageVector
    get() {
        if (_circlesRelation != null) return _circlesRelation!!
        _circlesRelation = tablerOutlineIcon(
            name = "CirclesRelation",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9.183 6.117C6.523 5.583 3.835 6.9 2.628 9.331c-1.207 2.43-.633 5.368 1.401 7.165 2.033 1.797 5.02 2.005 7.283 .508 2.263-1.497 3.24-4.327 2.382-6.901")
            addPathData("M14.813 17.883c2.663 .537 5.355-.783 6.562-3.217 1.207-2.434 .627-5.376-1.414-7.17C17.921 5.702 14.93 5.502 12.669 7.01c-2.26 1.508-3.225 4.346-2.352 6.919")
        }
        return _circlesRelation!!
    }

private var _circlesRelation: ImageVector? = null
