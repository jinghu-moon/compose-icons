package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Droplets: ImageVector
    get() {
        if (_droplets != null) return _droplets!!
        _droplets = lucideOutlineIcon(
            name = "Droplets",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 7.000 16.300 C 9.200 16.300 11.000 14.470 11.000 12.250 C 11.000 11.090 10.430 9.990 9.290 9.060 C 8.150 8.130 7.290 6.750 7.000 5.300 C 6.710 6.750 5.860 8.140 4.710 9.060 C 3.560 9.980 3.000 11.100 3.000 12.250 C 3.000 14.470 4.800 16.300 7.000 16.300 Z"),
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
        pathData = parseSvgPathData("M 12.560 6.600 C 13.248 5.501 13.735 4.289 14.000 3.020 C 14.500 5.520 16.000 7.920 18.000 9.520 C 20.000 11.120 21.000 13.020 21.000 15.020 C 21.012 17.847 19.317 20.402 16.708 21.490 C 14.099 22.579 11.091 21.987 9.090 19.990"),
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
        return _droplets!!
    }

private var _droplets: ImageVector? = null
