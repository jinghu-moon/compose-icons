package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Orange: ImageVector
    get() {
        if (_orange != null) return _orange!!
        _orange = phosphorBoldIcon(
            name = "Orange",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 174.000 72.360 C 192.746 59.728 203.990 38.605 204.000 16.000 C 204.000 9.373 198.627 4.000 192.000 4.000 L 184.000 4.000 C 161.618 4.015 140.676 15.043 128.000 33.490 C 115.324 15.043 94.382 4.015 72.000 4.000 L 64.000 4.000 C 57.373 4.000 52.000 9.373 52.000 16.000 C 52.000 22.627 57.373 28.000 64.000 28.000 L 72.000 28.000 C 92.054 28.026 109.563 41.589 114.600 61.000 C 70.155 67.524 36.911 105.175 35.940 150.085 C 34.970 194.996 66.557 234.047 110.678 242.485 C 154.799 250.923 198.567 226.283 214.237 184.184 C 229.906 142.085 212.901 94.823 174.000 72.360 ZM 178.220 28.360 C 173.288 45.051 159.009 57.285 141.760 59.600 C 146.700 42.914 160.982 30.688 178.230 28.380 ZM 128.000 220.000 C 90.445 220.000 60.000 189.555 60.000 152.000 C 60.000 114.445 90.445 84.000 128.000 84.000 C 165.555 84.000 196.000 114.445 196.000 152.000 C 195.961 189.539 165.539 219.961 128.000 220.000 ZM 177.620 167.600 C 172.522 183.807 159.827 196.502 143.620 201.600 C 142.454 201.962 141.241 202.148 140.020 202.150 C 134.092 202.154 129.050 197.830 128.150 191.971 C 127.251 186.112 130.764 180.474 136.420 178.700 C 145.155 175.956 151.996 169.115 154.740 160.380 C 156.728 154.056 163.466 150.542 169.790 152.530 C 176.114 154.518 179.628 161.256 177.640 167.580 Z"),
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
        return _orange!!
    }

private var _orange: ImageVector? = null
