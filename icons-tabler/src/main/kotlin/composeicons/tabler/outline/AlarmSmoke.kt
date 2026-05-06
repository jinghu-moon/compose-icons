package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.AlarmSmoke: ImageVector
    get() {
        if (_alarmSmoke != null) return _alarmSmoke!!
        _alarmSmoke = tablerOutlineIcon(
            name = "AlarmSmoke",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18 8l-.8 3c-.117 .573-.615 .988-1.2 1h-8C7.415 11.988 6.917 11.573 6.8 11L6 8")
            addPathData("M3 5C3 4.448 3.448 4 4 4h16c.552 0 1 .448 1 1v2c0 .552-.448 1-1 1h-16C3.448 8 3 7.552 3 7v-2")
            addPathData("M12 16c.643 .288 1.017 .756 1 1.25 .017 .494-.357 .962-1 1.25-.643 .288-1.017 .756-1 1.25-.017 .494 .357 .962 1 1.25")
            addPathData("M7 16c.643 .288 1.017 .756 1 1.25 .017 .494-.357 .962-1 1.25-.643 .288-1.017 .756-1 1.25-.017 .494 .357 .962 1 1.25")
            addPathData("M17 16c.643 .288 1.017 .756 1 1.25 .017 .494-.357 .962-1 1.25-.643 .288-1.017 .756-1 1.25-.017 .494 .357 .962 1 1.25")
        }
        return _alarmSmoke!!
    }

private var _alarmSmoke: ImageVector? = null
