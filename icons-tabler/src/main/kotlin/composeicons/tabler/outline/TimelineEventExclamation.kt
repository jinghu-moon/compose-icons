package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TimelineEventExclamation: ImageVector
    get() {
        if (_timelineEventExclamation != null) return _timelineEventExclamation!!
        _timelineEventExclamation = tablerOutlineIcon(
            name = "TimelineEventExclamation",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 20c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
            addPathData("M10 20h-6")
            addPathData("M14 20h6")
            addPathData("M12 15 10 13h-3C6.448 13 6 12.552 6 12v-8C6 3.448 6.448 3 7 3h10c.552 0 1 .448 1 1v8c0 .552-.448 1-1 1h-3l-2 2")
            addPathData("M12 6v2")
            addPathData("M12 11v.01")
        }
        return _timelineEventExclamation!!
    }

private var _timelineEventExclamation: ImageVector? = null
