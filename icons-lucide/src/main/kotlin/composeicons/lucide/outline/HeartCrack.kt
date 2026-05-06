package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.HeartCrack: ImageVector
    get() {
        if (_heartCrack != null) return _heartCrack!!
        _heartCrack = lucideOutlineIcon(
            name = "HeartCrack",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12.409 5.824c-.702 .792-1.15 1.496-1.415 2.166l2.153 2.156c.195 .195 .195 .512 0 .707l-2.293 2.293c-.195 .195-.195 .512 0 .707L12 15")
            addPathData("M13.508 20.313c-.377 .433-.922 .683-1.496 .687-.574 .004-1.122-.24-1.504-.668L5 15C3.5 13.5 2 11.8 2 9.5 2 7.222 3.404 5.179 5.531 4.364c2.127-.816 4.537-.235 6.06 1.459 .23 .215 .587 .215 .818 .001C13.932 4.13 16.341 3.549 18.468 4.364c2.127 .815 3.532 2.858 3.532 5.136 0 2.29-1.5 4-3 5.5Z")
        }
        return _heartCrack!!
    }

private var _heartCrack: ImageVector? = null
