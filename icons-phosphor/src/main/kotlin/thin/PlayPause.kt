package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PlayPause: ImageVector
    get() {
        if (_playPause != null) return _playPause!!
        _playPause = phosphorThinIcon(
            name = "PlayPause",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 180.000 64.000 L 180.000 192.000 C 180.000 194.209 178.209 196.000 176.000 196.000 C 173.791 196.000 172.000 194.209 172.000 192.000 L 172.000 64.000 C 172.000 61.791 173.791 60.000 176.000 60.000 C 178.209 60.000 180.000 61.791 180.000 64.000 ZM 224.000 60.000 C 221.791 60.000 220.000 61.791 220.000 64.000 L 220.000 192.000 C 220.000 194.209 221.791 196.000 224.000 196.000 C 226.209 196.000 228.000 194.209 228.000 192.000 L 228.000 64.000 C 228.000 61.791 226.209 60.000 224.000 60.000 ZM 140.000 128.000 C 140.020 132.055 137.949 135.834 134.520 138.000 L 46.330 194.120 C 42.643 196.455 37.979 196.605 34.150 194.510 C 30.336 192.465 27.969 188.477 28.000 184.150 L 28.000 71.850 C 27.969 67.523 30.336 63.535 34.150 61.490 C 37.979 59.395 42.643 59.545 46.330 61.880 L 134.520 118.000 C 137.949 120.166 140.020 123.945 140.000 128.000 ZM 132.000 128.000 C 132.006 126.690 131.332 125.471 130.220 124.780 L 42.000 68.630 C 41.377 68.227 40.652 68.009 39.910 68.000 C 39.242 68.004 38.585 68.176 38.000 68.500 C 36.761 69.156 35.990 70.448 36.000 71.850 L 36.000 184.150 C 35.990 185.552 36.761 186.844 38.000 187.500 C 39.256 188.194 40.792 188.144 42.000 187.370 L 130.180 131.220 C 131.308 130.538 131.998 129.318 132.000 128.000 Z"),
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
        return _playPause!!
    }

private var _playPause: ImageVector? = null
