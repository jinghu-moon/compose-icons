package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FileVolume: ImageVector
    get() {
        if (_fileVolume != null) return _fileVolume!!
        _fileVolume = lucideOutlineIcon(
            name = "FileVolume",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 4.000 11.550 L 4.000 4.000 C 4.000 2.895 4.895 2.000 6.000 2.000 L 14.000 2.000 C 14.640 1.998 15.254 2.253 15.706 2.706 L 19.294 6.294 C 19.747 6.746 20.002 7.360 20.000 8.000 L 20.000 20.000 C 20.000 21.105 19.105 22.000 18.000 22.000 L 16.050 22.000"),
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
                pathData = parseSvgPathData("M 14.000 2.000 L 14.000 7.000 C 14.000 7.552 14.448 8.000 15.000 8.000 L 20.000 8.000"),
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
                pathData = parseSvgPathData("M 12.000 15.000 C 13.333 16.778 13.333 19.222 12.000 21.000"),
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
                pathData = parseSvgPathData("M 8.000 14.502 C 8.001 14.306 7.887 14.128 7.709 14.046 C 7.532 13.964 7.322 13.993 7.174 14.121 L 5.281 15.752 C 5.100 15.908 4.869 15.994 4.630 15.995 L 3.500 15.995 C 3.367 15.995 3.240 16.048 3.146 16.142 C 3.052 16.236 3.000 16.363 3.000 16.496 L 3.000 19.502 C 3.000 19.635 3.052 19.762 3.146 19.856 C 3.240 19.950 3.367 20.003 3.500 20.003 L 4.629 20.003 C 4.868 20.003 5.100 20.090 5.281 20.246 L 7.174 21.879 C 7.322 22.007 7.531 22.036 7.709 21.954 C 7.887 21.872 8.000 21.695 8.000 21.499 Z"),
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
        return _fileVolume!!
    }

private var _fileVolume: ImageVector? = null
