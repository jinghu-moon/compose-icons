package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MoodCry: ImageVector
    get() {
        if (_moodCry != null) return _moodCry!!
        _moodCry = tablerOutlineIcon(
            name = "MoodCry",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 10h.01")
            addPathData("M15 10h.01")
            addPathData("M9.5 15.25c.658-.672 1.559-1.051 2.5-1.051 .941 0 1.842 .379 2.5 1.051")
            addPathData("M17.566 17.606c-.761 .783-.753 2.031 .017 2.805 .77 .774 2.019 .787 2.805 .029 .786-.758 .82-2.006 .075-2.804L19 16l-1.434 1.606")
            addPathData("M20.865 13.517c.088-.501 .133-1.008 .135-1.517C21 7.029 16.971 3 12 3 7.029 3 3 7.029 3 12c0 4.971 4.029 9 9 9 .69 0 1.36-.076 2-.222")
        }
        return _moodCry!!
    }

private var _moodCry: ImageVector? = null
