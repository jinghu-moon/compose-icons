package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.HandbagSimple: ImageVector
    get() {
        if (_handbagSimple != null) return _handbagSimple!!
        _handbagSimple = phosphorThinIcon(
            name = "HandbagSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 235.920 198.590 L 221.660 78.590 C 220.942 72.519 215.774 67.958 209.660 68.000 L 172.000 68.000 L 172.000 64.000 C 172.000 39.699 152.301 20.000 128.000 20.000 C 103.699 20.000 84.000 39.699 84.000 64.000 L 84.000 68.000 L 46.330 68.000 C 40.216 67.958 35.048 72.519 34.330 78.590 L 20.070 198.590 C 19.672 201.982 20.737 205.382 23.000 207.940 C 25.306 210.531 28.612 212.009 32.080 212.000 L 223.920 212.000 C 227.381 212.004 230.679 210.526 232.980 207.940 C 235.246 205.384 236.316 201.983 235.920 198.590 ZM 92.000 64.000 C 92.000 44.118 108.118 28.000 128.000 28.000 C 147.882 28.000 164.000 44.118 164.000 64.000 L 164.000 68.000 L 92.000 68.000 ZM 227.000 202.630 C 226.219 203.509 225.096 204.009 223.920 204.000 L 32.080 204.000 C 30.904 204.009 29.781 203.509 29.000 202.630 C 28.233 201.794 27.868 200.666 28.000 199.540 L 42.250 79.540 C 42.485 77.512 44.209 75.986 46.250 76.000 L 209.670 76.000 C 211.730 75.961 213.483 77.493 213.720 79.540 L 227.970 199.540 C 228.110 200.662 227.756 201.789 227.000 202.630 Z"),
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
        return _handbagSimple!!
    }

private var _handbagSimple: ImageVector? = null
