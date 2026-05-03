package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.WheelchairMotion: ImageVector
    get() {
        if (_wheelchairMotion != null) return _wheelchairMotion!!
        _wheelchairMotion = phosphorFillIcon(
            name = "WheelchairMotion",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 144.000 48.000 C 144.000 30.327 158.327 16.000 176.000 16.000 C 193.673 16.000 208.000 30.327 208.000 48.000 C 208.000 65.673 193.673 80.000 176.000 80.000 C 158.327 80.000 144.000 65.673 144.000 48.000 ZM 160.000 160.000 C 155.582 160.000 152.000 163.582 152.000 168.000 C 152.000 194.510 130.510 216.000 104.000 216.000 C 77.490 216.000 56.000 194.510 56.000 168.000 C 56.000 141.490 77.490 120.000 104.000 120.000 C 108.418 120.000 112.000 116.418 112.000 112.000 C 112.000 107.582 108.418 104.000 104.000 104.000 C 68.654 104.000 40.000 132.654 40.000 168.000 C 40.000 203.346 68.654 232.000 104.000 232.000 C 139.346 232.000 168.000 203.346 168.000 168.000 C 168.000 163.582 164.418 160.000 160.000 160.000 ZM 200.000 128.000 L 141.820 128.000 L 158.940 98.220 C 161.056 94.539 159.927 89.847 156.370 87.530 C 121.199 64.665 75.254 67.285 42.910 94.000 C 40.586 95.781 39.420 98.688 39.871 101.581 C 40.321 104.474 42.316 106.889 45.071 107.879 C 47.826 108.869 50.902 108.275 53.090 106.330 C 77.920 85.878 112.577 82.267 141.090 97.160 L 121.060 132.000 C 119.630 134.477 119.631 137.529 121.063 140.005 C 122.495 142.481 125.140 144.004 128.000 144.000 L 190.240 144.000 L 176.160 214.430 C 175.295 218.759 178.102 222.971 182.430 223.840 C 182.947 223.946 183.473 224.000 184.000 224.000 C 187.808 223.993 191.083 221.304 191.830 217.570 L 207.830 137.570 C 208.300 135.222 207.693 132.787 206.177 130.934 C 204.661 129.081 202.394 128.004 200.000 128.000 Z"),
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
        return _wheelchairMotion!!
    }

private var _wheelchairMotion: ImageVector? = null
