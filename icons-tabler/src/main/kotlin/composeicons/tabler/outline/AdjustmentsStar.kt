package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.AdjustmentsStar: ImageVector
    get() {
        if (_adjustmentsStar != null) return _adjustmentsStar!!
        _adjustmentsStar = tablerOutlineIcon(
            name = "AdjustmentsStar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 10c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C8 8.895 7.105 8 6 8 4.895 8 4 8.895 4 10")
            addPathData("M6 4v4")
            addPathData("M6 12v8")
            addPathData("M12 4v9.5")
            addPathData("M16 7c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C20 5.895 19.105 5 18 5c-1.105 0-2 .895-2 2")
            addPathData("M18 4v1")
            addPathData("M17.8 20.817l-2.172 1.138c-.131 .068-.29 .057-.41-.03-.12-.087-.181-.234-.158-.38l.415-2.411L13.718 17.427c-.107-.103-.146-.259-.099-.4 .046-.141 .169-.244 .316-.265l2.428-.352 1.086-2.193c.066-.133 .202-.217 .351-.217 .149 0 .285 .084 .351 .217l1.086 2.193 2.428 .352c.147 .021 .269 .124 .315 .265 .046 .141 .008 .296-.098 .4l-1.757 1.707 .414 2.41c.025 .147-.035 .295-.155 .382-.12 .087-.28 .098-.412 .029L17.8 20.817")
            addPathData("M18 9v1")
        }
        return _adjustmentsStar!!
    }

private var _adjustmentsStar: ImageVector? = null
