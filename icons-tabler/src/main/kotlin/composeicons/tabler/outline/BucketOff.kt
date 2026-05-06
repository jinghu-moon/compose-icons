package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BucketOff: ImageVector
    get() {
        if (_bucketOff != null) return _bucketOff!!
        _bucketOff = tablerOutlineIcon(
            name = "BucketOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5.029 5.036C4.374 5.616 4 6.286 4 7c0 2.033 3.033 3.712 6.96 3.967M14.748 10.757C17.812 10.198 20 8.728 20 7 20 4.79 16.418 3 12 3 10.395 3 8.9 3.236 7.648 3.643")
            addPathData("M4 7c0 .664 .088 1.324 .263 1.965L7 19c.5 1.5 2.239 2 5 2 2.761 0 4.5-.5 5-2 .1-.3 .252-.812 .457-1.535M18.319 14.319c.262-.975 .735-2.76 1.418-5.354C19.912 8.325 20 7.664 20 7")
            addPathData("M3 3 21 21")
        }
        return _bucketOff!!
    }

private var _bucketOff: ImageVector? = null
