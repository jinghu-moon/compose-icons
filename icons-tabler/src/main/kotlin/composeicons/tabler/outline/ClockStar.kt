package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ClockStar: ImageVector
    get() {
        if (_clockStar != null) return _clockStar!!
        _clockStar = tablerOutlineIcon(
            name = "ClockStar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20.982 11.436C20.683 6.675 16.722 2.975 11.952 3 7.182 3.025 3.26 6.768 3.012 11.531c-.248 4.764 3.263 8.894 8.004 9.415")
            addPathData("M17.8 20.817l-2.172 1.138c-.131 .068-.29 .057-.41-.03-.12-.087-.181-.234-.158-.38l.415-2.411L13.718 17.427c-.107-.103-.146-.259-.099-.4 .046-.141 .169-.244 .316-.265l2.428-.352 1.086-2.193c.066-.133 .202-.217 .351-.217 .149 0 .285 .084 .351 .217l1.086 2.193 2.428 .352c.147 .021 .269 .124 .315 .265 .046 .141 .008 .296-.098 .4l-1.757 1.707 .414 2.41c.025 .147-.035 .295-.155 .382-.12 .087-.28 .098-.412 .029L17.8 20.817")
            addPathData("M12 7v5l1 1")
        }
        return _clockStar!!
    }

private var _clockStar: ImageVector? = null
