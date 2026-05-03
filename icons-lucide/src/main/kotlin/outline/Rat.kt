package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Rat: ImageVector
    get() {
        if (_rat != null) return _rat!!
        _rat = lucideOutlineIcon(
            name = "Rat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 13.000 22.000 L 4.000 22.000 C 2.895 22.000 2.000 21.105 2.000 20.000 C 2.000 18.895 2.895 18.000 4.000 18.000 L 16.000 18.000"),
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
                pathData = parseSvgPathData("M 13.236 18.000 C 14.020 17.123 14.220 15.869 13.746 14.792 C 13.272 13.715 12.213 13.014 11.036 13.000"),
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
                pathData = parseSvgPathData("M 16.000 9.000 L 16.010 9.000"),
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
                pathData = parseSvgPathData("M 16.820 3.940 C 17.669 3.042 18.981 2.756 20.127 3.219 C 21.272 3.683 22.016 4.802 22.001 6.037 C 21.985 7.273 21.214 8.373 20.057 8.808 L 21.872 11.395 C 22.086 11.880 22.028 12.441 21.720 12.872 C 21.412 13.303 20.900 13.540 20.372 13.495 L 17.500 13.042 C 16.622 12.894 15.723 13.143 15.047 13.722 C 14.371 14.302 13.988 15.152 14.000 16.042"),
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
                pathData = parseSvgPathData("M 17.000 4.988 C 16.994 3.646 16.098 2.471 14.805 2.110 C 13.512 1.750 12.137 2.293 11.438 3.439 C 10.740 4.585 10.887 6.056 11.800 7.040 C 9.814 6.811 7.824 7.443 6.334 8.776 C 4.843 10.109 3.994 12.016 4.000 14.015 C 4.008 16.218 5.797 18.000 8.000 18.000"),
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
        return _rat!!
    }

private var _rat: ImageVector? = null
