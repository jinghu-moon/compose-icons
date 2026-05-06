package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Stars: ImageVector
    get() {
        if (_stars != null) return _stars!!
        _stars = tablerOutlineIcon(
            name = "Stars",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17.8 19.817l-2.172 1.138c-.131 .068-.29 .057-.41-.03-.12-.087-.181-.234-.158-.38l.415-2.411L13.718 16.427c-.107-.103-.146-.259-.099-.4 .046-.141 .169-.244 .316-.265l2.428-.352 1.086-2.193c.066-.133 .202-.217 .351-.217 .149 0 .285 .084 .351 .217l1.086 2.193 2.428 .352c.147 .021 .269 .124 .315 .265 .046 .141 .008 .296-.098 .4l-1.757 1.707 .414 2.41c.025 .147-.035 .295-.155 .382-.12 .087-.28 .098-.412 .029L17.8 19.817")
            addPathData("M6.2 19.817 4.028 20.955c-.131 .068-.29 .057-.41-.03-.12-.087-.181-.234-.158-.38l.415-2.411L2.118 16.427c-.107-.103-.146-.259-.099-.4 .046-.141 .169-.244 .316-.265l2.428-.352L5.849 13.217c.066-.133 .202-.217 .351-.217 .149 0 .285 .084 .351 .217l1.086 2.193 2.428 .352c.147 .021 .269 .124 .315 .265 .046 .141 .008 .296-.098 .4L8.525 18.134l.414 2.41c.025 .147-.035 .295-.155 .382-.12 .087-.28 .098-.412 .029L6.2 19.817")
            addPathData("M12 9.817 9.828 10.955c-.131 .068-.29 .057-.41-.03-.12-.087-.181-.234-.158-.38L9.675 8.134 7.918 6.427C7.811 6.324 7.772 6.168 7.819 6.027c.046-.141 .169-.244 .316-.265l2.428-.352L11.649 3.217c.066-.133 .202-.217 .351-.217 .149 0 .285 .084 .351 .217l1.086 2.193 2.428 .352c.147 .021 .269 .124 .315 .265 .046 .141 .008 .296-.098 .4L14.325 8.134l.414 2.41c.025 .147-.035 .295-.155 .382-.12 .087-.28 .098-.412 .029L12 9.817")
        }
        return _stars!!
    }

private var _stars: ImageVector? = null
