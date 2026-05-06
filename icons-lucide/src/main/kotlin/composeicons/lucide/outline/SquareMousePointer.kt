package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.SquareMousePointer: ImageVector
    get() {
        if (_squareMousePointer != null) return _squareMousePointer!!
        _squareMousePointer = lucideOutlineIcon(
            name = "SquareMousePointer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12.034 12.681c-.074-.185-.03-.396 .11-.537 .141-.141 .352-.184 .537-.11l9 3.5c.198 .077 .325 .271 .318 .483-.007 .212-.148 .397-.351 .46l-3.444 1.068c-.315 .098-.562 .345-.66 .66l-1.067 3.443c-.063 .203-.248 .343-.46 .351-.212 .007-.406-.12-.483-.318Z")
            addPathData("M21 11v-6C21 3.895 20.105 3 19 3h-14C3.895 3 3 3.895 3 5v14c0 1.105 .895 2 2 2h6")
        }
        return _squareMousePointer!!
    }

private var _squareMousePointer: ImageVector? = null
