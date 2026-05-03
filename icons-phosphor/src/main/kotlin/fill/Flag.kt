package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Flag: ImageVector
    get() {
        if (_flag != null) return _flag!!
        _flag = phosphorFillIcon(
            name = "Flag",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 232.000 56.000 L 232.000 176.000 C 231.987 178.304 230.981 180.491 229.240 182.000 C 213.960 195.230 199.350 200.000 185.420 200.000 C 166.510 200.000 148.850 191.260 132.420 183.150 C 105.870 170.000 82.790 158.610 56.000 179.770 L 56.000 224.000 C 56.000 228.418 52.418 232.000 48.000 232.000 C 43.582 232.000 40.000 228.418 40.000 224.000 L 40.000 56.000 C 40.016 53.694 41.025 51.507 42.770 50.000 L 42.770 50.000 C 78.770 18.820 111.080 34.790 139.560 48.880 C 167.000 62.460 190.790 74.200 218.760 50.000 C 221.121 47.954 224.457 47.469 227.302 48.758 C 230.148 50.048 231.982 52.876 232.000 56.000 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _flag!!
    }

private var _flag: ImageVector? = null
