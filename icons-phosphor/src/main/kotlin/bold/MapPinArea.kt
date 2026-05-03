package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.MapPinArea: ImageVector
    get() {
        if (_mapPinArea != null) return _mapPinArea!!
        _mapPinArea = phosphorBoldIcon(
            name = "MapPinArea",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 108.000 80.000 C 108.000 68.954 116.954 60.000 128.000 60.000 C 139.046 60.000 148.000 68.954 148.000 80.000 C 148.000 91.046 139.046 100.000 128.000 100.000 C 116.954 100.000 108.000 91.046 108.000 80.000 ZM 60.000 80.000 C 60.000 42.445 90.445 12.000 128.000 12.000 C 165.555 12.000 196.000 42.445 196.000 80.000 C 196.000 142.250 136.490 177.000 133.950 178.420 C 130.263 180.525 125.737 180.525 122.050 178.420 C 119.510 177.000 60.000 142.250 60.000 80.000 ZM 84.000 80.000 C 84.000 118.200 114.710 144.200 128.000 153.640 C 141.210 144.150 172.000 118.000 172.000 80.000 C 172.000 55.699 152.301 36.000 128.000 36.000 C 103.699 36.000 84.000 55.699 84.000 80.000 ZM 208.570 145.600 C 204.596 143.914 200.022 144.492 196.592 147.115 C 193.163 149.738 191.407 154.001 191.994 158.278 C 192.581 162.556 195.421 166.188 199.430 167.790 C 213.560 173.610 220.000 180.270 220.000 184.000 C 220.000 188.000 212.870 195.070 197.230 201.080 C 178.930 208.080 154.340 212.000 128.000 212.000 C 101.660 212.000 77.070 208.120 58.770 201.080 C 43.120 195.070 36.000 188.000 36.000 184.000 C 36.000 180.270 42.440 173.610 56.570 167.790 C 60.579 166.188 63.419 162.556 64.006 158.278 C 64.593 154.001 62.837 149.738 59.408 147.115 C 55.978 144.492 51.404 143.914 47.430 145.600 C 31.270 152.250 12.000 164.310 12.000 184.000 C 12.000 218.140 70.360 236.000 128.000 236.000 C 157.220 236.000 184.860 231.560 205.850 223.480 C 220.100 218.000 244.000 205.590 244.000 184.000 C 244.000 164.310 224.730 152.250 208.570 145.600 Z"),
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
        return _mapPinArea!!
    }

private var _mapPinArea: ImageVector? = null
