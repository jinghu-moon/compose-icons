package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Helmet: ImageVector
    get() {
        if (_helmet != null) return _helmet!!
        _helmet = tablerOutlineIcon(
            name = "Helmet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 4c3.814 0 7.213 2.405 8.485 6 1.271 3.596 .138 7.602-2.829 10h-11.312C3.378 17.603 2.244 13.596 3.515 10 4.787 6.405 8.186 4 12 4")
            addPathData("M20 9h-8.8c-.308 0-.599 .143-.788 .386-.189 .243-.255 .561-.18 .86 .507 2 1.596 3.418 3.268 4.254 2 1 4.333 1.5 7 1.5")
        }
        return _helmet!!
    }

private var _helmet: ImageVector? = null
