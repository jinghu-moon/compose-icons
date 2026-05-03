package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.CircleStar: ImageVector
    get() {
        if (_circleStar != null) return _circleStar!!
        _circleStar = lucideOutlineIcon(
            name = "CircleStar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 Z"),
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
                pathData = parseSvgPathData("M 11.051 7.616 C 11.187 7.200 11.577 6.921 12.014 6.926 C 12.452 6.932 12.835 7.221 12.960 7.640 L 13.697 9.092 C 13.842 9.378 14.117 9.577 14.434 9.627 L 16.068 9.883 C 16.500 9.885 16.881 10.163 17.015 10.573 C 17.149 10.984 17.004 11.434 16.656 11.689 L 15.484 12.857 C 15.256 13.084 15.151 13.406 15.202 13.723 L 15.461 15.336 C 15.607 15.751 15.465 16.213 15.111 16.474 C 14.756 16.735 14.273 16.733 13.920 16.470 L 12.455 15.720 C 12.169 15.573 11.829 15.573 11.543 15.720 L 10.078 16.470 C 9.725 16.731 9.244 16.731 8.890 16.471 C 8.537 16.211 8.395 15.751 8.539 15.337 L 8.797 13.724 C 8.848 13.406 8.743 13.084 8.515 12.857 L 7.359 11.705 C 6.999 11.456 6.843 11.001 6.974 10.583 C 7.106 10.166 7.493 9.882 7.931 9.883 L 9.564 9.627 C 9.881 9.577 10.156 9.378 10.301 9.092 Z"),
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
        return _circleStar!!
    }

private var _circleStar: ImageVector? = null
