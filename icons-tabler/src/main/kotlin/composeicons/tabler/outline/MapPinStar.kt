package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MapPinStar: ImageVector
    get() {
        if (_mapPinStar != null) return _mapPinStar!!
        _mapPinStar = tablerOutlineIcon(
            name = "MapPinStar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 11C15 9.462 13.836 8.174 12.306 8.016 10.777 7.859 9.376 8.885 9.063 10.39c-.313 1.506 .563 3.004 2.029 3.47")
            addPathData("M11.059 21.25c-.174-.093-.333-.211-.472-.35L6.343 16.657C3.82 14.134 3.273 10.244 5.003 7.123 6.732 4.002 10.32 2.403 13.797 3.205c3.477 .802 6.003 3.81 6.192 7.373")
            addPathData("M17.8 20.817l-2.172 1.138c-.131 .068-.29 .057-.41-.03-.12-.087-.181-.234-.158-.38l.415-2.411L13.718 17.427c-.107-.103-.146-.259-.099-.4 .046-.141 .169-.244 .316-.265l2.428-.352 1.086-2.193c.066-.133 .202-.217 .351-.217 .149 0 .285 .084 .351 .217l1.086 2.193 2.428 .352c.147 .021 .269 .124 .315 .265 .046 .141 .008 .296-.098 .4l-1.757 1.707 .414 2.41c.025 .147-.035 .295-.155 .382-.12 .087-.28 .098-.412 .029L17.8 20.817")
        }
        return _mapPinStar!!
    }

private var _mapPinStar: ImageVector? = null
