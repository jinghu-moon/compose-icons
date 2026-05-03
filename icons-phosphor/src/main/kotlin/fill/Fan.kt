package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Fan: ImageVector
    get() {
        if (_fan != null) return _fan!!
        _fan = phosphorFillIcon(
            name = "Fan",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 233.000 135.000 C 228.087 116.650 214.775 101.710 197.111 94.723 C 179.446 87.735 159.516 89.526 143.380 99.550 L 159.770 34.110 C 160.604 30.776 159.215 27.282 156.320 25.430 C 137.793 13.731 114.362 13.062 95.198 23.685 C 76.033 34.307 64.183 54.532 64.286 76.443 C 64.388 98.354 76.427 118.467 95.690 128.910 L 30.820 147.440 C 27.515 148.381 25.181 151.328 25.020 154.760 C 23.752 182.900 42.230 208.134 69.440 215.420 C 74.534 216.788 79.785 217.484 85.060 217.490 C 101.299 217.447 116.828 210.831 128.109 199.151 C 139.390 187.470 145.462 171.720 144.940 155.490 L 193.420 202.410 C 195.892 204.802 199.617 205.346 202.670 203.760 C 227.660 190.794 240.274 162.197 233.000 135.000 ZM 130.440 147.850 C 122.411 148.837 114.578 144.891 110.594 137.851 C 106.609 130.811 107.258 122.064 112.237 115.688 C 117.217 109.313 125.546 106.565 133.342 108.726 C 141.137 110.887 146.863 117.531 147.850 125.560 C 149.197 136.523 141.403 146.502 130.440 147.850 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _fan!!
    }

private var _fan: ImageVector? = null
