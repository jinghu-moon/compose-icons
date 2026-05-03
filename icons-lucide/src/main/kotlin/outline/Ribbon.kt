package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Ribbon: ImageVector
    get() {
        if (_ribbon != null) return _ribbon!!
        _ribbon = lucideOutlineIcon(
            name = "Ribbon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 11.220 C 11.000 9.997 10.000 9.000 10.000 8.000 C 10.000 6.895 10.895 6.000 12.000 6.000 C 13.105 6.000 14.000 6.895 14.000 8.000 C 14.000 9.000 13.002 10.002 11.990 11.220"),
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
                pathData = parseSvgPathData("M 12.000 18.000 L 14.570 14.500"),
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
                pathData = parseSvgPathData("M 6.243 9.016 C 7.549 7.128 9.698 6.000 11.994 5.999 C 14.290 5.997 16.441 7.121 17.750 9.007"),
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
                pathData = parseSvgPathData("M 9.350 14.530 L 12.000 11.220"),
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
                pathData = parseSvgPathData("M 9.350 14.530 C 7.728 12.246 6.000 10.221 6.000 7.000 C 6.000 4.239 8.686 2.000 12.000 2.000 C 15.314 2.000 18.000 4.239 18.000 7.000 C 17.995 10.220 16.222 12.235 14.570 14.500 L 18.127 19.027 C 18.295 19.241 18.369 19.515 18.331 19.785 C 18.292 20.055 18.145 20.298 17.924 20.457 L 16.030 21.817 C 15.587 22.134 14.972 22.039 14.646 21.602 L 12.000 18.000 L 9.321 21.593 C 8.994 22.033 8.374 22.128 7.931 21.806 L 6.066 20.453 C 5.847 20.294 5.702 20.053 5.663 19.785 C 5.625 19.517 5.697 19.245 5.863 19.031 Z"),
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
        return _ribbon!!
    }

private var _ribbon: ImageVector? = null
