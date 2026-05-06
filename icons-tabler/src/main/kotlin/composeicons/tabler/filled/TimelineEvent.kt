package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.TimelineEvent: ImageVector
    get() {
        if (_timelineEvent != null) return _timelineEvent!!
        _timelineEvent = tablerFilledIcon(
            name = "TimelineEvent",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 17c1.306 0 2.418 .835 2.83 2h5.17c.552 0 1 .448 1 1 0 .552-.448 1-1 1h-5.171c-.424 1.198-1.558 2-2.829 2C10.729 23 9.595 22.198 9.171 21h-5.171C3.448 21 3 20.552 3 20c0-.552 .448-1 1-1h5.17C9.594 17.801 10.728 17 12 17Z")
            addPathData("M17 2c1.105 0 2 .895 2 2v8c0 1.105-.895 2-2 2h-2.586l-1.707 1.707c-.356 .356-.922 .392-1.32 .083l-.094-.083L9.585 14h-2.585C5.953 14 5.083 13.194 5.005 12.15L5 12v-8C5 2.895 5.895 2 7 2h10Z")
        }
        return _timelineEvent!!
    }

private var _timelineEvent: ImageVector? = null
