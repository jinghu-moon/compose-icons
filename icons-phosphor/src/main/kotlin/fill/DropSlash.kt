package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.DropSlash: ImageVector
    get() {
        if (_dropSlash != null) return _dropSlash!!
        _dropSlash = phosphorFillIcon(
            name = "DropSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 213.920 210.620 C 215.883 212.729 216.561 215.730 215.694 218.478 C 214.827 221.225 212.550 223.294 209.733 223.895 C 206.915 224.496 203.992 223.535 202.080 221.380 L 189.180 207.190 C 172.796 223.112 150.846 232.014 128.000 232.000 C 80.000 232.000 40.510 193.070 40.000 145.120 C 39.730 120.780 48.220 95.280 64.730 70.310 L 42.300 45.630 C 39.294 42.410 39.355 37.395 42.440 34.250 C 43.996 32.746 46.095 31.936 48.258 32.006 C 50.421 32.075 52.464 33.019 53.920 34.620 ZM 203.850 175.760 C 204.785 176.790 206.189 177.259 207.555 177.000 C 208.922 176.741 210.056 175.790 210.550 174.490 C 214.162 164.731 216.007 154.406 216.000 144.000 C 216.000 112.600 201.490 79.320 174.000 47.750 C 161.648 33.484 147.745 20.639 132.550 9.450 C 129.794 7.520 126.126 7.520 123.370 9.450 C 110.278 19.103 98.155 30.004 87.170 42.000 C 85.766 43.530 85.766 45.880 87.170 47.410 Z"),
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
        return _dropSlash!!
    }

private var _dropSlash: ImageVector? = null
