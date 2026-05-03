package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.AirplaneTaxiing: ImageVector
    get() {
        if (_airplaneTaxiing != null) return _airplaneTaxiing!!
        _airplaneTaxiing = phosphorFillIcon(
            name = "AirplaneTaxiing",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 248.000 136.000 L 248.000 160.000 C 248.000 164.418 244.418 168.000 240.000 168.000 L 61.070 168.000 C 43.378 168.081 27.762 156.460 22.760 139.490 L 8.690 92.600 C 7.237 87.758 8.157 82.514 11.173 78.456 C 14.188 74.398 18.944 72.005 24.000 72.000 L 32.000 72.000 C 34.119 72.001 36.151 72.843 37.650 74.340 L 59.320 96.000 L 81.810 96.000 L 72.810 69.060 C 71.183 64.179 72.002 58.813 75.012 54.640 C 78.022 50.467 82.855 47.996 88.000 48.000 L 96.000 48.000 C 98.122 47.998 100.158 48.840 101.660 50.340 L 147.320 96.000 L 208.000 96.000 C 230.091 96.000 248.000 113.909 248.000 136.000 ZM 208.000 184.000 C 199.163 184.000 192.000 191.163 192.000 200.000 C 192.000 208.837 199.163 216.000 208.000 216.000 C 216.837 216.000 224.000 208.837 224.000 200.000 C 224.000 191.163 216.837 184.000 208.000 184.000 ZM 112.000 184.000 C 103.163 184.000 96.000 191.163 96.000 200.000 C 96.000 208.837 103.163 216.000 112.000 216.000 C 120.837 216.000 128.000 208.837 128.000 200.000 C 128.000 191.163 120.837 184.000 112.000 184.000 Z"),
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
