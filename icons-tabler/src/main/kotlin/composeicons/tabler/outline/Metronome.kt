package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Metronome: ImageVector
    get() {
        if (_metronome != null) return _metronome!!
        _metronome = tablerOutlineIcon(
            name = "Metronome",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14.153 8.188 13.433 4.952C13.179 3.812 12.168 3 11 3c-1.168 0-2.18 .811-2.434 1.952L5.541 18.566c-.132 .592 .013 1.212 .392 1.685 .38 .473 .953 .749 1.56 .749h7.014c.607-0 1.18-.276 1.56-.749 .38-.473 .524-1.093 .392-1.685l-.524-2.357M11 18 20 5")
            addPathData("M19 5c0 .552 .448 1 1 1 .552 0 1-.448 1-1C21 4.448 20.552 4 20 4c-.552 0-1 .448-1 1")
        }
        return _metronome!!
    }

private var _metronome: ImageVector? = null
