package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Megaphone: ImageVector
    get() {
        if (_megaphone != null) return _megaphone!!
        _megaphone = lucideOutlineIcon(
            name = "Megaphone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 11.000 6.000 C 14.041 6.078 17.014 5.088 19.400 3.200 C 19.703 2.973 20.108 2.936 20.447 3.106 C 20.786 3.275 21.000 3.621 21.000 4.000 L 21.000 16.000 C 21.000 16.379 20.786 16.725 20.447 16.894 C 20.108 17.064 19.703 17.027 19.400 16.800 C 17.014 14.912 14.041 13.922 11.000 14.000 L 5.000 14.000 C 3.895 14.000 3.000 13.105 3.000 12.000 L 3.000 8.000 C 3.000 6.895 3.895 6.000 5.000 6.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 6.000 14.000 C 6.000 16.596 6.842 19.123 8.400 21.200 C 9.063 22.084 10.316 22.263 11.200 21.600 C 12.084 20.937 12.263 19.684 11.600 18.800 C 10.561 17.415 10.000 15.731 10.000 14.000"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 8.000 6.000 L 8.000 14.000"),
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
        return _megaphone!!
    }

private var _megaphone: ImageVector? = null
