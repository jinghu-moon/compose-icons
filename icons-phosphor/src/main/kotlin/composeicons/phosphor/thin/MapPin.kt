package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.MapPin: ImageVector
    get() {
        if (_mapPin != null) return _mapPin!!
        _mapPin = phosphorThinIcon(
            name = "MapPin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 68C108.118 68 92 84.118 92 104c0 19.882 16.118 36 36 36 19.882 0 36-16.118 36-36C164 84.118 147.882 68 128 68ZM128 132c-15.464 0-28-12.536-28-28 0-15.464 12.536-28 28-28 15.464 0 28 12.536 28 28 0 15.464-12.536 28-28 28ZM128 20C81.629 20.05 44.05 57.629 44 104c0 30.42 14.17 62.79 41 93.62 12.138 14.025 25.798 26.656 40.73 37.66 1.376 .961 3.204 .961 4.58 0C145.228 224.274 158.875 211.643 171 197.62 197.81 166.79 212 134.42 212 104 211.95 57.629 174.371 20.05 128 20ZM165.1 192.23C153.924 205.029 141.496 216.677 128 227 114.502 216.664 102.074 205.003 90.9 192.19 73.15 171.8 52 139.9 52 104 52 62.026 86.026 28 128 28c41.974 0 76 34.026 76 76 0 35.9-21.15 67.8-38.9 88.23Z"),
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
        return _mapPin!!
    }

private var _mapPin: ImageVector? = null
