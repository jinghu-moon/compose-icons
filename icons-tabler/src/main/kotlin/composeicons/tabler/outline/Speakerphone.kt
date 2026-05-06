package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Speakerphone: ImageVector
    get() {
        if (_speakerphone != null) return _speakerphone!!
        _speakerphone = tablerOutlineIcon(
            name = "Speakerphone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18 8c1.657 0 3 1.343 3 3 0 1.657-1.343 3-3 3")
            addPathData("M10 8v11c0 .552-.448 1-1 1h-1C7.448 20 7 19.552 7 19v-5")
            addPathData("M12 8 16.524 4.23c.268-.224 .642-.272 .958-.123 .316 .148 .518 .466 .518 .815v12.156c0 .349-.202 .667-.518 .815-.316 .148-.69 .1-.958-.123L12 14h-8C3.448 14 3 13.552 3 13v-4C3 8.448 3.448 8 4 8h8")
        }
        return _speakerphone!!
    }

private var _speakerphone: ImageVector? = null
