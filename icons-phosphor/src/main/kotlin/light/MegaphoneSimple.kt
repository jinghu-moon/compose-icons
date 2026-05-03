package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.MegaphoneSimple: ImageVector
    get() {
        if (_megaphoneSimple != null) return _megaphoneSimple!!
        _megaphoneSimple = phosphorLightIcon(
            name = "MegaphoneSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 228.000 88.590 L 51.920 34.590 C 47.695 33.358 43.136 34.184 39.612 36.821 C 36.088 39.458 34.009 43.599 34.000 48.000 L 34.000 192.000 C 34.000 199.732 40.268 206.000 48.000 206.000 C 49.354 205.990 50.701 205.791 52.000 205.410 L 138.000 179.000 L 138.000 192.000 C 138.000 199.732 144.268 206.000 152.000 206.000 L 184.000 206.000 C 191.732 206.000 198.000 199.732 198.000 192.000 L 198.000 160.620 L 228.000 151.430 C 233.924 149.640 237.983 144.189 238.000 138.000 L 238.000 102.000 C 237.997 95.811 233.931 90.358 228.000 88.590 ZM 48.560 193.920 C 47.956 194.096 47.304 193.978 46.800 193.600 C 46.296 193.222 46.000 192.630 46.000 192.000 L 46.000 48.000 C 46.000 47.370 46.296 46.778 46.800 46.400 C 47.148 46.144 47.568 46.004 48.000 46.000 C 48.166 46.004 48.331 46.031 48.490 46.080 L 138.000 73.530 L 138.000 166.480 ZM 186.000 192.000 C 186.000 193.105 185.105 194.000 184.000 194.000 L 152.000 194.000 C 150.895 194.000 150.000 193.105 150.000 192.000 L 150.000 175.350 L 186.000 164.350 ZM 226.000 138.000 C 226.000 138.889 225.413 139.671 224.560 139.920 L 224.480 139.920 L 150.000 162.800 L 150.000 77.210 L 224.560 100.080 C 225.413 100.329 226.000 101.111 226.000 102.000 Z"),
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
        return _megaphoneSimple!!
    }

private var _megaphoneSimple: ImageVector? = null
