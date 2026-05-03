package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.UserStar: ImageVector
    get() {
        if (_userStar != null) return _userStar!!
        _userStar = lucideOutlineIcon(
            name = "UserStar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 16.051 12.616 C 16.187 12.200 16.577 11.921 17.014 11.926 C 17.452 11.932 17.835 12.221 17.960 12.640 L 18.697 14.092 C 18.842 14.378 19.117 14.577 19.434 14.627 L 21.068 14.883 C 21.500 14.885 21.881 15.163 22.015 15.573 C 22.149 15.984 22.004 16.434 21.656 16.689 L 20.484 17.857 C 20.256 18.084 20.151 18.406 20.202 18.723 L 20.461 20.336 C 20.607 20.751 20.465 21.213 20.111 21.474 C 19.756 21.735 19.273 21.733 18.920 21.470 L 17.455 20.720 C 17.169 20.573 16.829 20.573 16.543 20.720 L 15.078 21.470 C 14.725 21.731 14.244 21.731 13.890 21.471 C 13.537 21.211 13.395 20.751 13.539 20.337 L 13.797 18.724 C 13.848 18.407 13.743 18.085 13.515 17.858 L 12.359 16.705 C 11.999 16.456 11.843 16.001 11.974 15.583 C 12.106 15.166 12.493 14.882 12.931 14.883 L 14.564 14.627 C 14.881 14.577 15.156 14.378 15.301 14.092 Z"),
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
                pathData = parseSvgPathData("M 8.000 15.000 L 7.000 15.000 C 4.791 15.000 3.000 16.791 3.000 19.000 L 3.000 21.000"),
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
                pathData = parseSvgPathData("M 14.000 7.000 C 14.000 9.209 12.209 11.000 10.000 11.000 C 7.791 11.000 6.000 9.209 6.000 7.000 C 6.000 4.791 7.791 3.000 10.000 3.000 C 12.209 3.000 14.000 4.791 14.000 7.000 Z"),
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
        return _userStar!!
    }

private var _userStar: ImageVector? = null
