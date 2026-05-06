package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.SquareDashedMousePointer: ImageVector
    get() {
        if (_squareDashedMousePointer != null) return _squareDashedMousePointer!!
        _squareDashedMousePointer = lucideOutlineIcon(
            name = "SquareDashedMousePointer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12.034 12.681c-.074-.185-.03-.396 .11-.537 .141-.141 .352-.184 .537-.11l9 3.5c.198 .077 .325 .271 .318 .483-.007 .212-.148 .397-.351 .46l-3.444 1.068c-.315 .098-.562 .345-.66 .66l-1.067 3.443c-.063 .203-.248 .343-.46 .351-.212 .007-.406-.12-.483-.318Z")
            addPathData("M5 3C3.895 3 3 3.895 3 5")
            addPathData("M19 3c1.105 0 2 .895 2 2")
            addPathData("M5 21C3.895 21 3 20.105 3 19")
            addPathData("M9 3h1")
            addPathData("M9 21h2")
            addPathData("M14 3h1")
            addPathData("M3 9v1")
            addPathData("M21 9v2")
            addPathData("M3 14v1")
        }
        return _squareDashedMousePointer!!
    }

private var _squareDashedMousePointer: ImageVector? = null
