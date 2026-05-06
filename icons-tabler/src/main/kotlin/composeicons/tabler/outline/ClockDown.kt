package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ClockDown: ImageVector
    get() {
        if (_clockDown != null) return _clockDown!!
        _clockDown = tablerOutlineIcon(
            name = "ClockDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20.984 12.535C21.206 8.802 19.097 5.321 15.686 3.789 12.274 2.258 8.271 2.996 5.63 5.642 2.988 8.289 2.258 12.294 3.797 15.702c1.538 3.408 5.024 5.511 8.756 5.281")
            addPathData("M12 7v5l3 3")
            addPathData("M19 16v6")
            addPathData("M22 19l-3 3L16 19")
        }
        return _clockDown!!
    }

private var _clockDown: ImageVector? = null
