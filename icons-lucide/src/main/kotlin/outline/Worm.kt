package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Worm: ImageVector
    get() {
        if (_worm != null) return _worm!!
        _worm = lucideOutlineIcon(
            name = "Worm",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 19.000 12.000 L 17.500 15.000"),
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
        pathData = parseSvgPathData("M 19.630 18.810 L 22.000 20.000"),
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
        pathData = parseSvgPathData("M 6.470 8.230 C 7.064 7.894 7.803 7.952 8.339 8.375 C 8.874 8.799 9.100 9.504 8.910 10.160 L 8.270 12.240 C 7.418 14.965 8.370 17.933 10.649 19.653 C 12.928 21.374 16.042 21.476 18.430 19.910 L 18.850 19.640 C 20.013 18.886 20.344 17.333 19.590 16.170 C 18.836 15.007 17.283 14.676 16.120 15.430 L 15.700 15.700 C 15.080 16.094 14.280 16.061 13.694 15.618 C 13.108 15.175 12.859 14.414 13.070 13.710 L 13.710 11.630 C 14.549 8.991 13.667 6.108 11.495 4.390 C 9.324 2.672 6.315 2.477 3.940 3.900 L 3.240 4.300 C 2.042 5.004 1.641 6.547 2.345 7.745 C 3.049 8.943 4.592 9.344 5.790 8.640 Z"),
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
        return _worm!!
    }

private var _worm: ImageVector? = null
