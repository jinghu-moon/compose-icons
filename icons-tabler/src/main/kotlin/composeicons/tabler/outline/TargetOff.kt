package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TargetOff: ImageVector
    get() {
        if (_targetOff != null) return _targetOff!!
        _targetOff = tablerOutlineIcon(
            name = "TargetOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11.286 11.3c-.392 .389-.394 1.023-.005 1.415 .389 .392 1.023 .394 1.415 .004")
            addPathData("M8.44 8.49c-1.938 1.961-1.923 5.121 .035 7.063 1.957 1.942 5.117 1.934 7.063-.019M16.915 12.923c.305-1.624-.212-3.295-1.381-4.462C14.364 7.293 12.693 6.779 11.069 7.087")
            addPathData("M5.649 5.623C2.126 9.129 2.113 14.828 5.619 18.351c3.506 3.523 9.205 3.536 12.728 .03M20.03 16.068C21.79 12.6 21.123 8.394 18.377 5.64 15.631 2.886 11.427 2.208 7.954 3.958")
            addPathData("M3 3 21 21")
        }
        return _targetOff!!
    }

private var _targetOff: ImageVector? = null
