package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.WorldStar: ImageVector
    get() {
        if (_worldStar != null) return _worldStar!!
        _worldStar = tablerOutlineIcon(
            name = "WorldStar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21 12C21 7.155 17.165 3.18 12.323 3.006 7.481 2.832 3.371 6.522 3.023 11.354c-.348 4.832 3.192 9.073 8.009 9.594")
            addPathData("M3.6 9h16.8")
            addPathData("M3.6 15h6.4")
            addPathData("M11.5 3C8.929 7.12 8.242 12.143 9.614 16.802")
            addPathData("M12.5 3c1.507 2.414 2.384 5.169 2.549 8.01")
            addPathData("M17.8 20.817l-2.172 1.138c-.131 .068-.29 .057-.41-.03-.12-.087-.181-.234-.158-.38l.415-2.411L13.718 17.427c-.107-.103-.146-.259-.099-.4 .046-.141 .169-.244 .316-.265l2.428-.352 1.086-2.193c.066-.133 .202-.217 .351-.217 .149 0 .285 .084 .351 .217l1.086 2.193 2.428 .352c.147 .021 .269 .124 .315 .265 .046 .141 .008 .296-.098 .4l-1.757 1.707 .414 2.41c.025 .147-.035 .295-.155 .382-.12 .087-.28 .098-.412 .029L17.8 20.817")
        }
        return _worldStar!!
    }

private var _worldStar: ImageVector? = null
