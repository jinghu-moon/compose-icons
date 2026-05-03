package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CloudLightning: ImageVector
    get() {
        if (_cloudLightning != null) return _cloudLightning!!
        _cloudLightning = phosphorBoldIcon(
            name = "CloudLightning",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 156.000 12.000 C 124.017 12.005 95.092 31.007 82.390 60.360 C 80.268 60.120 78.135 60.000 76.000 60.000 C 45.072 60.000 20.000 85.072 20.000 116.000 C 20.000 146.928 45.072 172.000 76.000 172.000 L 106.810 172.000 L 93.710 193.820 C 91.483 197.528 91.423 202.147 93.553 205.911 C 95.684 209.675 99.675 212.001 104.000 212.000 L 122.810 212.000 L 109.710 233.820 C 106.300 239.503 108.142 246.875 113.825 250.285 C 119.508 253.695 126.880 251.853 130.290 246.170 L 154.290 206.170 C 156.512 202.463 156.569 197.847 154.440 194.087 C 152.310 190.326 148.322 188.001 144.000 188.000 L 125.190 188.000 L 134.790 172.000 L 156.000 172.000 C 200.183 172.000 236.000 136.183 236.000 92.000 C 236.000 47.817 200.183 12.000 156.000 12.000 ZM 156.000 148.000 L 76.000 148.000 C 58.327 148.000 44.000 133.673 44.000 116.000 C 44.000 98.327 58.327 84.000 76.000 84.000 L 76.280 84.000 C 76.170 85.100 76.080 86.200 76.020 87.300 C 75.636 93.927 80.698 99.611 87.325 99.995 C 93.952 100.379 99.636 95.317 100.020 88.690 C 101.790 58.205 127.634 34.744 158.148 35.922 C 188.662 37.100 212.621 62.483 212.035 93.014 C 211.450 123.546 186.537 147.992 156.000 148.000 Z"),
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
        return _cloudLightning!!
    }

private var _cloudLightning: ImageVector? = null
