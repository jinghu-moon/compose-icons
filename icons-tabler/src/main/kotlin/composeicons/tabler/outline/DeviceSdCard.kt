package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DeviceSdCard: ImageVector
    get() {
        if (_deviceSdCard != null) return _deviceSdCard!!
        _deviceSdCard = tablerOutlineIcon(
            name = "DeviceSdCard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 21h10c1.105 0 2-.895 2-2v-14C19 3.895 18.105 3 17 3h-6.172c-.53 0-1.039 .211-1.414 .586L5.586 7.414C5.211 7.789 5 8.298 5 8.828v10.172c0 1.105 .895 2 2 2")
            addPathData("M13 6v2")
            addPathData("M16 6v2")
            addPathData("M10 7v1")
        }
        return _deviceSdCard!!
    }

private var _deviceSdCard: ImageVector? = null
