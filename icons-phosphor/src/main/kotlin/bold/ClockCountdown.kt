package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ClockCountdown: ImageVector
    get() {
        if (_clockCountdown != null) return _clockCountdown!!
        _clockCountdown = phosphorBoldIcon(
            name = "ClockCountdown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 236.000 137.000 C 231.087 194.106 182.469 237.457 125.175 235.818 C 67.882 234.179 21.821 188.118 20.182 130.825 C 18.543 73.531 61.894 24.913 119.000 20.000 C 125.627 19.448 131.448 24.373 132.000 31.000 C 132.552 37.627 127.627 43.448 121.000 44.000 C 76.568 47.810 42.830 85.633 44.102 130.211 C 45.373 174.788 81.212 210.627 125.789 211.898 C 170.367 213.170 208.190 179.432 212.000 135.000 C 212.552 128.373 218.373 123.448 225.000 124.000 C 231.627 124.552 236.552 130.373 236.000 137.000 ZM 116.000 76.000 L 116.000 128.000 C 116.000 134.627 121.373 140.000 128.000 140.000 L 180.000 140.000 C 186.627 140.000 192.000 134.627 192.000 128.000 C 192.000 121.373 186.627 116.000 180.000 116.000 L 140.000 116.000 L 140.000 76.000 C 140.000 69.373 134.627 64.000 128.000 64.000 C 121.373 64.000 116.000 69.373 116.000 76.000 ZM 208.000 96.000 C 216.837 96.000 224.000 88.837 224.000 80.000 C 224.000 71.163 216.837 64.000 208.000 64.000 C 199.163 64.000 192.000 71.163 192.000 80.000 C 192.000 88.837 199.163 96.000 208.000 96.000 ZM 176.000 64.000 C 184.837 64.000 192.000 56.837 192.000 48.000 C 192.000 39.163 184.837 32.000 176.000 32.000 C 167.163 32.000 160.000 39.163 160.000 48.000 C 160.000 56.837 167.163 64.000 176.000 64.000 Z"),
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
        return _clockCountdown!!
    }

private var _clockCountdown: ImageVector? = null
