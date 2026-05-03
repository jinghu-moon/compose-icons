package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.AppStoreLogo: ImageVector
    get() {
        if (_appStoreLogo != null) return _appStoreLogo!!
        _appStoreLogo = phosphorBoldIcon(
            name = "AppStoreLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 244.000 160.000 C 244.000 166.627 238.627 172.000 232.000 172.000 L 200.670 172.000 L 218.330 201.890 C 220.572 205.584 220.655 210.198 218.548 213.970 C 216.441 217.742 212.468 220.090 208.147 220.117 C 203.826 220.144 199.824 217.846 197.670 214.100 L 140.900 118.000 C 137.721 112.312 139.662 105.126 145.273 101.812 C 150.884 98.499 158.114 100.269 161.560 105.800 L 186.480 148.000 L 232.000 148.000 C 238.627 148.000 244.000 153.373 244.000 160.000 ZM 133.150 148.000 L 97.390 148.000 L 162.330 38.110 C 164.572 34.416 164.655 29.802 162.548 26.030 C 160.441 22.258 156.468 19.910 152.147 19.883 C 147.826 19.856 143.824 22.154 141.670 25.900 L 128.000 49.000 L 114.330 25.900 C 112.176 22.154 108.174 19.856 103.853 19.883 C 99.532 19.910 95.559 22.258 93.452 26.030 C 91.345 29.802 91.428 34.416 93.670 38.110 L 114.060 72.620 L 69.520 148.000 L 24.000 148.000 C 17.373 148.000 12.000 153.373 12.000 160.000 C 12.000 166.627 17.373 172.000 24.000 172.000 L 133.150 172.000 C 139.777 172.000 145.150 166.627 145.150 160.000 C 145.150 153.373 139.777 148.000 133.150 148.000 ZM 58.830 189.670 C 53.127 186.301 45.774 188.190 42.400 193.890 L 37.670 201.890 C 35.428 205.584 35.345 210.198 37.452 213.970 C 39.559 217.742 43.532 220.090 47.853 220.117 C 52.174 220.144 56.176 217.846 58.330 214.100 L 63.060 206.100 C 66.427 200.395 64.533 193.040 58.830 189.670 Z"),
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
        return _appStoreLogo!!
    }

private var _appStoreLogo: ImageVector? = null
