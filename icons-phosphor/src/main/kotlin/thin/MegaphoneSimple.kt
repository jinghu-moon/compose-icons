package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.MegaphoneSimple: ImageVector
    get() {
        if (_megaphoneSimple != null) return _megaphoneSimple!!
        _megaphoneSimple = phosphorThinIcon(
            name = "MegaphoneSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 227.410 90.500 L 51.410 36.500 C 47.781 35.424 43.857 36.124 40.823 38.388 C 37.789 40.652 36.002 44.215 36.000 48.000 L 36.000 192.000 C 36.000 198.627 41.373 204.000 48.000 204.000 C 49.168 203.996 50.329 203.828 51.450 203.500 L 140.000 176.320 L 140.000 192.000 C 140.000 198.627 145.373 204.000 152.000 204.000 L 184.000 204.000 C 190.627 204.000 196.000 198.627 196.000 192.000 L 196.000 159.140 L 227.390 149.510 C 232.483 147.990 235.980 143.315 236.000 138.000 L 236.000 102.000 C 235.998 96.688 232.503 92.010 227.410 90.500 ZM 49.120 195.840 C 47.911 196.193 46.607 195.955 45.600 195.200 C 44.593 194.445 44.000 193.259 44.000 192.000 L 44.000 48.000 C 44.000 46.741 44.593 45.555 45.600 44.800 C 46.292 44.281 47.135 44.000 48.000 44.000 C 48.362 44.000 48.722 44.050 49.070 44.150 L 140.000 72.050 L 140.000 168.000 ZM 188.000 192.000 C 188.000 194.209 186.209 196.000 184.000 196.000 L 152.000 196.000 C 149.791 196.000 148.000 194.209 148.000 192.000 L 148.000 173.870 L 188.000 161.600 ZM 228.000 138.000 C 228.000 139.778 226.827 141.342 225.120 141.840 L 225.070 141.840 L 148.000 165.500 L 148.000 74.500 L 225.120 98.160 C 226.827 98.658 228.000 100.222 228.000 102.000 Z"),
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
        return _megaphoneSimple!!
    }

private var _megaphoneSimple: ImageVector? = null
