package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.WheelchairMotion: ImageVector
    get() {
        if (_wheelchairMotion != null) return _wheelchairMotion!!
        _wheelchairMotion = phosphorRegularIcon(
            name = "WheelchairMotion",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 176.000 80.000 C 193.673 80.000 208.000 65.673 208.000 48.000 C 208.000 30.327 193.673 16.000 176.000 16.000 C 158.327 16.000 144.000 30.327 144.000 48.000 C 144.000 65.673 158.327 80.000 176.000 80.000 ZM 176.000 32.000 C 184.837 32.000 192.000 39.163 192.000 48.000 C 192.000 56.837 184.837 64.000 176.000 64.000 C 167.163 64.000 160.000 56.837 160.000 48.000 C 160.000 39.163 167.163 32.000 176.000 32.000 ZM 168.000 168.000 C 168.000 203.346 139.346 232.000 104.000 232.000 C 68.654 232.000 40.000 203.346 40.000 168.000 C 40.000 132.654 68.654 104.000 104.000 104.000 C 108.418 104.000 112.000 107.582 112.000 112.000 C 112.000 116.418 108.418 120.000 104.000 120.000 C 77.490 120.000 56.000 141.490 56.000 168.000 C 56.000 194.510 77.490 216.000 104.000 216.000 C 130.510 216.000 152.000 194.510 152.000 168.000 C 152.000 163.582 155.582 160.000 160.000 160.000 C 164.418 160.000 168.000 163.582 168.000 168.000 ZM 206.190 130.930 C 207.706 132.785 208.312 135.221 207.840 137.570 L 191.840 217.570 C 191.092 221.307 187.811 223.998 184.000 224.000 C 183.469 224.001 182.940 223.947 182.420 223.840 C 178.092 222.971 175.285 218.759 176.150 214.430 L 190.240 144.000 L 128.000 144.000 C 125.140 144.004 122.495 142.481 121.063 140.005 C 119.631 137.529 119.630 134.477 121.060 132.000 L 141.120 97.100 C 112.607 82.207 77.950 85.818 53.120 106.270 C 50.959 108.335 47.826 109.023 44.999 108.053 C 42.171 107.084 40.120 104.619 39.680 101.662 C 39.241 98.705 40.487 95.750 42.910 94.000 C 75.265 67.301 121.209 64.701 156.370 87.580 C 159.927 89.897 161.056 94.589 158.940 98.270 L 141.820 128.000 L 200.000 128.000 C 202.398 127.999 204.670 129.075 206.190 130.930 Z"),
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
