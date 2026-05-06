package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DeviceIpadStar: ImageVector
    get() {
        if (_deviceIpadStar != null) return _deviceIpadStar!!
        _deviceIpadStar = tablerOutlineIcon(
            name = "DeviceIpadStar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 21h-5C4.895 21 4 20.105 4 19v-14C4 3.895 4.895 3 6 3h12c1.105 0 2 .895 2 2v5.5")
            addPathData("M9 18h1")
            addPathData("M17.8 20.817l-2.172 1.138c-.131 .068-.29 .057-.41-.03-.12-.087-.181-.234-.158-.38l.415-2.411L13.718 17.427c-.107-.103-.146-.259-.099-.4 .046-.141 .169-.244 .316-.265l2.428-.352 1.086-2.193c.066-.133 .202-.217 .351-.217 .149 0 .285 .084 .351 .217l1.086 2.193 2.428 .352c.147 .021 .269 .124 .315 .265 .046 .141 .008 .296-.098 .4l-1.757 1.707 .414 2.41c.025 .147-.035 .295-.155 .382-.12 .087-.28 .098-.412 .029L17.8 20.817")
        }
        return _deviceIpadStar!!
    }

private var _deviceIpadStar: ImageVector? = null
