package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.StarsOff: ImageVector
    get() {
        if (_starsOff != null) return _starsOff!!
        _starsOff = tablerOutlineIcon(
            name = "StarsOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17.373 13.371l.076-.154c.066-.133 .202-.217 .351-.217 .149 0 .285 .084 .351 .217l.907 1.831M19.425 15.438c.498 .071 1.245 .18 2.24 .324 .147 .021 .269 .124 .315 .265 .046 .141 .008 .296-.098 .4-.326 .316-.57 .553-.732 .712M20.539 20.544c.025 .147-.035 .295-.155 .382-.12 .087-.28 .098-.412 .029L17.8 19.817l-2.172 1.138c-.131 .068-.29 .057-.41-.03-.12-.087-.181-.234-.158-.38l.415-2.411L13.718 16.427c-.107-.103-.146-.259-.099-.4 .046-.141 .169-.244 .316-.265l1.601-.232")
            addPathData("M6.2 19.817 4.028 20.955c-.131 .068-.29 .057-.41-.03-.12-.087-.181-.234-.158-.38l.415-2.411L2.118 16.427c-.107-.103-.146-.259-.099-.4 .046-.141 .169-.244 .316-.265l2.428-.352L5.849 13.217c.066-.133 .202-.217 .351-.217 .149 0 .285 .084 .351 .217l1.086 2.193 2.428 .352c.147 .021 .269 .124 .315 .265 .046 .141 .008 .296-.098 .4L8.525 18.134l.414 2.41c.025 .147-.035 .295-.155 .382-.12 .087-.28 .098-.412 .029L6.2 19.817")
            addPathData("M9.557 5.556l1-.146L11.643 3.217c.066-.133 .202-.217 .351-.217 .149 0 .285 .084 .351 .217l1.086 2.193 2.428 .352c.147 .021 .269 .124 .315 .265 .046 .141 .008 .296-.098 .4L14.319 8.134l.414 2.41c.011 .063 .006 .127-.014 .187M10.566 10.565l-.744 .39c-.131 .068-.29 .057-.41-.03-.12-.087-.181-.234-.158-.38L9.442 9.452")
            addPathData("M3 3 21 21")
        }
        return _starsOff!!
    }

private var _starsOff: ImageVector? = null
