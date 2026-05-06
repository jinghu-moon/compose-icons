package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.NoCreativeCommons: ImageVector
    get() {
        if (_noCreativeCommons != null) return _noCreativeCommons!!
        _noCreativeCommons = tablerOutlineIcon(
            name = "NoCreativeCommons",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 12c0 4.971 4.029 9 9 9 4.971 0 9-4.029 9-9C21 7.029 16.971 3 12 3 7.029 3 3 7.029 3 12")
            addPathData("M10.5 10.5C9.653 9.79 8.368 9.842 7.586 10.616c-.374 .363-.586 .862-.586 1.384 0 .522 .211 1.021 .586 1.384 .782 .774 2.067 .825 2.914 .116")
            addPathData("M16.5 10.5c-.847-.71-2.132-.658-2.914 .116-.374 .363-.586 .862-.586 1.384 0 .522 .211 1.021 .586 1.384 .782 .774 2.067 .825 2.914 .116")
            addPathData("M6 6 7.5 7.5")
            addPathData("M16.5 16.5 18 18")
        }
        return _noCreativeCommons!!
    }

private var _noCreativeCommons: ImageVector? = null
