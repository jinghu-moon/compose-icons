package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Rabbit: ImageVector
    get() {
        if (_rabbit != null) return _rabbit!!
        _rabbit = lucideOutlineIcon(
            name = "Rabbit",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 13.000 16.000 C 14.184 15.998 15.258 16.693 15.742 17.773 C 16.226 18.854 16.029 20.118 15.240 21.000"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 18.000 12.000 L 18.010 12.000"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 18.000 21.000 L 10.000 21.000 C 7.791 21.000 6.000 19.209 6.000 17.000 C 6.000 13.134 9.134 10.000 13.000 10.000 L 13.200 10.000 L 9.600 6.400 C 8.827 5.627 8.827 4.373 9.600 3.600 C 10.373 2.827 11.627 2.827 12.400 3.600 L 15.800 7.000 L 16.000 7.000 C 19.300 7.000 22.000 9.700 22.000 13.000 L 22.000 14.000 C 22.000 15.105 21.105 16.000 20.000 16.000 L 19.000 16.000 C 17.343 16.000 16.000 17.343 16.000 19.000"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 20.000 8.540 L 20.000 4.000 C 20.000 2.895 19.105 2.000 18.000 2.000 C 16.895 2.000 16.000 2.895 16.000 4.000 L 16.000 7.000"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 7.612 12.524 C 6.829 11.139 5.102 10.606 3.675 11.308 C 2.248 12.011 1.617 13.706 2.238 15.170 C 2.858 16.635 4.514 17.361 6.012 16.824"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _rabbit!!
    }

private var _rabbit: ImageVector? = null
