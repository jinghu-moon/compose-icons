package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.LensConcave: ImageVector
    get() {
        if (_lensConcave != null) return _lensConcave!!
        _lensConcave = lucideOutlineIcon(
            name = "LensConcave",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 7.000 2.000 C 6.621 2.000 6.275 2.214 6.106 2.553 C 5.936 2.892 5.973 3.297 6.200 3.600 C 9.933 8.578 9.933 15.422 6.200 20.400 C 5.973 20.703 5.936 21.108 6.106 21.447 C 6.275 21.786 6.621 22.000 7.000 22.000 L 17.000 22.000 C 17.379 22.000 17.725 21.786 17.894 21.447 C 18.064 21.108 18.027 20.703 17.800 20.400 C 14.067 15.422 14.067 8.578 17.800 3.600 C 18.027 3.297 18.064 2.892 17.894 2.553 C 17.725 2.214 17.379 2.000 17.000 2.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
        }
        return _lensConcave!!
    }

private var _lensConcave: ImageVector? = null
