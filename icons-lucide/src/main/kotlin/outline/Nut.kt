package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Nut: ImageVector
    get() {
        if (_nut != null) return _nut!!
        _nut = lucideOutlineIcon(
            name = "Nut",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 4.000 L 12.000 2.000"),
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
        pathData = parseSvgPathData("M 5.000 10.000 L 5.000 14.000 C 5.000 17.203 7.173 19.997 10.277 20.787 C 10.689 20.891 11.079 21.079 11.379 21.379 L 12.000 22.000 L 12.621 21.379 C 12.921 21.079 13.311 20.891 13.723 20.787 C 16.827 19.998 19.000 17.203 19.000 14.000 L 19.000 10.000"),
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
        pathData = parseSvgPathData("M 12.000 4.000 C 8.000 4.000 4.500 6.000 4.000 8.000 C 3.757 8.970 3.081 9.952 2.000 11.000 C 3.310 10.918 3.972 10.710 5.000 10.000 C 5.540 10.920 5.982 11.356 7.000 12.000 C 8.452 11.353 8.954 10.902 9.500 10.000 C 10.095 10.995 10.651 11.427 12.000 12.000 C 13.310 11.379 13.862 10.942 14.500 10.000 C 15.129 10.977 15.662 11.423 17.000 12.000 C 18.209 11.452 18.680 11.033 19.000 10.000 C 20.032 10.916 20.683 11.157 22.000 11.000 C 20.703 9.964 20.242 8.970 20.000 8.000 C 19.500 6.000 16.000 4.000 12.000 4.000 Z"),
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
        return _nut!!
    }

private var _nut: ImageVector? = null
