package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FishOff: ImageVector
    get() {
        if (_fishOff != null) return _fishOff!!
        _fishOff = lucideOutlineIcon(
            name = "FishOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 18.000 12.470 L 18.000 12.500M 18.000 12.000 L 18.000 12.470M 17.525 17.526 C 16.721 17.844 15.864 18.005 15.000 18.000 C 11.440 18.000 7.440 15.470 6.500 12.000 C 6.848 10.720 7.614 9.567 8.621 8.620M 12.065 6.532 C 13.006 6.189 13.999 6.009 15.000 6.000 C 18.560 6.000 21.060 8.540 22.000 12.000 C 21.691 13.140 21.214 14.177 20.587 15.058"),
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
                pathData = parseSvgPathData("M 7.000 10.670 C 7.000 8.000 5.580 5.970 2.730 5.500 C 1.730 7.000 1.730 10.500 2.960 12.000 C 1.720 13.500 1.720 17.000 2.730 18.500 C 5.580 18.030 7.000 16.000 7.000 13.330M 14.480 8.958 C 14.821 7.917 15.335 6.941 16.000 6.070M 16.000 17.930 C 15.180 16.856 14.592 15.624 14.272 14.312"),
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
                pathData = parseSvgPathData("M 16.010 17.930 L 15.780 19.330 C 15.618 20.297 14.780 21.004 13.800 21.000 L 9.500 21.000 C 10.469 19.901 10.999 18.485 10.990 17.020M 8.530 3.000 L 13.800 3.000 C 14.780 2.996 15.618 3.703 15.780 4.670 L 16.010 6.070M 2.000 2.000 L 22.000 22.000"),
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
        return _fishOff!!
    }

private var _fishOff: ImageVector? = null
