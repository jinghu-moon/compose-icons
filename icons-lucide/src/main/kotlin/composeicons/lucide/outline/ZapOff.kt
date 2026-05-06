package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ZapOff: ImageVector
    get() {
        if (_zapOff != null) return _zapOff!!
        _zapOff = lucideOutlineIcon(
            name = "ZapOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10.513 4.856 13.12 2.17c.153-.177 .408-.224 .614-.113 .206 .11 .308 .348 .246 .573L12.603 6.947")
            addPathData("M15.656 10h4.344c.386-.001 .739 .22 .905 .568 .167 .348 .118 .762-.125 1.062l-1.72 1.773")
            addPathData("M16.273 16.273l-5.393 5.557c-.153 .177-.408 .224-.614 .113-.206-.11-.308-.348-.246-.573l1.92-6.02c.115-.308 .072-.652-.116-.921C11.636 14.159 11.328 13.999 11 14h-7c-.386 .001-.739-.22-.905-.568-.167-.348-.118-.762 .125-1.062L7.727 7.727")
            addPathData("M2 2 22 22")
        }
        return _zapOff!!
    }

private var _zapOff: ImageVector? = null
