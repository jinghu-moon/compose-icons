package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FaceMaskOff: ImageVector
    get() {
        if (_faceMaskOff != null) return _faceMaskOff!!
        _faceMaskOff = tablerOutlineIcon(
            name = "FaceMaskOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 14.5h-.222C3.243 14.5 2 13.38 2 12 2 10.62 3.243 9.5 4.778 9.5h.222")
            addPathData("M19 14.5h.222C20.756 14.5 22 13.38 22 12 22 10.62 20.756 9.5 19.222 9.5h-.222")
            addPathData("M9 10h1M14 10h1")
            addPathData("M9 14h5")
            addPathData("M19 15v-6.49c0-.893-.592-1.677-1.45-1.923L12.55 5.158c-.359-.103-.741-.103-1.1 0L9.662 5.669M6.544 6.56l-.094 .027C5.592 6.832 5 7.617 5 8.509v6.982c-0 .893 .592 1.677 1.45 1.923l5 1.429c.359 .103 .741 .103 1.1 0l4.899-1.4")
            addPathData("M3 3 21 21")
        }
        return _faceMaskOff!!
    }

private var _faceMaskOff: ImageVector? = null
