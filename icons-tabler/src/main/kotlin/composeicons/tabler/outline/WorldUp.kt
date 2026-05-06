package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.WorldUp: ImageVector
    get() {
        if (_worldUp != null) return _worldUp!!
        _worldUp = tablerOutlineIcon(
            name = "WorldUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20.985 12.52C21.201 8.79 19.09 5.314 15.681 3.786 12.271 2.258 8.272 2.995 5.632 5.639 2.991 8.283 2.259 12.284 3.792 15.691c1.533 3.408 5.012 5.514 8.742 5.292")
            addPathData("M3.6 9h16.8")
            addPathData("M3.6 15h10.9")
            addPathData("M11.5 3c-3.437 5.508-3.437 12.492 0 18")
            addPathData("M12.5 3c2.141 3.431 2.989 7.512 2.391 11.512")
            addPathData("M19 22v-6")
            addPathData("M22 19 19 16l-3 3")
        }
        return _worldUp!!
    }

private var _worldUp: ImageVector? = null
