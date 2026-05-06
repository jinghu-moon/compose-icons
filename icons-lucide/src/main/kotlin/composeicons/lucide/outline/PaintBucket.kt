package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.PaintBucket: ImageVector
    get() {
        if (_paintBucket != null) return _paintBucket!!
        _paintBucket = lucideOutlineIcon(
            name = "PaintBucket",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 7 6 2")
            addPathData("M18.992 12h-16.951")
            addPathData("M21.145 18.38C20.562 17.901 20.158 17.238 20 16.5c-.155 .739-.559 1.403-1.145 1.88-.575 .46-.855 1.02-.855 1.595-.007 .535 .201 1.05 .577 1.43 .376 .38 .888 .595 1.423 .595 .535 0 1.047-.214 1.423-.595 .376-.38 .584-.896 .577-1.43 0-.58-.285-1.13-.855-1.595")
            addPathData("M8.5 4.5 10.648 2.352c.471-.47 1.233-.47 1.704 0l7.296 7.296c.47 .471 .47 1.233 0 1.704l-7.592 7.592c-1.412 1.411-3.7 1.411-5.112 0L3.056 15.056C1.645 13.644 1.645 11.356 3.056 9.944L5.67 7.33")
        }
        return _paintBucket!!
    }

private var _paintBucket: ImageVector? = null
