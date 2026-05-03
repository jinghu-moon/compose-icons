package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Rocket: ImageVector
    get() {
        if (_rocket != null) return _rocket!!
        _rocket = lucideOutlineIcon(
            name = "Rocket",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 15.000 L 12.000 20.000 C 12.000 20.000 15.030 19.450 16.000 18.000 C 17.080 16.380 16.000 13.000 16.000 13.000"),
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
                pathData = parseSvgPathData("M 4.500 16.500 C 3.000 17.760 2.500 21.500 2.500 21.500 C 2.500 21.500 6.240 21.000 7.500 19.500 C 8.210 18.660 8.200 17.370 7.410 16.590 C 6.605 15.822 5.351 15.783 4.500 16.500"),
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
                pathData = parseSvgPathData("M 9.000 12.000 C 9.532 10.619 10.202 9.296 11.000 8.050 C 13.369 4.262 17.532 1.972 22.000 2.000 C 22.000 4.720 21.220 9.500 16.000 13.000 C 14.737 13.798 13.397 14.468 12.000 15.000 Z"),
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
                pathData = parseSvgPathData("M 9.000 12.000 L 4.000 12.000 C 4.000 12.000 4.550 8.970 6.000 8.000 C 7.620 6.920 11.000 8.050 11.000 8.050"),
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
        return _rocket!!
    }

private var _rocket: ImageVector? = null
