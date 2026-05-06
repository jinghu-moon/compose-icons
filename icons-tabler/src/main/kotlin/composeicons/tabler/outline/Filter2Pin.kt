package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Filter2Pin: ImageVector
    get() {
        if (_filter2Pin != null) return _filter2Pin!!
        _filter2Pin = tablerOutlineIcon(
            name = "Filter2Pin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 6h16")
            addPathData("M6 12h10")
            addPathData("M9 18h3")
            addPathData("M19 18v.01M21.121 20.121c.42-.419 .706-.954 .821-1.536 .116-.582 .056-1.185-.17-1.733-.227-.548-.611-1.017-1.105-1.347-.493-.33-1.073-.506-1.667-.506-.593 0-1.173 .176-1.667 .506-.493 .33-.878 .798-1.105 1.347-.227 .548-.286 1.151-.17 1.733 .116 .582 .402 1.116 .821 1.536 .418 .419 1.125 1.045 2.121 1.879 1.051-.89 1.759-1.516 2.121-1.879L19 18")
        }
        return _filter2Pin!!
    }

private var _filter2Pin: ImageVector? = null
