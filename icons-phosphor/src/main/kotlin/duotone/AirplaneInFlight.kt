package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.AirplaneInFlight: ImageVector
    get() {
        if (_airplaneInFlight != null) return _airplaneInFlight!!
        _airplaneInFlight = phosphorDuotoneIcon(
            name = "AirplaneInFlight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 240.000 136.000 L 240.000 160.000 L 61.060 160.000 C 46.930 160.000 34.472 150.733 30.410 137.200 L 16.340 90.300 C 15.613 87.878 16.074 85.255 17.583 83.226 C 19.092 81.197 21.471 80.001 24.000 80.000 L 32.000 80.000 L 56.000 104.000 L 92.910 104.000 L 80.420 66.530 C 79.607 64.092 80.015 61.412 81.517 59.326 C 83.018 57.240 85.430 56.003 88.000 56.000 L 96.000 56.000 L 144.000 104.000 L 208.000 104.000 C 225.673 104.000 240.000 118.327 240.000 136.000 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 224.000 216.000 C 224.000 220.418 220.418 224.000 216.000 224.000 L 72.000 224.000 C 67.582 224.000 64.000 220.418 64.000 216.000 C 64.000 211.582 67.582 208.000 72.000 208.000 L 216.000 208.000 C 220.418 208.000 224.000 211.582 224.000 216.000 ZM 248.000 136.000 L 248.000 160.000 C 248.000 164.418 244.418 168.000 240.000 168.000 L 61.070 168.000 C 43.378 168.081 27.762 156.460 22.760 139.490 L 8.690 92.600 C 7.237 87.758 8.157 82.514 11.173 78.456 C 14.188 74.398 18.944 72.005 24.000 72.000 L 32.000 72.000 C 34.119 72.001 36.151 72.843 37.650 74.340 L 59.320 96.000 L 81.810 96.000 L 72.810 69.060 C 71.183 64.179 72.002 58.813 75.012 54.640 C 78.022 50.467 82.855 47.996 88.000 48.000 L 96.000 48.000 C 98.122 47.998 100.158 48.840 101.660 50.340 L 147.320 96.000 L 208.000 96.000 C 230.091 96.000 248.000 113.909 248.000 136.000 ZM 232.000 136.000 C 232.000 122.745 221.255 112.000 208.000 112.000 L 144.000 112.000 C 141.881 111.999 139.849 111.157 138.350 109.660 L 92.690 64.000 L 88.000 64.000 L 100.490 101.470 C 101.303 103.908 100.895 106.588 99.393 108.674 C 97.892 110.760 95.480 111.997 92.910 112.000 L 56.000 112.000 C 53.878 112.002 51.842 111.160 50.340 109.660 L 28.690 88.000 L 24.000 88.000 L 38.070 134.900 C 41.075 145.085 50.451 152.056 61.070 152.000 L 232.000 152.000 Z"),
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
        return _airplaneInFlight!!
    }

private var _airplaneInFlight: ImageVector? = null
