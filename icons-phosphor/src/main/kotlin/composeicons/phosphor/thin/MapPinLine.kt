package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.MapPinLine: ImageVector
    get() {
        if (_mapPinLine != null) return _mapPinLine!!
        _mapPinLine = phosphorThinIcon(
            name = "MapPinLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 228h-60.28c11.248-9.246 21.71-19.407 31.28-30.38C197.81 166.79 212 134.42 212 104 212 57.608 174.392 20 128 20 81.608 20 44 57.608 44 104c0 30.42 14.17 62.79 41 93.62 9.57 10.973 20.032 21.134 31.28 30.38h-60.28c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h144c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM90.9 192.23C73.15 171.8 52 139.9 52 104 52 62.026 86.026 28 128 28c41.974 0 76 34.026 76 76 0 35.9-21.15 67.8-38.9 88.23C153.924 205.029 141.496 216.677 128 227 114.504 216.677 102.076 205.029 90.9 192.23ZM164 104C164 84.118 147.882 68 128 68 108.118 68 92 84.118 92 104c0 19.882 16.118 36 36 36 19.882 0 36-16.118 36-36ZM100 104c0-15.464 12.536-28 28-28 15.464 0 28 12.536 28 28 0 15.464-12.536 28-28 28-15.464 0-28-12.536-28-28Z"),
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
        return _mapPinLine!!
    }

private var _mapPinLine: ImageVector? = null
