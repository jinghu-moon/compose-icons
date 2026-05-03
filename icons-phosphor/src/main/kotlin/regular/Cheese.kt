package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Cheese: ImageVector
    get() {
        if (_cheese != null) return _cheese!!
        _cheese = phosphorRegularIcon(
            name = "Cheese",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 184.000 32.000 C 183.221 31.998 182.445 32.113 181.700 32.340 L 21.700 80.340 L 21.700 80.340 C 18.318 81.355 16.001 84.468 16.000 88.000 L 16.000 112.000 C 16.000 116.418 19.582 120.000 24.000 120.000 L 32.000 120.000 C 40.700 120.041 47.789 126.993 48.000 135.690 C 48.072 139.925 46.419 144.008 43.420 147.000 C 40.257 150.221 35.935 152.040 31.420 152.050 L 24.000 152.050 C 19.582 152.050 16.000 155.632 16.000 160.050 L 16.000 192.050 C 16.000 196.468 19.582 200.050 24.000 200.050 L 224.000 200.050 C 232.837 200.050 240.000 192.887 240.000 184.050 L 240.000 88.000 C 239.967 57.086 214.914 32.033 184.000 32.000 ZM 185.120 48.000 C 203.696 48.545 219.459 61.794 223.190 80.000 L 78.510 80.000 ZM 192.000 104.000 C 192.008 113.559 186.344 122.211 177.580 126.026 C 168.816 129.841 158.623 128.092 151.632 121.574 C 144.641 115.055 142.185 105.009 145.380 96.000 L 190.620 96.000 C 191.534 98.568 192.000 101.274 192.000 104.000 ZM 88.000 184.000 C 88.000 170.745 98.745 160.000 112.000 160.000 C 125.255 160.000 136.000 170.745 136.000 184.000 ZM 224.000 184.000 L 152.000 184.000 C 152.000 161.909 134.091 144.000 112.000 144.000 C 89.909 144.000 72.000 161.909 72.000 184.000 L 32.000 184.000 L 32.000 168.000 C 40.607 167.821 48.803 164.287 54.840 158.150 C 60.857 152.118 64.163 143.899 64.000 135.380 C 63.583 117.984 49.401 104.076 32.000 104.000 L 32.000 96.000 L 128.810 96.000 C 125.560 111.901 132.241 128.189 145.719 137.229 C 159.198 146.269 176.802 146.269 190.281 137.229 C 203.759 128.189 210.440 111.901 207.190 96.000 L 224.000 96.000 Z"),
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
        return _cheese!!
    }

private var _cheese: ImageVector? = null
