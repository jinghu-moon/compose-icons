package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DeviceSpeakerOff: ImageVector
    get() {
        if (_deviceSpeakerOff != null) return _deviceSpeakerOff!!
        _deviceSpeakerOff = tablerOutlineIcon(
            name = "DeviceSpeakerOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 3h10c1.105 0 2 .895 2 2v10M19 19c0 1.105-.895 2-2 2h-10C5.895 21 5 20.105 5 19v-14")
            addPathData("M11.114 11.133c-1.363 .422-2.24 1.746-2.097 3.166 .143 1.42 1.267 2.543 2.687 2.684 1.42 .142 2.744-.736 3.165-2.1")
            addPathData("M12 7v.01")
            addPathData("M3 3 21 21")
        }
        return _deviceSpeakerOff!!
    }

private var _deviceSpeakerOff: ImageVector? = null
