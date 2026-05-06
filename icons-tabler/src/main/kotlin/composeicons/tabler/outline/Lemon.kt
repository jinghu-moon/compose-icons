package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Lemon: ImageVector
    get() {
        if (_lemon != null) return _lemon!!
        _lemon = tablerOutlineIcon(
            name = "Lemon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17.536 3.393c3.905 3.906 3.905 10.237 0 14.143-3.906 3.905-10.237 3.905-14.143 0L17.536 3.393")
            addPathData("M5.868 15.06c2.538 2.539 6.654 2.539 9.193 0 2.539-2.538 2.539-6.654 0-9.193")
            addPathData("M10.464 10.464l4.597 4.597")
            addPathData("M10.464 10.464v6.364")
            addPathData("M10.464 10.464h6.364")
        }
        return _lemon!!
    }

private var _lemon: ImageVector? = null
