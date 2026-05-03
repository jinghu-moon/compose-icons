package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.AirplaneTaxiing: ImageVector
    get() {
        if (_airplaneTaxiing != null) return _airplaneTaxiing!!
        _airplaneTaxiing = phosphorRegularIcon(
            name = "AirplaneTaxiing",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 96.000 L 147.320 96.000 L 101.660 50.340 C 100.158 48.840 98.122 47.998 96.000 48.000 L 88.000 48.000 C 82.858 48.003 78.031 50.476 75.026 54.648 C 72.021 58.820 71.204 64.182 72.830 69.060 L 81.830 96.000 L 59.320 96.000 L 37.660 74.340 C 36.158 72.840 34.122 71.998 32.000 72.000 L 24.000 72.000 C 18.944 72.005 14.188 74.398 11.173 78.456 C 8.157 82.514 7.237 87.758 8.690 92.600 L 22.760 139.490 C 27.762 156.460 43.378 168.081 61.070 168.000 L 240.000 168.000 C 244.418 168.000 248.000 164.418 248.000 160.000 L 248.000 136.000 C 248.000 113.909 230.091 96.000 208.000 96.000 ZM 232.000 152.000 L 61.070 152.000 C 50.451 152.056 41.075 145.085 38.070 134.900 L 24.000 88.000 L 28.680 88.000 L 50.340 109.660 C 51.842 111.160 53.878 112.002 56.000 112.000 L 92.900 112.000 C 95.472 112.000 97.887 110.764 99.390 108.678 C 100.894 106.592 101.303 103.910 100.490 101.470 L 88.000 64.000 L 92.680 64.000 L 138.340 109.660 C 139.842 111.160 141.878 112.002 144.000 112.000 L 208.000 112.000 C 221.255 112.000 232.000 122.745 232.000 136.000 ZM 224.000 200.000 C 224.000 208.837 216.837 216.000 208.000 216.000 C 199.163 216.000 192.000 208.837 192.000 200.000 C 192.000 191.163 199.163 184.000 208.000 184.000 C 216.837 184.000 224.000 191.163 224.000 200.000 ZM 128.000 200.000 C 128.000 208.837 120.837 216.000 112.000 216.000 C 103.163 216.000 96.000 208.837 96.000 200.000 C 96.000 191.163 103.163 184.000 112.000 184.000 C 120.837 184.000 128.000 191.163 128.000 200.000 Z"),
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
        return _airplaneTaxiing!!
    }

private var _airplaneTaxiing: ImageVector? = null
