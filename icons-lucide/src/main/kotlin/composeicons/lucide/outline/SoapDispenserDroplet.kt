package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.SoapDispenserDroplet: ImageVector
    get() {
        if (_soapDispenserDroplet != null) return _soapDispenserDroplet!!
        _soapDispenserDroplet = lucideOutlineIcon(
            name = "SoapDispenserDroplet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10.5 2v4")
            addPathData("M14 2h-7C5.895 2 5 2.895 5 4")
            addPathData("M19.29 14.76C18.123 13.802 17.316 12.476 17 11c-.311 1.478-1.119 2.806-2.29 3.76C13.56 15.68 13 16.8 13 17.95 13 20.17 14.8 22 17 22c2.2 0 4-1.83 4-4.05 0-1.16-.57-2.26-1.71-3.19")
            addPathData("M9.607 21h-3.607C4.895 21 4 20.105 4 19v-7c0-1.105 .895-2 2-2h7v-3C13 6.448 12.552 6 12 6h-3C8.448 6 8 6.448 8 7v3")
        }
        return _soapDispenserDroplet!!
    }

private var _soapDispenserDroplet: ImageVector? = null
