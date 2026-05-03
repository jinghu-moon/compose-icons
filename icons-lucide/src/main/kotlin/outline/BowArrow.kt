package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.BowArrow: ImageVector
    get() {
        if (_bowArrow != null) return _bowArrow!!
        _bowArrow = lucideOutlineIcon(
            name = "BowArrow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.000 3.000 L 21.000 3.000 L 21.000 7.000"),
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
        pathData = parseSvgPathData("M 18.575 11.082 C 19.999 13.867 20.371 17.072 19.623 20.109 C 19.526 20.508 19.227 20.826 18.835 20.949 C 18.443 21.071 18.016 20.979 17.709 20.706 L 14.000 17.000"),
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
        pathData = parseSvgPathData("M 7.000 10.000 L 3.290 6.290 C 3.019 5.983 2.929 5.556 3.052 5.166 C 3.174 4.775 3.492 4.477 3.890 4.380 C 6.928 3.632 10.134 4.005 12.920 5.430"),
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
        pathData = parseSvgPathData("M 7.000 14.000 C 6.547 13.999 6.113 14.179 5.793 14.500 L 3.147 17.146 C 3.004 17.289 2.961 17.504 3.038 17.691 C 3.115 17.878 3.298 18.000 3.500 18.000 L 5.000 18.000 C 5.552 18.000 6.000 18.448 6.000 19.000 L 6.000 20.500 C 6.000 20.703 6.121 20.885 6.309 20.963 C 6.496 21.040 6.711 20.997 6.854 20.854 L 9.500 18.207 C 9.821 17.887 10.001 17.453 10.000 17.000 L 10.000 15.000 C 10.000 14.448 9.552 14.000 9.000 14.000 Z"),
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
        pathData = parseSvgPathData("M 9.707 14.293 L 21.000 3.000"),
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
        return _bowArrow!!
    }

private var _bowArrow: ImageVector? = null
