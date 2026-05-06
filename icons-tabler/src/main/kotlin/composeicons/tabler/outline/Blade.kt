package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Blade: ImageVector
    get() {
        if (_blade != null) return _blade!!
        _blade = tablerOutlineIcon(
            name = "Blade",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17.707 3.707l2.586 2.586c.39 .39 .39 1.023 0 1.414l-.586 .586c-.39 .391-.39 1.023 0 1.414l.586 .586c.39 .391 .39 1.023 0 1.414l-8.586 8.586c-.391 .39-1.023 .39-1.414 0l-.586-.586c-.391-.39-1.023-.39-1.414 0l-.586 .586c-.39 .39-1.023 .39-1.414 0L3.707 17.707c-.39-.391-.39-1.024 0-1.414l.586-.586c.39-.391 .39-1.023 0-1.414l-.586-.586c-.39-.391-.39-1.023 0-1.414L12.293 3.707c.391-.39 1.023-.39 1.414 0l.586 .586c.391 .39 1.023 .39 1.414 0l.586-.586c.391-.39 1.024-.39 1.414 0")
            addPathData("M8 16l3.2-3.2")
            addPathData("M12.8 11.2 16 8")
            addPathData("M14 8l2 2")
            addPathData("M8 14l2 2")
            addPathData("M11 12c0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1-.552 0-1 .448-1 1")
        }
        return _blade!!
    }

private var _blade: ImageVector? = null
