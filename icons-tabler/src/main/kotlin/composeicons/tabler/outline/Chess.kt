package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Chess: ImageVector
    get() {
        if (_chess != null) return _chess!!
        _chess = tablerOutlineIcon(
            name = "Chess",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 3c1.657 0 3 1.343 3 3 0 1.113-.6 2.482-1.5 3L15 16h-6L10.5 9C9.6 8.482 9 7.113 9 6 9 4.343 10.343 3 12 3")
            addPathData("M8 9h8")
            addPathData("M6.684 16.772c-.409 .136-.684 .518-.684 .949v1.279c0 .552 .448 1 1 1h10c.552 0 1-.448 1-1v-1.28c-0-.43-.276-.812-.684-.948L15 16h-6l-2.316 .772")
        }
        return _chess!!
    }

private var _chess: ImageVector? = null
