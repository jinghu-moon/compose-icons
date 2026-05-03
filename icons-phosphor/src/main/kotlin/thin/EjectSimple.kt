package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.EjectSimple: ImageVector
    get() {
        if (_ejectSimple != null) return _ejectSimple!!
        _ejectSimple = phosphorThinIcon(
            name = "EjectSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 228.000 200.000 C 228.000 202.209 226.209 204.000 224.000 204.000 L 32.000 204.000 C 29.791 204.000 28.000 202.209 28.000 200.000 C 28.000 197.791 29.791 196.000 32.000 196.000 L 224.000 196.000 C 226.209 196.000 228.000 197.791 228.000 200.000 ZM 29.200 149.120 C 27.162 144.914 27.751 139.908 30.710 136.290 L 112.370 35.460 C 116.186 30.740 121.931 27.998 128.000 27.998 C 134.069 27.998 139.814 30.740 143.630 35.460 L 225.290 136.290 C 228.219 139.910 228.810 144.890 226.811 149.095 C 224.811 153.301 220.576 155.986 215.920 156.000 L 40.080 156.000 C 35.426 156.010 31.186 153.329 29.200 149.120 ZM 36.420 145.680 C 37.079 147.104 38.510 148.012 40.080 148.000 L 215.920 148.000 C 217.490 148.012 218.921 147.104 219.580 145.680 C 220.294 144.255 220.094 142.542 219.070 141.320 L 137.410 40.500 C 135.115 37.655 131.656 36.001 128.000 36.001 C 124.344 36.001 120.885 37.655 118.590 40.500 L 36.930 141.320 C 35.906 142.542 35.706 144.255 36.420 145.680 Z"),
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
        return _ejectSimple!!
    }

private var _ejectSimple: ImageVector? = null
