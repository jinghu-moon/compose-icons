package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CurrentLocationOff: ImageVector
    get() {
        if (_currentLocationOff != null) return _currentLocationOff!!
        _currentLocationOff = tablerOutlineIcon(
            name = "CurrentLocationOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14.685 10.661c-.3-.6-.795-1.086-1.402-1.374M9.886 9.871c-.769 .755-1.073 1.865-.798 2.907 .275 1.042 1.089 1.856 2.13 2.133 1.041 .277 2.151-.026 2.908-.794")
            addPathData("M6.357 6.33C4.314 8.345 3.506 11.299 4.24 14.073c.734 2.774 2.898 4.942 5.67 5.683 2.772 .74 5.729-.061 7.748-2.1M19.3 15.278c1.365-3.034 .709-6.597-1.646-8.946C15.298 3.982 11.734 3.336 8.703 4.709")
            addPathData("M12 2v2")
            addPathData("M12 20v2")
            addPathData("M20 12h2")
            addPathData("M2 12h2")
            addPathData("M3 3 21 21")
        }
        return _currentLocationOff!!
    }

private var _currentLocationOff: ImageVector? = null
