package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FunnelX: ImageVector
    get() {
        if (_funnelX != null) return _funnelX!!
        _funnelX = phosphorThinIcon(
            name = "FunnelX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 227.000 51.150 C 225.105 46.771 220.771 43.954 216.000 44.000 L 40.000 44.000 C 35.251 44.000 30.949 46.802 29.027 51.145 C 27.106 55.488 27.926 60.555 31.120 64.070 L 31.170 64.120 L 100.000 137.590 L 100.000 216.000 C 99.996 220.426 102.429 224.495 106.329 226.587 C 110.230 228.678 114.966 228.453 118.650 226.000 L 150.650 204.670 C 153.992 202.441 155.996 198.687 155.990 194.670 L 155.990 137.590 L 224.850 64.070 C 228.103 60.589 228.950 55.497 227.000 51.150 ZM 219.000 58.650 L 149.090 133.270 C 148.393 134.009 148.004 134.985 148.000 136.000 L 148.000 194.650 C 148.001 195.988 147.333 197.238 146.220 197.980 L 114.220 219.310 C 112.995 220.127 111.421 220.205 110.121 219.514 C 108.821 218.822 108.006 217.472 108.000 216.000 L 108.000 136.000 C 107.999 134.981 107.609 134.001 106.910 133.260 L 37.050 58.670 C 36.000 57.499 35.734 55.821 36.370 54.382 C 37.006 52.943 38.427 52.011 40.000 52.000 L 216.000 52.000 C 217.574 51.999 219.003 52.920 219.650 54.355 C 220.297 55.790 220.043 57.471 219.000 58.650 ZM 242.840 213.180 C 244.403 214.743 244.403 217.277 242.840 218.840 C 241.277 220.403 238.743 220.403 237.180 218.840 L 216.000 197.670 L 194.830 218.840 C 193.267 220.403 190.733 220.403 189.170 218.840 C 187.607 217.277 187.607 214.743 189.170 213.180 L 210.340 192.000 L 189.170 170.830 C 187.607 169.267 187.607 166.733 189.170 165.170 C 190.733 163.607 193.267 163.607 194.830 165.170 L 216.000 186.350 L 237.170 165.180 C 238.733 163.617 241.267 163.617 242.830 165.180 C 244.393 166.743 244.393 169.277 242.830 170.840 L 221.660 192.000 Z"),
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
        return _funnelX!!
    }

private var _funnelX: ImageVector? = null
