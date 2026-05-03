package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.NutOff: ImageVector
    get() {
        if (_nutOff != null) return _nutOff!!
        _nutOff = lucideOutlineIcon(
            name = "NutOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 4.000 L 12.000 2.000"),
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
                pathData = parseSvgPathData("M 5.000 10.000 L 5.000 14.000 C 5.000 17.203 7.173 19.997 10.277 20.787 C 10.689 20.891 11.079 21.079 11.379 21.379 L 12.000 22.000 L 12.621 21.379 C 12.921 21.079 13.311 20.891 13.723 20.787 C 15.416 20.356 16.887 19.308 17.848 17.848"),
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
                pathData = parseSvgPathData("M 19.000 10.000 L 19.000 13.343"),
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
                pathData = parseSvgPathData("M 12.000 12.000 C 10.651 11.427 10.095 10.995 9.500 10.000 C 8.954 10.902 8.452 11.353 7.000 12.000 C 5.982 11.356 5.540 10.920 5.000 10.000 C 3.972 10.710 3.310 10.918 2.000 11.000 C 3.081 9.952 3.757 8.970 4.000 8.000 C 4.194 7.224 4.840 6.449 5.790 5.790M 17.444 11.787 C 18.331 11.330 18.724 10.896 19.000 10.000 C 20.032 10.916 20.683 11.157 22.000 11.000 C 20.703 9.964 20.242 8.970 20.000 8.000 C 19.500 6.000 16.000 4.000 12.000 4.000 C 11.260 4.000 10.539 4.068 9.850 4.192"),
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
                pathData = parseSvgPathData("M 2.000 2.000 L 22.000 22.000"),
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
        return _nutOff!!
    }

private var _nutOff: ImageVector? = null
